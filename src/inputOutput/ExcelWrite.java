package inputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWrite {

    public static void main(String[] args) {
        // Create xlsx workbook
        Workbook workbook= new XSSFWorkbook();

        // Create sheet or pages on our workbook
        Sheet sheet= workbook.createSheet("Java");

        //Create row by index
        Row row1= sheet.createRow(0);

        // Create cell number and value by Row and Cell Combination
        Cell cell1= row1.createCell(0);
        cell1.setCellValue("Sunday");

        Cell cell2= row1.createCell(1);
        cell2.setCellValue("Monday");

        Cell cell3= row1.createCell(2);
        cell3.setCellValue("Tuesday");

        Row row2= sheet.createRow(1);

        Cell cell4= row2.createCell(0);
        Cell cell5= row2.createCell(1);
        Cell cell6= row2.createCell(2);

        cell4.setCellValue("1");
        cell5.setCellValue("2");
        cell6.setCellValue("3");

        try {
            //File file = new File("C:\\WEM_Fall_2023_Java\\Documents\\myFile.xlsx");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\WEM_Fall_2023_Java\\Documents\\myFile.xlsx");
            workbook.write(fileOutputStream);
            fileOutputStream.close();

        } catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }

}
