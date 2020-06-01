package osa.com.utility;

import org.testng.Assert;

public class AssertM {
	public static void tittleMatch(String a, String e) {
		Assert.assertEquals(a, e);		
		System.out.println("Tittle Matched");
	}
	public static void textMatch(String a, String e) {
		Assert.assertEquals(a, e);		
		System.out.println("Text Matched");
	}
	
	

}
