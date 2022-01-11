package com.company;

import java.util.Date;
import java.util.StringJoiner;

public abstract class Customer extends Person{
    private String customerType;
    private int duration;
    private String finishDate;
    private Double lenght,weight,bodyMassIndex;
    private static int idGold=21000000,idStandard=22000000,idEconomic=23000000;




    public String getCustomerType() {
        return customerType;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(String startDate,int duration) {
        int dd,mm,yy;
        String[] str;
        str=startDate.split(",");
        Date date=new Date(Integer.parseInt(str[2]),Integer.parseInt(str[1])+duration,Integer.parseInt(str[0]));
        dd=date.getDay();
        mm=date.getMonth();
        yy=date.getYear();;
        this.finishDate=dd+","+mm+","+yy;
    }
    public Double getLenght() {
        return lenght;
    }
    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getBodyMassIndex() {
        return bodyMassIndex;
    }
    public void setBodyMassIndex(Double bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }
    public static int getIdGold() {
        return idGold;
    }
    public static void setIdGold(int idGold) {
        Customer.idGold = idGold;
    }
    public static int getIdStandard() {
        return idStandard;
    }
    public static void setIdStandard(int idStandard) {
        Customer.idStandard = idStandard;
    }
    public static int getIdEconomic() {
        return idEconomic;
    }
    public static void setIdEconomic(int idEconomic) {
        Customer.idEconomic = idEconomic;
    }


    public boolean screen(Person user) {
        return false;
    }
}
