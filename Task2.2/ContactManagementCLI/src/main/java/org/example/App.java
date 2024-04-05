package org.example;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import org.example.model.Contact;
import org.example.model.EmailAddress;
import org.example.model.PhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        PhoneNumber davidPhone1 = new PhoneNumber(2401330011L, "Home");
        PhoneNumber davidPhone2 = new PhoneNumber(2401120123L, "Mobile");
        EmailAddress davidEmail1 = new EmailAddress("dave.sang@gmail.com", "Home");
        EmailAddress davidEmail2 = new EmailAddress("dsanger@argos.com", "Work");
        Contact david = new Contact("David", "Sanger", "Argos LLC", "Sales Manager", Arrays.asList(davidPhone1, davidPhone2), Arrays.asList(davidEmail1, davidEmail2));

        PhoneNumber carlosPhone = new PhoneNumber(4121169988L, "Mobile");
        Contact carlos = new Contact("Carlos", "Jimenez", "", "", Arrays.asList(carlosPhone), null);

        EmailAddress aliEmail = new EmailAddress("ali@bmi.com", "work");
        Contact ali = new Contact("Ali", "Gafar", "BMI Services", "HR Manager", null, Arrays.asList(aliEmail));


        List<Contact> contacts = Arrays.asList(david, carlos, ali);
        contacts.sort((e1, e2) -> e1.getLastName().compareTo(e2.getLastName()));


        System.out.println("Printing out contacts in JSON Format sorted in ascending order of the Last Names");
        Gson gson = new Gson();
        String json = gson.toJson(contacts);
        System.out.println("JSON:\n" + json);

    }


}
