package RestAssured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataProviders {
	
	@DataProvider(name="testData")
	public Object[][] providers() throws IOException
	{
		HSSFCell cell;
		File file = new File("");
		FileInputStream fs = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fs);
		HSSFSheet sheet = workbook.getSheetAt(0);
		int r = sheet.getLastRowNum();
		int c = sheet.getRow(1).getLastCellNum();
		Object[][] data = new Object[r-1][c];
		for(int i=0;i<r;i++)
		{
			HSSFRow row = sheet.getRow(i);
			for(int j=0;j<c;j++)
			{
				 data[i][j] = row.getCell(j).toString();
			}
		}
		
		
		return data;
		
	}

}
