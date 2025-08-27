package com.example.demo;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	
	 private static final String SERVICE_URL
     = "http://localhost:8080/users";

	@Test
	void getUsers() throws IOException {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            var response = client.execute(new HttpGet(SERVICE_URL));
            
            System.out.println("Response status: " + response.getStatusLine().getStatusCode());
            assertEquals(200, response.getStatusLine().getStatusCode());
        }
	}

}
