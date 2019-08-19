package org.test.Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task extends Base{
	
		 public static String getData(int rownor,int columnor) throws IOException{
		File f=new File("C:\\Users\\HP\\eclipse-kk\\Ex\\sheet\\Book1.xlsx");
		FileInputStream str=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(str);
		Sheet s = w.getSheet("kk");
		
		Row r = s.getRow(rownor);
		Cell c = r.getCell(columnor);
		int type=c.getCellType();
		String n="";
		if(type==1) {
			n=c.getStringCellValue();
		}
		else {
			
		
	if(DateUtil.isCellDateFormatted(c)) {
		Date d=c.getDateCellValue();
		SimpleDateFormat a = new SimpleDateFormat("dd-MM-yy");
		n=a.format(d);
	}
	else {
		double d = c.getNumericCellValue();
		long l=(long)d;
		n=String.valueOf(l);
	}
					}
		return n;
			
		 }	
			
			
		 }

		

