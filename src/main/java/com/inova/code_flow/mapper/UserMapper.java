package com.inova.code_flow.mapper;


import com.inova.code_flow.dto.request.UserRequest;
import com.inova.code_flow.dto.response.UserResponse;
import com.inova.code_flow.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

    public User toEntity(UserRequest userRequest){
        return User.builder()
                .fullName(userRequest.fullName())
                .email(userRequest.email())
                .passwordHash(userRequest.passwordHash())
                .phone(userRequest.phone())
                .role(userRequest.role())
                .assignedWhatsappNumber(userRequest.assignedWhatsappNumber())
                .assignedWhatsappLabel(userRequest.assignedWhatsappLabel())
                .build();
    }

    public UserResponse toResponse(User user){
        return UserResponse.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .passwordHash(user.getPasswordHash())
                .phone(user.getPhone())
                .role(user.getRole())
                .assignedWhatsappNumber(user.getAssignedWhatsappNumber())
                .assignedWhatsappLabel(user.getAssignedWhatsappLabel())
                .createdAt(user.getCreatedAt())
                .build();
    }

}
