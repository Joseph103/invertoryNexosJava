package com.nexos.inventary.model.transform;

import com.nexos.inventary.model.UserNexos;
import com.nexos.inventary.model.dto.UserDto;

public class UserTransform {

    public static final UserTransform userTransform = new UserTransform();

    public UserDto userToDto(UserNexos user)
    {
        UserDto userDtoResponse = new UserDto();

        if (user != null){
            userDtoResponse.setAge(user.getAge());
            userDtoResponse.setName(user.getName());
            userDtoResponse.setEntryDate(user.getEntryDate());
            userDtoResponse.setIdCargo(user.getIdCargo());
        }

        return userDtoResponse;
    }

    public UserNexos dtoToUser(UserDto userDto) {
        UserNexos userResponse = new UserNexos();

        if (userDto != null){
            userResponse.setAge(userDto.getAge());
            userResponse.setName(userDto.getName());
            userResponse.setEntryDate(userDto.getEntryDate());
            userResponse.setIdCargo(userDto.getIdCargo());
        }

        return userResponse;
    }
}
