package com.mycompany.core.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		SpringApplication.run(Application.class, args);
		
		
		//File initialFile = new File("src/main/resources/soap vs rest.txt");
		File initialFile = new File("src/main/resources/test.xlsx");
	    InputStream targetStream = new FileInputStream(initialFile);
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost httppost = new HttpPost("http://localhost:8085/rest-application/fileupload");
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		//builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addPart("file", new InputStreamBody(targetStream, initialFile.getName()));
		httppost.setEntity(builder.build());
		HttpResponse response = httpClient.execute(httppost);
		
	    HttpEntity entity = response.getEntity();
	    System.out.println(entity.getContent());
	    int status = response.getStatusLine().getStatusCode();
        String body = EntityUtils.toString(response.getEntity());
        System.out.println("status =="+status);
        System.out.println("body =="+body);
        
		
	}
}
