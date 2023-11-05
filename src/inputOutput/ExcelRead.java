package inputOutput;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    public static void main(String[] args) throws IOException {


        // Step 1
        File file = new File("Documents/NewFile.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook= WorkbookFactory.create(inputStream);
        // Step 2
        Sheet sheet = workbook.getSheetAt(0);

        // Step 3
        // Iterate through the rows of the sheet
        for (Row row:sheet
        ) {
            for (Cell cell:row
            ) {
                if (cell.getCellType() == CellType.STRING) {
                    System.out.print(cell.getStringCellValue()+ "\t ");
                } else if (cell.getCellType() == CellType.NUMERIC){
                    System.out.print(cell.getNumericCellValue()+ "\t");
                }
            }
            System.out.println();
        }

        // Step 4

        workbook.close();
        inputStream.close();
    }
}
