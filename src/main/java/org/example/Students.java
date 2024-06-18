package org.example;

import java.util.Date;

public class Students {

    public String Group;
    public String FullName;
    public int BirthDay;
    public double MediumPoint;

    public Students(){
        Group="ИТб-211";
        FullName="Пупкин Генадий Анатольевич";
        BirthDay = 23;
        MediumPoint = 4.3;
    }
    public Students(String group,String fullName, int birthDay,double mediumPoint){
        Group=group;
        FullName=fullName;
        BirthDay=birthDay;
        MediumPoint=mediumPoint;
    }
}
