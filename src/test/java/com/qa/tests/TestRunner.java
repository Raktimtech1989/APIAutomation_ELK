package com.qa.tests;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.hamcrest.*;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;

import com.raktim.enums.PropertiesType;
import com.raktim.utils.FakerUtils;
import com.raktim.utils.PropertyUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestRunner {
	
	@Test(invocationCount = 5)
	public void createModuleTestFunctional() throws InterruptedException
	{
		RestAssured.baseURI="http://localhost:9200/regression/_doc"  ;
		
		String localTime = Instant.now().toString() ;
		//String localTime = LocalDateTime.now().toString() ;
		System.out.println("lovcal time is "  + localTime);
		//T06:52:53.735Z
		
		//String time = "2023-10-09T07:41:34.580Z" ;
		
		
		Map<String, String> map = new HashMap<>() ;
		map.put("testname", "testcase"+String.valueOf(FakerUtils.getNumber(10, 10000))) ;
		map.put("status", "fail") ;
		map.put("module", FakerUtils.getAppName()) ;
		map.put("author", "raktim") ;
		map.put("executionTime",localTime) ;
		map.put("reason", "Functional issue") ;
		map.put("Error", "API is breaking") ;
		
		
		
		RestAssured.given().log().all()
		 .header("Authorization","Basic ZWxhc3RpYzplbGFzdGlj")
		                   .contentType(ContentType.JSON)
		                       .with().body(map).when().post(PropertyUtils.getValue(PropertiesType.BASEURL))
		                                   .then().log().all().body("result",Matchers.equalTo("created")) ;
		
		Thread.sleep(30000);
		
	}
	
	@Test(invocationCount = 6)
	public void createModuleTestDB() throws InterruptedException
	{
		RestAssured.baseURI="http://localhost:9200/regression/_doc"  ;
		
		String localTime = Instant.now().toString() ;
		//String localTime = LocalDateTime.now().toString() ;
		System.out.println("lovcal time is "  + localTime);
		//T06:52:53.735Z
		
		//String time = "2023-10-09T07:41:34.580Z" ;
		
		
		Map<String, String> map = new HashMap<>() ;
		map.put("testname", "testcase"+String.valueOf(FakerUtils.getNumber(10, 10000))) ;
		map.put("status", "fail") ;
		map.put("module", FakerUtils.getAppName()) ;
		map.put("author", "raktim") ;
		map.put("executionTime",localTime) ;
		map.put("reason", "DB issue") ;
		map.put("Error", "DB server is not up & running") ;
		
		
		
		RestAssured.given().log().all()
		 .header("Authorization","Basic ZWxhc3RpYzplbGFzdGlj")
		                   .contentType(ContentType.JSON)
		                       .with().body(map).when().post(PropertyUtils.getValue(PropertiesType.BASEURL))
		                                   .then().log().all().body("result",Matchers.equalTo("created")) ;
		
		Thread.sleep(30000);
		
	}
	
	
	@Test(invocationCount = 37)
	public void createModuleTestSuccessForLoan() throws InterruptedException
	{
		//RestAssured.baseURI="http://localhost:9200/regression/_doc"  ;
			//T06:52:53.735Z
		
		
		
		Map<String, String> map = new HashMap<>() ;
		map.put("testname", "testcase"+String.valueOf(FakerUtils.getNumber(1, 999))) ;
		map.put("status", "pass") ;
		map.put("module", "loan") ;
		map.put("author", "rak") ;
		map.put("executionTime", Instant.now().toString()) ;
		map.put("reason", "") ;
		map.put("Error", "") ;
		
		
		
		RestAssured.given().log().all()
		 .header("Authorization","Basic ZWxhc3RpYzplbGFzdGlj")
		                   .contentType(ContentType.JSON)
		                       .with().body(map).when().post(PropertyUtils.getValue(PropertiesType.BASEURL))
		                                   .then().log().all().body("result",Matchers.equalTo("created")) ;
		
		Thread.sleep(30000);
		
	}
	
	
	@Test(invocationCount = 38)
	public void createModuleTestSuccessForCheckout() throws InterruptedException
	{
		//RestAssured.baseURI="http://localhost:9200/regression/_doc"  ;
			//T06:52:53.735Z
		
		
		
		Map<String, String> map = new HashMap<>() ;
		map.put("testname", "testcase"+String.valueOf(FakerUtils.getNumber(1, 999))) ;
		map.put("status", "pass") ;
		map.put("module", "checkout") ;
		map.put("author", "raktim sarkar") ;
		map.put("executionTime", Instant.now().toString()) ;
		map.put("reason", "") ;
		map.put("Error", "") ;
		
		
		
		RestAssured.given().log().all()
		 .header("Authorization","Basic ZWxhc3RpYzplbGFzdGlj")
		                   .contentType(ContentType.JSON)
		                       .with().body(map).when().post(PropertyUtils.getValue(PropertiesType.BASEURL))
		                                   .then().log().all().body("result",Matchers.equalTo("created")) ;
		
		Thread.sleep(30000);
		
	}
	
}
