package com.nexos.inventary.service;

import com.nexos.inventary.model.dto.UserDto;
import com.nexos.inventary.model.transform.UserTransform;
import com.nexos.inventary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private final UserRepository userRepository;
    private final UserTransform userTransform = new UserTransform();

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto saveUser(UserDto user){
        try {
            if (user != null){
                return userTransform.userToDto(userRepository.save(userTransform.dtoToUser(user)));
            }
        }catch (Exception ex){
            System.out.println("SAVE USER ERROR: "+ ex.getMessage());
        }

        return user;
    }
}
