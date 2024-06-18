package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {
    public void writeStudentsToExcel(List<Students> students, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Students");

            // Создание заголовков
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Group", "FullName", "BirthDay", "MediumPoint"};
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
            }

            // Запись данных
            int rowNum = 1;
            for (Students student : students) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(student.Group);
                row.createCell(1).setCellValue(student.FullName);
                row.createCell(2).setCellValue(student.BirthDay);
                row.createCell(3).setCellValue(student.MediumPoint);
            }

            // Запись в файл
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
