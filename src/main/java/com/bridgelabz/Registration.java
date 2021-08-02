package com.bridgelabz;

/********************************************************************
 * Purpose : Create a user registration system using regex.And Custom
 * Exception handling with test case
 * @author Ganesh Gavhad
 * @Version 1.0
 * @since 28-07-2021
 *******************************************************************/
import java.util.regex.Pattern;

public class Registration {

    /**
     * Contains regex pattern to test Firstname
     * @param firstName
     */
    public boolean getFirstName(String firstName) throws ValidationExceptions {
        try {
            return Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
        }catch (Exception e){
            throw new ValidationExceptions("invalid First Name");
        }
    }

    /**
     * Contains regex pattern to test Last name
     * @param lastName
     * @return True if matches regex pattern orterwise false
     */
    public boolean getLastName(String lastName) throws ValidationExceptions {
        try {
            return Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
        } catch (Exception e) {
            throw new ValidationExceptions("Invalid Last Name");
        }
    }

    /**
     * Contains regex pattern to test phone number
     * @param phone
     * @return True if matches regex pattern otherwise return invalid
     */
    public boolean getPhoneNumber(String phone) throws ValidationExceptions {
        try {
            return Pattern.matches("^(\\d{2}[ ]){1}\\d{10}$", phone);

            } catch (Exception e){
                throw new ValidationExceptions("Invalid phone number");
            }
        }

    /**
     * Contains regex pattern to test email id.
     * @param email
     * @return True if matches regex pattern otherwise false
     */
    public boolean getEmail(String email) throws ValidationExceptions {
        try {
            return Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", email);
        }catch (Exception e){
            throw new ValidationExceptions("Invalid email");
        }
    }

    /**
     * Contains regex pattern to test password
     * @param password
     * @return True if matches regex pattern orterwise false
     */
    public boolean getPassword(String password) throws ValidationExceptions {
       try {
           return Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-z0-9!@#$%^&*()_+=-{};':<>,./?~`]).{8,}$", password);
       } catch (Exception e){
            throw new ValidationExceptions("Invalid password");
        }
    }
}
