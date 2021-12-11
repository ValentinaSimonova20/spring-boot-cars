package ru.pcs.web.springbootweb.forms;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
public class UserForm {
    @NotEmpty
    @Length(max = 10)
    private String firstName;
    @NotEmpty
    @Length(max = 10)
    private String lastName;
}
