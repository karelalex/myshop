package ru.naztrans.elcom.controller;

import com.sun.net.httpserver.Headers;
import ru.naztrans.elcom.dao.UserDAO;
import ru.naztrans.elcom.dto.SessionDTO;
import ru.naztrans.elcom.entity.Role;
import ru.naztrans.elcom.entity.User;
import ru.naztrans.elcom.security.SecurityService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@ViewScoped
@ManagedBean
public class LoginLogoutController {
    final String FAIL_ADDRESS = "no-login.xhtml";


    @Inject
    UserDAO userDAO;
    private String login;
    private String pass;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void logout() {
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.addHeader("Set-Cookie", "token=");
    }
    public String login(){
        return login(login, pass);
    }
    public String login(String login, String pass) {
        if (login == null || login.isEmpty()) return FAIL_ADDRESS;
        if (pass == null || pass.isEmpty()) return FAIL_ADDRESS;
        final User user = userDAO.getUserByLogin(login);
        if (user == null) return FAIL_ADDRESS;

        final String passwordHash = SecurityService.getHash(pass);
        if (passwordHash == null || passwordHash.isEmpty()) return FAIL_ADDRESS;
        final boolean passwordCheck = passwordHash.equals(user.getPasswordHash());
        if (!passwordCheck) return null;

        final SessionDTO session = new SessionDTO();

        session.setLogin(login);
        session.setUserId(user.getId());
        session.setLogin(user.getLogin());
        final List<Role> roles = userDAO.getAllRolesFromUserByUserId(user.getId());
        for (final Role role : roles) session.addRole(role.getRole().name());
        String token;
        try {
             token = session.toToken(SecurityService.SECRET);
        }
        catch (Exception e){
            return FAIL_ADDRESS;
        }

        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.addHeader("Set-Cookie", "token=" + token);
        return "show-login-user.xhtml";
    }
}
