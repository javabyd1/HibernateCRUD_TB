package com.tomek.hibernate.implement;

import com.tomek.hibernate.interfaces.UserDAO;
import com.tomek.hibernate.model.User;
import com.tomek.hibernate.utility.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    private Session session = HibernateUtility.getHibernateSession();

    @Override
    public User insertUser(User user) {
        try {
            System.out.println(user.getName() + " " + user.getSurname());
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(int id, String name, String surname) {

    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public User findUser(int id) {
        return null;
    }
}
