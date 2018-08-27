package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.UserDAO;
import ru.naztrans.elcom.entity.User;
import ru.naztrans.elcom.security.SecurityService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class CreateUserController {
    @Inject
    UserDAO userDAO;
    private User user = new User();
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

    public String getDoublePass() {
        return doublePass;
    }

    public void setDoublePass(String doublePass) {
        this.doublePass = doublePass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String doublePass;
    private String name;

    public void createUser(){
        if (userDAO.getUserByLogin(login)!=null) return;
        if(pass.equals(doublePass)){
            user.setName(name);
            user.setLogin(login);
            user.setPasswordHash(SecurityService.getHash(pass));
            userDAO.persist(user);
        }
    }
}
