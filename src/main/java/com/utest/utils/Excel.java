package com.utest.utils;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel implements Closeable {

    private final XSSFWorkbook workbook;

    public Excel() throws IOException {
        FileInputStream file = new FileInputStream(new File(Constant.PATH));
        workbook = new XSSFWorkbook(file);
    }

    public String readExcelData(String sheet, int rowValue, int cellValue) {
        try {
            Sheet excelSheet = workbook.getSheet(sheet);
            Row excelRow = excelSheet.getRow(rowValue);
            Cell excelCell = excelRow.getCell(cellValue);
            if (excelCell != null) {
                return excelCell.getStringCellValue();
            } else {
                return "Empty cell";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error reading cell";
        }
    }

    @Override
    public void close() throws IOException {
        if (workbook != null) {
            workbook.close();
        }
    }


}