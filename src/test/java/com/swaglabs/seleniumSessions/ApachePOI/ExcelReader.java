package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {

        //Specify the path to the excel
        String filePath = "D:\\New folder\\TestData.xlsx";

        //Create a FileInputStream to read the excel file
        FileInputStream fis = new FileInputStream(new File(filePath));

        //Create an instance of XSSFWorkbook, representing the excel file
        Workbook workbook = new XSSFWorkbook(fis);

        //Get the first sheet from the workbook
        Sheet sheet = workbook.getSheetAt(0);

        //Iterate through each row in the sheet
        for (Row row : sheet) {
            //Iterate through each cell in the row
            for (Cell cell: row) {
                System.out.println(cell.toString() + "\t");
            }
            //Move to the next line after printing each row
            System.out.println();
        }

        //Close the workbook and file input stream
        workbook.close();
        fis.close();

    }
}
