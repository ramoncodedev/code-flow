package com.inova.code_flow.dto.request;


import com.inova.code_flow.enums.Role;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRequest(

       @NotBlank(message = "nome é obrigatorio")
        String fullName,

        @Email(message = "email inválido")
        @NotBlank(message = "email é obrigatorio")
        String email,

        @NotNull(message = "senha é obrigatoria")
        String passwordHash,

        @NotBlank(message = "telefone é obrigatorio")
        String phone,
        Role role,
        String assignedWhatsappNumber,
        String assignedWhatsappLabel

) {
}
