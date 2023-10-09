package com.raktim.constants;

import lombok.Getter;

public class FrameworkConstants {
	
	 //If it non static --> Class level

    private static  final String requestJsonFolderpath = System.getProperty("user.dir") + "/src/test/resources/jsons/";
   
    public static String getRequestjsonfolderpath() {
		return requestJsonFolderpath;
	}
	public static String getResponsejsonfolderpath() {
		return responseJsonFolderPath;
	}
	public static String getPropertyfilepath() {
		return propertyFilePath;
	}
	private static  final String responseJsonFolderPath = System.getProperty("user.dir") + "/output/";
    private static  final String propertyFilePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";

    
    
    
    
}
