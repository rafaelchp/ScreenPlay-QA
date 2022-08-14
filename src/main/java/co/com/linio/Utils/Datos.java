package co.com.linio.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 *@author Rafael Chica.
 */
public class Datos {
    private XSSFWorkbook libro;
    private FileInputStream file;
    public String leerDatosExcel (String ruta,String hoja, int rowValue, int cellValue) throws IOException {
        String valor = null;
        file = new FileInputStream(new File(ruta));
        libro = new XSSFWorkbook(file);
        Sheet sheet = libro.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);


        valor=cell.getStringCellValue();
        libro.close();
        file.close();
        return valor;



    }
}
