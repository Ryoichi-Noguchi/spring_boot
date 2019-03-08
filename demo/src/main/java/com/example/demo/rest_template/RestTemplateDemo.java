package com.example.demo.rest_template;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateDemo {

    private final RestTemplate restTemplate;

    private final String url = "http://api.nhk.or.jp/v2/pg/now/130/g1.json?key={your_api_key}";

    public RestTemplateDemo(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @RequestMapping(value = "/ex/exchange", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResponseEntity<String> exchange() {
        return restTemplate.exchange(url, HttpMethod.GET, null, String.class);
    }
}
