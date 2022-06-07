package com.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.service.UsersService;
@RestController
public class UsersController {
@Autowired
private UsersService usersService;
@RequestMapping("/getUsers")
public ResponseEntity<Object> getAllUsers() {
return usersService.getAllUsers();
}
}
