/************************************************************************
 * Purpose : To test input for First name , Last name, phone,Email
 *           and password.
 * @author Ganesh Gavhad
 * @Version 1.0
 * @since 29-07-2021
 *
 ***********************************************************************/
package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
        Registration registration= new Registration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = registration.getFirstName("Ganesh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenItsNotProper_ShouldReturnFalse() {
        boolean result = registration.getFirstName("ganesh");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = registration.getLastName("Gavhad");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLasttName_WhenItsNotProper_ShouldReturnFalse() {
        boolean result = registration.getLastName("ganesh779");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPhoneNumber_WhenItsProper_ShouldReturnTrue() {
        boolean result = registration.getPhoneNumber("917584684215");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNumber_WhenItsNotProper_ShouldReturnFalse() {
        boolean result = registration.getPhoneNumber("85425");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = registration.getPassword("ABcd$12ijk");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenItsNotProper_ShouldReturnFalse() {
        boolean result = registration.getPassword("123");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenGmail_WhenProper_ShouldReturnTrue() {
        boolean result = registration.getEmail("ganesh.gavhad@co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenItsNotProper_ShouldReturnFalse() {
        boolean result = registration.getEmail("ganesh.gavhad.com");
        Assert.assertEquals(false, result);
    }

}
