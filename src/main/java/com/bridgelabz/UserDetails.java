package com.bridgelabz;

public class UserDetails {
    public String firstName;
    public String lastName;
    public String email;
    public String mobile;
    public String password;


    public String toString() {
        return "User [firstName="+firstName+",lastName="+lastName+",email="+email+",mobile="
                +mobile+",password"+password+"]";
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile=mobile;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password=password;
    }
}