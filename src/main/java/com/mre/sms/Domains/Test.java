package com.mre.sms.Domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Entity(name = "test")
@Data
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Size(max = 50, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "First name cannot be empty")
    private String fullName;

    @Size(max = 50, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "First name cannot be empty")
    private String email;

    @Size(max = 50, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "First name cannot be empty")
    private String phoneNumber;

    @Size(max = 25, min = 3)
    @Column(nullable = false)
    @NotNull(message = "password must be filled")
    private String password;


}
