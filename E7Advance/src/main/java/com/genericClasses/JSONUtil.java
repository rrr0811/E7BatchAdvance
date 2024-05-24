package com.genericClasses;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonObject;

public class JSONUtil {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fis = new FileReader("");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fis);
		JsonObject jobj=(JsonObject) obj;
		jobj.asMap();
	}
}
