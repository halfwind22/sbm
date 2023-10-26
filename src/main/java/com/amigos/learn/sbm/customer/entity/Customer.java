package com.amigos.learn.sbm.customer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Customer {

    private final Long id;
    @NotBlank
    @NotEmpty
    private final String customerName;
    @NotBlank
    @NotEmpty
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;
    @Email
    private final String email;
}
