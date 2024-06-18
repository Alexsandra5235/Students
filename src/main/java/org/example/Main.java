package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("ИТб-212", "Alice", new Date(1987,9,34), 4.1));
        students.add(new Students("ИТб-211", "Bob", new Date(1987,9,34), 3.9));
        students.add(new Students("Итб-211", "Charlie", new Date(1987,9,34), 4.1));

        ExcelWriter excelWriter = new ExcelWriter();
        excelWriter.writeStudentsToExcel(students, "students.xlsx");
    }
}