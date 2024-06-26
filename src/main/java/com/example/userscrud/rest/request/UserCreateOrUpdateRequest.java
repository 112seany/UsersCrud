package com.example.userscrud.rest.request;

import com.example.userscrud.rest.validation.DateConstraint;
import com.example.userscrud.rest.validation.EmailConstraint;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateOrUpdateRequest {

    @EmailConstraint
    @NotBlank(message = "Email should not be null")
    private String email;

    @NotBlank(message = "First name should not be null")
    private String firstName;

    @NotBlank(message = "Last name should not be null")
    private String lastName;

    @DateConstraint
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate birthDate;

    private String address;

    @Size(max = 15)
    private String phoneNumber;

}
