package com.sample.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleExample {
	
	@Test()
	public void test1(){
		System.out.println("regression Started");
		Assert.assertEquals("varun", "varun", "regression failed");
		String value = "varun kurumella";
		Assert.assertTrue(value.contains("varun"));		
		System.out.println("regression Completed");
	}

}
