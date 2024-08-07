package com.nobroker.nobroker.service.impl;

import com.nobroker.nobroker.entity.User;
import com.nobroker.nobroker.payload.UserDto;
import com.nobroker.nobroker.repository.UserRepository;
import com.nobroker.nobroker.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }
    @Override
    public long createUser(UserDto userDto) {
        User user=mapToEntity(userDto);
        User savedUser=userRepository.save(user);
        return savedUser.getId();
    }
    User mapToEntity(UserDto userDto){
        User user=modelMapper.map(userDto,User.class);
        return user;
    }
}
