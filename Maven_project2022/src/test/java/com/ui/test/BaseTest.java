package com.ui.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;

import utility.Shared;

public class BaseTest {
	Properties pro;
	@Before
	public void OpenBrowser() throws IOException {
		
	pro	=Shared.readPropfile("C:\\Users\\shanu\\eclipse-workspace\\Maven_project2022\\src\\test\\resources\\DB\\project.properties");
	String br	=System.getProperty("Browser");
	//String br	=pro.getProperty("Browser");
	if (br.equals("Chrome")) {
		System.out.println("Open Chrome" );
		System.setProperty(br, br);
	}else if (br.equals("Firefox")) {
		System.out.println("Open Firefox");
		System.setProperty(br, br);
	}else if (br.equals("Safari")) {
		System.out.println("Open Safari");
	}
}
}
