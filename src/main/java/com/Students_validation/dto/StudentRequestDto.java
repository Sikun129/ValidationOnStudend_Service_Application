package com.Students_validation.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {

    @NotBlank(message = "name is required")
    @Size(min = 3, max = 20, message = "name must be 3-20 characters")
    private String studentName;

    @NotNull(message = "marks is required")
    @Min(value = 0, message = "mark must be between 0 to 100")
    @Max(value = 100, message = "marks must be  between  0 to 100")
    private Integer marks;

    @NotBlank(message = "email is required")
    @Email(message = "email must be valid")
    private String email;

    @NotBlank(message = "mobile  is required")
    @Pattern(regexp ="^\\d{10}$",message = "mobile must be a 10-digit number")
    private String mobile;
}
