package com.amigos.learn.sbm.customer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Data
@Entity(name = "CUSTOMER")
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "ID")
    private final Long id;
    @NotBlank
    @NotEmpty
    @Column(name = "NAME")
    private final String customerName;
    @NotBlank
    @NotEmpty
    @Column(name = "PASSWORD")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;
    @Email
    @Column(name = "EMAIL")
    private final String email;
}
