package com.test;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class FakeValueServices {
    Locale ukLocale = new Locale("uk", "UA");

    FakeValuesService fakeValuesService = new FakeValuesService(ukLocale,
            new RandomService());

    private final String email = fakeValuesService.bothify("????##@gmail.com");
    private final String firstname = fakeValuesService.regexify("[А-Яа-я]{15}");
    private final String lastname = fakeValuesService.regexify("[А-Яа-я]{15}");
    private final String phone = fakeValuesService.regexify("\\+{1}3{1}8{1}(0(67|68|96|97|98)\\d{7})");
    private final String address = fakeValuesService.regexify("[А-Яа-я]{15}");
    private final String accountNumber = fakeValuesService.regexify("[0-9]{15}");
    private final String forPayment = fakeValuesService.regexify("\\d+\\.\\d+");
    private final String rate = fakeValuesService.regexify("\\d+\\.\\d+");
    private final String date = fakeValuesService.regexify("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})");

    public String getAddress() {
        return address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getForPayment() {
        return forPayment;
    }

    public String getRate() {
        return rate;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
}
