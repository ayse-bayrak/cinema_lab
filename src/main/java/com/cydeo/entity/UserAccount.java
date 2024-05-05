package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity{

    @Email
    @NotNull
    private String email;

    @NotNull
    @Size(max=12, min=6)
    private String password;
    private String username;

    @OneToOne
    private AccountDetail accountDetails;
}
