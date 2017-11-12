package com.eloisance.istic.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private String openWeatherMapKey = "e3c0102fa27bdd93f80d6fc1e7274a10";
    private String url = "http://api.openweathermap.org/data/2.5/forecast?lat={lat}&lon={lng}&APPID=" + openWeatherMapKey;
    private RestTemplate restTemplate;

    public WeatherService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    /**
     * API have data for every 3 hours => 8 "dt" by day
     * 5 days * 8 => item 40
     * 4 days * 8 => item 42
     * "dt" for timestamp
     * list[i].weather.main for main weather at [i] dt
     */
    public String getWeatherAt(Double lat, Double lng) {
        String data = restTemplate.getForObject(url, String.class, lat, lng);
        JSONObject jsonObject = new JSONObject(data);
        JSONArray itemList = jsonObject.getJSONArray("list");
        JSONObject firstItem = (JSONObject) itemList.get(32);
        JSONArray weatherList = firstItem.getJSONArray("weather");
        JSONObject weather = (JSONObject) weatherList.get(0);
        return weather.getString("main");
    }
}
