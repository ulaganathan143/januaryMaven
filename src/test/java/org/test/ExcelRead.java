package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main (String[]args) throws IOException           {
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelRead.xlsx");
	
	FileInputStream f1=new FileInputStream(f);
Workbook w=new XSSFWorkbook(f1);
Sheet s =w.getSheet("Sheet1");
for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	Row r=s.getRow(i);
	for (int j=0;j < r.getPhysicalNumberOfCells ();j++){
		Cell cell =r.getCell(j);
	int cellType=  cell.getCellType();
	if(cellType==1) {
		String value=cell.getStringCellValue();
		System.out.println (value);
	}
		
	else if (cellType==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
		Date d=	cell.getDateCellValue();
		System.out.println (d);
		SimpleDateFormat sd= new SimpleDateFormat ("dd/mm/yyyy"); 
		String value=sd.format(d);
		System.out.println(value);
		
		}
		else {
			double d=cell.getNumericCellValue();
			long l=(long) d;
			String value=String.valueOf(l);
			System.out.println(value);
			
		
		
		
		}
	}
	}
}
	
	}
}
