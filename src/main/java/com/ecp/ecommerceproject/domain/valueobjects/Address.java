package com.ecp.ecommerceproject.domain.valueobjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;


    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }


    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setPostalCode(String postalCode) {
        String regex = "^\\d{2}-\\d{3}$";
        Pattern zipCodePattern = Pattern.compile(regex);

        Matcher patternMatcher = zipCodePattern.matcher(postalCode);
        boolean correctCode = patternMatcher.find();

        if (correctCode){
            this.postalCode = postalCode;
        }else {
            throw new IllegalArgumentException("Please enter correct postal code.");
        }
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
