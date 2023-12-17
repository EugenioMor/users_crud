package com.userslist.crud.service;

import com.userslist.crud.model.User;
import java.util.List;

public interface IUserService {

    public List<User> getusers();
    public User getUserById(Long id);
    public User saveUser(User user);
    public User editUser(User user);
    public void deleteUser(Long id);
}
