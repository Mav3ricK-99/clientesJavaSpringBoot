package com.votacion.services;

import com.votacion.model.User;
import com.votacion.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAllUsers() {
        //Y algo mas..
        return this.userRepo.findAll();
    }

}
