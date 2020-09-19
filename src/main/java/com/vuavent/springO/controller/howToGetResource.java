package com.vuavent.springO.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class howToGetResource {
	public void home() {
	ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");

	CustomLoader customLoader = (CustomLoader) context.getBean("customLoader");
	
	Resource resource = customLoader.getResource("classpath:data.txt");
	try {
		InputStream input = resource.getInputStream();
		InputStreamReader reader = new InputStreamReader(input);
		BufferedReader buffer = new BufferedReader(reader);
		String line = "";
		StringBuilder dulieu = new StringBuilder();
		while((line = buffer.readLine()) != null) {
			dulieu.append(line + "\n");	
		}
		buffer.close();
		reader.close();
		input.close();
		System.out.println(dulieu );
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	((ClassPathXmlApplicationContext)context).close();

}
	
	public void load() {
		try {
			URL url = new URL("https://www.youtube.com/watch?v=KI0sc34nvm0&ab_channel=MTSBProductions");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
	

