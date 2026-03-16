package com.oulim.app.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyConfig {
	private static Properties props = new Properties();
	
	static {
		try(InputStream is = PropertyConfig.class
				.getClassLoader()
				.getResourceAsStream("db.properties")) {
			if(is != null) {
				props.load(is);
			}else {
				System.err.println("db.properties 파일을 찾을 수 없습니다!");
			}
		} catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public static String get(String key) {
		return props.getProperty(key);
	}
}
