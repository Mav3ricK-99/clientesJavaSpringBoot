package com.votacion.controller;

import com.votacion.model.User;
import com.votacion.model.UserDTO;
import com.votacion.services.UserServiceImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private ModelMapper modelMapper;

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUsers() throws SQLException {
        List<User> usersList = new ArrayList<User>();
        try {
            usersList = this.userService.getAllUsers();
            usersList.stream().map(post -> modelMapper.map(post, UserDTO.class))
                    .collect(Collectors.toList());
        } catch (DataAccessException e) {
            ResponseEntity.status(500);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonMap("clientes", usersList));

    }

    /*
    @GetMapping(value = "/user/{id}", produces = "application/json")
    public String getUser(@RequestParam("id") int id) throws SQLException {
        return "TODO";
    }

    @PostMapping(value = "/user", produces = "application/json")
    public String postUser(@Valid @RequestBody User user) throws SQLException {
        return "TODO";
    }*/
}
