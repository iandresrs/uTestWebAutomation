package com.utest.utils;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Objects;

public class Excel implements Closeable {
    private final XSSFWorkbook workbook;

    public Excel() {
        try (FileInputStream file = new FileInputStream(new File(Constant.PATH))) {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            throw new RuntimeException("Error opening the Excel file", e);
        }
    }

    public String readExcelData(String sheetName, int rowNum, int cellNum) {
        Sheet sheet = workbook.getSheet(Objects.requireNonNull(sheetName, "Sheet name cannot be null."));
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(cellNum);
        return cell.getStringCellValue();
    }

    @Override
    public void close() throws IOException {
        if (workbook != null) {
            workbook.close();
        }
    }
}