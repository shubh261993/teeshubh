package RestAssured;

import java.io.File;
import java.io.FileInputStream;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class StaticProviders {

	@DataProvider(name = "testData")
	public Object[][] arrayData()
	{ 
		Object aData[][] = new Object[2][2];
		aData[0][0] = "TNS";
		aData[0][1] = "Senior Assosiate";
		aData[1][0] = "MNS";
		aData[1][1] = "Analyst";
		
		return aData;
		
	}
	
//	@BeforeMethod
//	public void takeDataFromExcel()
//	{
//		FileInputStream fs = new FileInputStream("");
//		XSSFWorkbook workbook = new XSSFWorkbook(fs);
//	}
}

