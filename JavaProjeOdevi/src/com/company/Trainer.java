package com.company;

public class Trainer extends Registerer{
    private String workingArea;
    private static int id=14000000;

    public Trainer(String name, String surname, String password, String birthDate, String startDate, String[] offDays, Double salary,int workOfficeCode) {
        super(name, surname, password, birthDate, startDate, offDays, salary,workOfficeCode);

        for(String s:offDays) {
            if (!s.equalsIgnoreCase("sunday") && !s.equalsIgnoreCase("monday") && !s.equalsIgnoreCase("tuesday") &&
                    !s.equalsIgnoreCase("wednesday") && !s.equalsIgnoreCase("thursday") && !s.equalsIgnoreCase("friday") && !s.equalsIgnoreCase("saturday")) {
                System.out.println(s + " bir gun degildir..!");
                return;
            }
        }

        super.setName(name);
        super.setSurname(surname);
        super.setPassword(password);
        super.setBirthDate(birthDate);
        super.setStartDate(startDate);
        super.setOffDays(offDays);
        super.setSalary(salary);
        super.setWorkOfficeCode(workOfficeCode);
    }
}
