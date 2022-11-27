package org.sid.service;

import java.util.List;

import org.sid.dto.UserDto;
import org.sid.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
