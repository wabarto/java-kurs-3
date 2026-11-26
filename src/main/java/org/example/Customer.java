package org.example;

public class Customer {
    private String name;
    private String pesel;

    private final Address residenceAddress;
    private final Address mailingAddress;

    public Customer(String name, String pesel, Address residenceAddress, Address mailingAddress) {
        this.residenceAddress = residenceAddress;
        this.mailingAddress = mailingAddress;
    }

}
