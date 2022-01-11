package com.company;

import java.util.Date;

public class CustomerGold extends Customer{

    CustomerGold(String name, String surname, String password, String birthDate, String startDate, String customerType, int duration, Double lenght, Double weight) {
        super.setName(name);
        super.setSurname(surname);
        super.setBirthDate(birthDate);
        super.setStartDate(startDate);
        super.setPassword(password);
        super.setFinishDate(startDate,duration);
        super.setCustomerType(customerType);
        super.setLenght(lenght);
        super.setWeight(weight);
        super.setDuration(duration);
        super.setBodyMassIndex(weight/(lenght*lenght));
    }

}
