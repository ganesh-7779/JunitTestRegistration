/************************************************************************
 * Purpose : Parameterized test to validate multiple entry for the email address
 * @author Ganesh Gavhad
 * @Version 1.0
 * @since 29-07-2021
 ***********************************************************************/
package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailParameterisedTest {
    String email;
    String expected;

    public EmailParameterisedTest(String email,String expected){
        this.email=email;
        this.expected=expected;
    }
    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{{"ganesh.gavhad@co.in","true"},{"abc-100@yahoo.com","true"},{"abc-100@yahoo.com","true"},{"abc111@abc.com","true"},{"abc-100@abc.net","true"},{"abc.100@abc.com.au","true"},{"abc@1.com","true"},
                {"abc@gmail.com","true"},{"abc+100@gmail.com","true"}});
    }
    @Test
    public void givenEmail_ShouldReturn_TrueAndFalse() throws ValidationExceptions {
        Registration registration= new Registration();
        boolean result = registration.getEmail(email);
        Assert.assertEquals(true, result);
    }
}
