package com.tomek.hibernate;

import com.tomek.hibernate.implement.UserDAOImpl;
import com.tomek.hibernate.model.User;

public class Main {
    public static void main(String[] args) {
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        User user = new User();
        user.setName("jan");
        user.setSurname("kowalski");

        userDAOImpl.insertUser(user);
        userDAOImpl.getAllUsers();
    }
}
