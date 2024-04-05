package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Contact {
    private String firstName;
    private String lastName;
    private String companyField;
    private String jobTitleField;
    private List<PhoneNumber> phones;
    private List<EmailAddress> emails;


}
