package com.inova.code_flow.service;


import com.inova.code_flow.dto.request.UserRequest;
import com.inova.code_flow.dto.response.UserResponse;
import com.inova.code_flow.entity.User;
import com.inova.code_flow.exception.EmailExistsException;
import com.inova.code_flow.mapper.UserMapper;
import com.inova.code_flow.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponse createUser(UserRequest userRequest){

       if (userRepository.existsByEmail(userRequest.email())) {
            throw new EmailExistsException();
        }

        User newUser = UserMapper.toEntity(userRequest);
        User saveUser = userRepository.save(newUser);
        return UserMapper.toResponse(saveUser);
    }






}
