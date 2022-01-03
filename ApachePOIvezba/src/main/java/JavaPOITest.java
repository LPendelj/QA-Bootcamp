import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaPOITest {
    public static void main(String[] args) {

        //pravim novi workbook
        XSSFWorkbook wb = new XSSFWorkbook();

        //novi sheet u okviru wb
        Sheet sh1 = wb.createSheet("MojaLista");
        Row r5 = sh1.createRow(4);
        Cell c7 = r5.createCell(6);

        //upis unosa u polje c7 (red 5, kolona 7).
        c7.setCellValue("Luka Pendelj");

        try {
            //pravimo fajl
            OutputStream fajl = new FileOutputStream("MojExcelFajl.xls");
            wb.write(fajl);
            wb.close();
        } catch (IOException e) {
            System.out.println("Desila se greska");
        }
        System.out.println("Kraj programa");
    }
}