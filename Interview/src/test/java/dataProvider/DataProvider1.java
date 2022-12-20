package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
	
	@DataProvider(name="getData")
	public Object[][] getData() {
		
		Object[][] data = new Object[5][2];
		
		data[0][0]="admin4";
		data[1][0]="admin";
		data[2][0]="admin1";
		data[3][0]="admin2";
		data[4][0]="admin3";

		data[0][1]="password5";
		data[1][1]="password1";
		data[2][1]="password2";
		data[3][1]="password3";
		data[4][1]="password4";
		
		return data;
	}
	


}
