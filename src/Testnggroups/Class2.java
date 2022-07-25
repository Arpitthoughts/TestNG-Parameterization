package Testnggroups;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups="Sanity")
	public void MobTest1() {
		
		System.out.println("This a mobtest1 method");
	}

	@Test(groups="Regression")
	public void MobTest2() {
		
		System.out.println("This a mobtest2 method");
	}


}
