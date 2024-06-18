package org.example;

import java.util.Date;

public class Students {
    public String Group;
    public String FullName;
    public Date BirthDay;
    public double MediumPoint;

    public Students(){
        Group="ИТб-211";
        FullName="Пупкин Генадий Анатольевич";
        BirthDay = new Date(1987,06,23);
        MediumPoint = 4.3;
    }
}
