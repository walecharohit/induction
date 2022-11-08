package com.fnp.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 * 
 * Class contains methods for the property reader.
 * @author Saransh vijay
 * 
 *
 */
public class PropertyReader {

	static HashMap<String, String> map = new HashMap<String, String>();
	/**
	 * method to read a custom text file for database properties.
	 */
	public static void fileRead() {
		try {
			FileReader it = new FileReader("./db.txt");
			BufferedReader b = new BufferedReader(it);
			String line;
			String[] str = null;

			while ((line = b.readLine()) != null) {
				str = line.split(" - ");
				map.put(str[0], str[1]);
			}

			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String dataFetch(String k) {
		String value = map.get(k);
		return value;
	}
}