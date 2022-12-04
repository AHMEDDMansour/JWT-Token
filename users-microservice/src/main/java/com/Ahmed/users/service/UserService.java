package com.Ahmed.users.service;

import com.Ahmed.users.entities.Role;
import com.Ahmed.users.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
}
