package com.crm.JENKINS;

import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void read()
	{
		System.out.println("reading the data");
		String URL = System.getProperty("URL");
		String BROWSER = System.getProperty("BROWSER");
		System.out.println(URL);
		System.out.println(BROWSER);
	}

}
