package com.votacion.services;

import com.votacion.model.User;
import java.util.List;

public interface UserService {
    
    	List<User> getAllUsers();

	/*User createUser(User user);

	User updateUser(long id_cliente, User user);

	void deleteUser(long id_cliente);

	User getUserById(long id_cliente);*/
}
