package com.soap.utils;

import com.google.gson.Gson;

public class GsonUtils {

	public GsonUtils() {
	}

	public static String toJson(Object object) {
		String jsonString = "";
		Gson gson = new Gson();
		jsonString = gson.toJson(object);

		return jsonString;
	}

	public static <T> T  fromJson(String json,Class<T> classOfT) {
		Gson gson = new Gson();

		return gson.fromJson(json, classOfT);
	}

}
