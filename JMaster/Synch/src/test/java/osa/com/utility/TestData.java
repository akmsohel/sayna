package osa.com.utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name = "logInInfo")
	public Object[][] readXL() throws IOException {
		String f = "C:\\Users\\dmost\\Documents\\BootCamp\\Synch\\dATA fILES\\Data1.xlsx" ;
		String n = "LoginInfo" ;
		Object[][] data=XLReader.TestData(f,n );
		/*
		 * for(int i=0;i<data.length;i++) { for(int j=0;j<data[i].length;j++) {
		 * System.out.println(data[i][j]); } }
		 */
		return data;
	}

}
