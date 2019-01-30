package ru.naztrans.elcom.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.naztrans.elcom.security.SecurityService;

import java.util.ArrayList;
import java.util.List;

public class SessionDTO {

    private String login;
    private String userName;
    private String userId;
    private List<String> roles = new ArrayList<>();

    public SessionDTO() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String toToken(final String secret) throws Exception {
        final String json = new ObjectMapper().writeValueAsString(this);
        final String token = SecurityService.encrypt(json, secret);
        return token;
    }


    public static SessionDTO parse(final String token, final String secret) throws Exception {
        final String json = SecurityService.decrypt(token, secret);
        return new ObjectMapper().readValue(json, SessionDTO.class);
    }

    public boolean hasRole(final String role) {
        if (role == null || role.isEmpty()) return false;
        return roles.contains(role);
    }
    public void addRole( final String role) {
        if (role == null || role.isEmpty()) return;
        roles.add(role);
    }
}
