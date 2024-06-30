package com.nobroker.nobroker.service;

import com.nobroker.nobroker.entity.User;
import com.nobroker.nobroker.payload.UserDto;

public interface UserService{
    public long createUser(UserDto userDto);

    User registerUser(User user);
}
