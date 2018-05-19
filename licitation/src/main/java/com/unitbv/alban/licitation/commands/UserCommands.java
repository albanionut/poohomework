package com.unitbv.alban.licitation.commands;

import com.unitbv.alban.licitation.model.User;
import com.unitbv.alban.licitation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class UserCommands {
    @Autowired
    private UserService userService;

    @ShellMethod("connect in to the app: connect --username test --password test")
    public String connect(String username, String password){
    return "connected";
    }

    @ShellMethod("list users")
    public Iterable<User> listUsers(){
        return userService.getAllUsers();
    }



}
