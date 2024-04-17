package com.dheeresh.crud.boot.jpadatasource.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class User {
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Config {
    public static void main(String[] args) throws JsonProcessingException {
        // Create a POJO class
        Product product = new Product(1, "productName", 2, 234.50);

        // Create a ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();

        // Serialize the POJO class to a JSON string
        String jsonString = mapper.writeValueAsString(product);

        // Set the JSON string as the body of the request
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8086/products", jsonString, String.class, headers);

        // Print the response
        System.out.println(response.getBody());
    }
}