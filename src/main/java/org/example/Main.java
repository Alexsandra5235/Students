package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("ИТб-212", "Alice", 23, 4.1));
        students.add(new Students("ИТб-211", "Bob", 19, 3.9));
        students.add(new Students("Итб-211", "Charlie",20, 4.1));
        students.add(new Students("Итб-213", "Entry",22, 4.4));

        ExcelWriter excelWriter = new ExcelWriter();
        excelWriter.writeStudentsToExcel(students, "/D:/3 курс/java project/students.xlsx");
    }
}