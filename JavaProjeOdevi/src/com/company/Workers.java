package com.company;

public abstract class Workers extends Person{
    private double salary;
    private String[] offDays;
    private int workOfficeCode;


    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String[] getOffDays() {
        return offDays;
    }
    public void setOffDays(String[] offDays) {
        this.offDays = offDays;
    }
    public int getWorkOfficeCode() {
        return workOfficeCode;
    }
    public void setWorkOfficeCode(int workOfficeCode) {
        this.workOfficeCode = workOfficeCode;
    }

    public void printWorkerInformations(Workers user){
        System.out.println("Name:"+user.getName()+"  Surname:"+user.getSurname()+"  UserID:"+user.getId());
        System.out.println("Birth Date:"+user.getBirthDate()+"  Start Date:"+user.getStartDate()+"  password:"+user.getPassword());
        System.out.print("Off Days:");
        for(String s:user.getOffDays()){
            System.out.print(s+"  ");
        }
        System.out.println();
        System.out.println("Working Code:"+user.getWorkOfficeCode()+"  Salary:"+user.getSalary());
    }

}
