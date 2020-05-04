
package com.mycompany.finalproject.bean;

import com.mycompany.finalproject.dataAccess.customerDA;


/**
 *
 * @author saitejaadabala
 */

public class customer {
   
    private int         customerId;
    private String      firstName;
    private String      lastName;
    private String      phoneNumber;

    
    
    public void create() {
        customerDA cda = new customerDA();
        cda.createCustomer();
    }

    public customer(int customerId, String firstName, String lastName, String phoneNumber) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "customer{" + "customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
