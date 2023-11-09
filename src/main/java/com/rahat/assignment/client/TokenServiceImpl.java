package com.rahat.assignment.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

@Service
public class TokenServiceImpl implements TokenService{


    private RestTemplateBuilder restTemplateBuilder;
    private static final String getToken="https://efatura.etrsoft.com/fmi/data/v1/databases/testdb/sessions";
    @Autowired
    public TokenServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public Token findAll() {
        RestTemplate restTemplate=restTemplateBuilder.build();
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBasicAuth("apitest","test123");
        HttpEntity httpEntity = new HttpEntity<>( httpHeaders);
        ResponseEntity<JsonNode> tokenResponse=restTemplate.postForEntity(getToken,httpEntity,JsonNode.class);
        /* Object res=restTemplate.exchange(getToken, HttpMethod.POST,requestEntity, Object.class);*/

return null;

    }
}
   /* Map<String, String> requestBody = new HashMap<>();
    HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, httpHeaders);*/
