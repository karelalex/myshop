package ru.naztrans.elcom.entity;

import ru.naztrans.elcom.enums.Roles;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Role {
    @Id
    private String id=UUID.randomUUID().toString();

    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private Roles role;

    public Role() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
