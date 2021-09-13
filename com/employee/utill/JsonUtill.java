package com.employee.utill;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtill {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}

	public static String convertJavaToJSon(Object object) {
		// String jsonResult = "";
		String jsonResult = null;
		try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Excepction occred while converting Java obj into Json" + e.getMessage());

		} catch (JsonMappingException e) {
			System.out.println("Excepction occred while converting Java obj into Json" + e.getMessage());

		} catch (IOException e) {
			System.out.println("Excepction occred while converting Java obj into Json" + e.getMessage());

		}
		return jsonResult;

	}
	public static <T> T convertJsonToJava(String jsonString, Class<T> cls){
		T result=null;
		try {
			result=mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

}
