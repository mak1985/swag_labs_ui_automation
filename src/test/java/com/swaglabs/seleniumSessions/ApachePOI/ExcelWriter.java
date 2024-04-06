package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWriter {
    public static void main(String[] args) throws IOException {
        //Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        //Create a blank sheet
        Sheet sheet = workbook.createSheet("Testing purpose");

        //Create some data
        Object[] [] data = {
                {"Name", "Age", "Location"},
                {"John", 30, "New York"},
                {"Alice", 25, "London"},
                {"Bob", 35, "Paris"}
        };

        //Iterate over data and write to the sheet
        int rowCount = 0;
        for (Object[] rowData: data) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(columnCount++);
                if(field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        //Write the workbook to a file

        //Specify the file path
        String filepath = "output.xlsx";
        FileOutputStream outputStream = new FileOutputStream(new File(filepath));
        workbook.write(outputStream);
        System.out.println("Excel file written successfully.");

        //Close the output stream and workbook
        outputStream.close();
        workbook.close();
    }
}
