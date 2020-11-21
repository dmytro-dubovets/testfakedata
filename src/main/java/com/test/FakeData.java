package com.test;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakeData {
    Locale Ukraine = new Locale("uk", "UA");
    Locale Russia = new Locale("ru", "RU");

    Faker faker = new Faker(Ukraine);
    private final String firstname = faker.name().firstName();
    private final String lastname = faker.name().lastName();
    private final String phone = faker.phoneNumber().phoneNumber();
    private final String address = faker.address().fullAddress();
    private final int account_number = faker.number().randomDigitNotZero();
    private final double for_payment = faker.number().randomDouble(2, 0, 50);
    private final int consumption = faker.number().randomDigitNotZero();

    public int getConsumption() {
        return consumption;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAccount_number() {
        return account_number;
    }

    public String getFirstname() {
        return firstname;
    }

    public double getFor_payment() {
        return for_payment;
    }

}
