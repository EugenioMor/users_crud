package com.userslist.crud.controller;

import com.userslist.crud.model.User;
import com.userslist.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users", userService.getusers());
        return "users"; //we return to user's file
    }

    @GetMapping("/users/new")
    public String showUserFormNew(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "create_user";
    }

    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String showUserFormNew(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "edit_user";
    }

    @PostMapping("/users/{id}")
    public String edituser(@PathVariable Long id, @ModelAttribute("user") User user, Model model){
        User existentUser = userService.getUserById(id);
        existentUser.setId(id);
        existentUser.setName(user.getName());
        existentUser.setLastname(user.getLastname());
        existentUser.setEmail(user.getEmail());

        userService.editUser(existentUser);
        return "redirect:/users";
    }

    @GetMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
