package com.raktim.utils;

import io.restassured.response.Response;
import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class APIUtils {

    private APIUtils(){}

    @SneakyThrows
    public static String readJsonAndGetAsString(String filepath) throws IOException{
        return new String(Files.readAllBytes(Paths.get(filepath)));
    }

    @SneakyThrows
    public static void storeStringAsJsonFile(String filepath, Response response) throws IOException{
        Files.write(Paths.get(filepath),response.asByteArray());
    }
}