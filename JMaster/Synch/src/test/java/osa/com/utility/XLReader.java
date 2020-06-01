package osa.com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReader {
	
	public static Object[][]TestData(String fielPath, String sheetNames) throws FileNotFoundException {
		Object data[][]=null;
		DataFormatter formatter=new DataFormatter();
		
		try {
	FileInputStream inputStream=new FileInputStream(fielPath);
	XSSFWorkbook	workbook = new XSSFWorkbook(inputStream);
	 XSSFSheet sheet =workbook.getSheet(sheetNames);
	 
	int rowsize=sheet.getPhysicalNumberOfRows();
	int colsize=sheet.getRow(0).getLastCellNum();
	
	data=new Object[rowsize][colsize];
	Iterator<Row>rowIterator=sheet.rowIterator();
	int rowCount=0;
	while(rowIterator.hasNext()) {
		Row row =rowIterator.next();
		int colCount=0;
		Iterator <Cell>cellIterator=row.cellIterator();
		while(cellIterator.hasNext()) {
			Cell cell=cellIterator.next();
			data[rowCount][colCount]=formatter.formatCellValue(cell);
			colCount++;
			
		}
		rowCount++;
		
		
	
	}
		}
	catch (IOException e) {

		System.out.println(e.getMessage());
	}
	
	return data;
	}
	}


