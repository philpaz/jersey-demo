package com.example.demo;


import java.io.IOException;

import javax.ws.rs.ClientErrorException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	
	 private static final String SERVICE_URL
     = "http://localhost:8080/users";

	@Test
	void getUsers() throws ClientErrorException, IOException {
		
        HttpUriRequest request = new HttpGet(SERVICE_URL);

        /**
        HttpResponse httpResponse = HttpClientBuilder
          .create()
          .build()
          .execute(request);
        
        
        System.out.println("****************** Status coming back from http:8080 ************************ " +  httpResponse
                .getStatusLine()
                .getStatusCode());

        assertEquals(httpResponse
          .getStatusLine()
          .getStatusCode(), HttpStatus.SC_OK);
          **/		 
	}

}
