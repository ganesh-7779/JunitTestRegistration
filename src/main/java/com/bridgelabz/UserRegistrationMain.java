/************************************************************************
 * Purpose : validate First name, Last name, phone, Email
 *           and password using lambada expression feature of java 8.
 * @author Ganesh Gavhad
 * @Version 1.0
 * @since 29-07-2021
 **********************************************************************/
package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface validationProcess {
    void userValidator(String input);
}
public class UserRegistrationMain {

    public static void main(String[] args) {
//validating first name
        validationProcess getFistName = (firstName)->{
            boolean check;
            check= Pattern.matches("[A-Z]+[a-z]{2,}",firstName);
            if(check)
                System.out.println("Valid First Name");
            else
                System.out.println("Invalid  First Name");
        };
        getFistName.userValidator("Ganesh");
// validating last name
        validationProcess getLastName = (lastName) ->{
            boolean check;
            check= Pattern.matches("[A-Z]+[a-z]{2,}",lastName);
            if(check)
                System.out.println("Valid Last Name");
            else
                System.out.println("Invalid Last Name");
        };
        getLastName.userValidator("Gavhad");
//validating email
       validationProcess getEmail = (email) ->{
           boolean check;
           check= Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$",email);
           if(check)
               System.out.println("Valid Email");
           else
               System.out.println("Invalid Email");
        };
       getEmail.userValidator("ganesh.gavhad@co.in");
//validating phone number
        validationProcess getPhoneNumber = (phoneNum) ->{
            boolean check;
            check= Pattern.matches("^(\\d{2}[ ]){1}\\d{10}$",phoneNum);
            if(check)
                System.out.println("Valid Phone Number");
            else
                System.out.println("Invalid Phone Number");
        };
        getPhoneNumber.userValidator("91 7775824691");
// validating password
        validationProcess getPassword=(password) -> {
            boolean check;
            check= Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-z0-9!@#$%^&*()_+=-{};':<>,./?~`]).{8,}$",password);
            if(check)
                System.out.println("Valid Password");
            else
                System.out.println("Invalid  Password");
        };
        getPassword.userValidator("ABcd$12ijk");
    }
}
