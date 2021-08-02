/************************************************************************
 * Purpose : To test input for First name , Last name, phone,Email
 *           and password.If test case false it will return invalid message
 * @author Ganesh Gavhad
 * @Version 1.0
 * @since 29-07-2021
 *
 ***********************************************************************/
package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
    Registration registration = new Registration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws ValidationExceptions {
        try {
            boolean result;
            result = registration.getFirstName("Ganesh");
            Assert.assertEquals(true, result);
        } catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws ValidationExceptions {
        try {
            boolean result = registration.getLastName("Gavhad");
            Assert.assertEquals(true, result);
        } catch (ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenPhoneNumber_WhenItsProper_ShouldReturnTrue() throws ValidationExceptions {
        try {
            boolean result = registration.getPhoneNumber("91 7584684205");
            Assert.assertEquals(true, result);
        } catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws ValidationExceptions {
        try {
            boolean result = registration.getPassword("ABcd$12ijk");
            Assert.assertEquals(true, result);
        } catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenGmail_WhenProper_ShouldReturnTrue() throws ValidationExceptions {
        try {
            boolean result = registration.getEmail("ganesh.gavhad@co.in");
            Assert.assertEquals(true, result);
        }catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    // false
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() throws ValidationExceptions {
        try {
            boolean result = registration.getFirstName("ganesh");
            Assert.assertEquals(false,result);
        } catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() throws ValidationExceptions {
        try {
            boolean result = registration.getLastName("gavhad");
            Assert.assertFalse(result);
        } catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenPhoneNumber_WhenItsNotProper_ShouldReturnFalse() throws ValidationExceptions {
        try {
            boolean result = registration.getPhoneNumber("85425");
            Assert.assertEquals(false, result);
        }catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenPassword_WhenItsNotProper_ShouldReturnFalse() throws ValidationExceptions {
        try {
            boolean result = registration.getPassword("123");
            Assert.assertEquals(false, result);
        } catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenEmail_WhenItsNotProper_ShouldReturnFalse() throws ValidationExceptions {
        try {
            boolean result = registration.getEmail("ganesh.gavhad.com");
            Assert.assertEquals(false, result);
        } catch ( ValidationExceptions e) {
            System.out.println(e.getMessage());
        }
    }
}
