package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current_observation {
    private String weather;
    private String temperature_string;
    private String relative_humidity;
    private String
}
