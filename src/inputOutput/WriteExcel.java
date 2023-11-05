package inputOutput;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        final String filePath="Documents/NewFile3.xlsx";
        writeExcelFile(filePath);

    }
    public static void writeExcelFile(String fileSource) throws IOException {

        // Creating a workbook for Excel
        Workbook workbook= new XSSFWorkbook();

        // Creating a sheet for my workbook where I would input the values
        Sheet sheet= workbook.createSheet();

        // Row and Columns to input the value
        Row row1= sheet.createRow(0);
        Row row2= sheet.createRow(1);

        Cell cell1=row1.createCell(0);
        cell1.setCellValue("123");

        Cell cell2=row1.createCell(1);
        cell2.setCellValue("233");

        Cell cell3=row1.createCell(2);
        cell3.setCellValue("544");


        Cell cell4=row2.createCell(0);
        cell4.setCellValue("897");

        Cell cell5=row2.createCell(1);
        cell5.setCellValue("3434");

        Cell cell6=row2.createCell(2);
        cell6.setCellValue("545435");

/*
        Object[][] stDetails = {
                {"Sl", "FirstName", "LastName", "ContactNumber"},
                {"1", "Ninja", "Man", "897598759"},
                {"2", "John", "Doe", "997598759"},
                {"2", "Donald", "Trump", "797598759"},

        };

        int rowNum = 0;
        System.out.println("Excel file Created");

        for (Object[] std : stDetails) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;

            for (Object field:std) {
                Cell cell=row.createCell(colNum++);

                if (field instanceof String){
                    cell.setCellValue((String) field);

                } else if (field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }
*/


        // Creating an output stream for the Excel File
        FileOutputStream fileOutputStream=new FileOutputStream(fileSource);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
