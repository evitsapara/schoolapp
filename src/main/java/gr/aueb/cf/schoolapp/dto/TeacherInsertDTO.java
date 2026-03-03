package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record TeacherInsertDTO(

        @NotNull(message = "The first name field cannot be empty.")
        @Size(min = 2, message = "The first name has to consist of at least 2 characters.")
        String firstname,

        @NotNull(message = "The last name field cannot be empty.")
        @Size(min = 2, message = "The last name has to consist of at least 2 characters.")
        String lastname,

        @Pattern(regexp = "\\d{9,}", message = "The VAT number cannot be less than 9 digits.")
        String vat,

        @NotNull(message = "The region field cannot be empty.")
        Long regionId
) {
    public static TeacherInsertDTO empty() {
        return new TeacherInsertDTO("", "", "", 0L);
    }
}
