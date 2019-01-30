package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dto.SessionDTO;
import ru.naztrans.elcom.security.SecurityService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.jms.Session;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@ViewScoped
@ManagedBean
public class ShowLoginUserController {

    public SessionDTO getSessionDTO() {
        return sessionDTO;
    }

    public void setSessionDTO(SessionDTO sessionDTO) {
        this.sessionDTO = sessionDTO;
    }

    private SessionDTO sessionDTO;

    public void init() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        Cookie[] cookies = request.getCookies();
        if (cookies == null) return;
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("token")) {

                try {
                    sessionDTO = SessionDTO.parse(cookies[i].getValue(), SecurityService.SECRET);
                } catch (Exception e) {
                    return;
                }
            }

        }

    }
}
