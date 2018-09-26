package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public static String getPropertyValue(String path,String key) {
		String v="";
		try {
			java.util.Properties p = new java.util.Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return v;
		}
	
		public static void  writeResultToXL(String path,int passCount,int failCount) {
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet("Sheet1").getRow(1).getCell(0).setCellValue(passCount);
			w.getSheet("Sheet1").getRow(1).getCell(1).setCellValue(failCount);
			w.write(new FileOutputStream(path));
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	
	
		
	}
}

