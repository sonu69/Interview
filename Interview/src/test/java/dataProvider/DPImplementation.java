package dataProvider;

import org.testng.annotations.Test;

public class DPImplementation{
	
	@Test(dataProviderClass = DataProvider1.class,dataProvider="getData")
	public void showData(String username,String password) {
		System.out.println(username+" "+password);
	}

}


// @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)