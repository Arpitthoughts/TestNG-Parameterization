package Testnggroups;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test(groups= {"Sanity","Regression"})
	public void WebTest1() {
		
		System.out.println("This a webtest1 method");
	}

	@Test(groups= {"Sanity","Regression"})
	public void WebTest2() {
		
		System.out.println("This a webtest2 method");
	}


}
