package ru.naztrans.elcom.dao;

import ru.naztrans.elcom.entity.User;
import ru.naztrans.elcom.entity.Role;
import ru.naztrans.elcom.enums.Roles;

import javax.ejb.Stateless;
import java.util.List;
@Stateless
public class UserDAO extends AbstractDAO{


    public User persist(User user){
        if (user==null) return null;
        em.persist(user);
        return user;
    }
    public User merge(User user) {
        if (user==null) return null;
        return em.merge(user);
    }

    public void removeUserById(String id){
        User user = getUserById(id);
        if (user==null) return;
        em.remove(user);
    }

    public User getUserById(String id){
        if (id==null || id.isEmpty()) return null;
        return getEntity(em.createQuery("select u from User u where u.id=:id", User.class).setParameter("id", id).setMaxResults(1));
    }

    public User getUserByLogin(String login) {
        if (login==null||login.isEmpty()) return null;
        return getEntity(em.createQuery("select u from User u where u.login=:login", User.class).setParameter("login", login).setMaxResults(1));
    }

    public Role rolePersist(Role role){
        if (role==null) return null;
        em.persist(role);
        return role;
    }
    public Role roleMerge(Role role){
        if (role==null) return null;
        return em.merge(role);
    }
    public Role getUserRolebyRole(String uId, Roles roles){
        if (uId==null||uId.isEmpty()) return null;
        return getEntity(em.createQuery("select r from Role r where r.user.id=:id and r.role=:roles", Role.class)
                .setParameter("id", uId)
                .setParameter("roles", roles).setMaxResults(1));
    }
    public void removeUserRole(String userId, Roles roles){
        if (userId==null || userId.isEmpty()) return ;
        Role role = getUserRolebyRole(userId, roles);
        if (role==null) return;
        em.remove(role);
    }
    public List<Role> getAllRolesFromUserByUserId (String userId){
        if (userId==null || userId.isEmpty()) return null;
        return em.createQuery("SELECT e FROM Role e where e.user.id=:id", Role.class).setParameter("id", userId).getResultList();
    }

}
