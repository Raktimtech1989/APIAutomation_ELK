package com.raktim.utils;



import com.github.javafaker.Faker;

public final class FakerUtils {

    private FakerUtils(){}

    private static final Faker faker = new Faker();

     public static int getNumber(int startvalue,int endvalue){
        return faker.number().numberBetween(startvalue, endvalue);
    }
     public static String getFirstName(){
        return faker.name().firstName();
    }
     public static String getLastName(){
        return faker.name().lastName();
    }
     
     public static String getAppName()
     {
    	 return faker.app().name() ;
     }
     
 
}