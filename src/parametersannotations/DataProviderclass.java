package parametersannotations;

import org.testng.annotations.DataProvider;

public class DataProviderclass {
	
@DataProvider(name="searchprovider")	
public static Object[][] getdata() {
	return new Object[][] {
		
		{"Arpit","Arjaria"},{"Akhil","Gupta"}
		
		
	};
	
	
}
	
}