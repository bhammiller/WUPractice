package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private Current_observation current_observation;

    public Weather() {
    }

    public Current_observation getCurrent_observation() {
        return current_observation;
    }

    public void setCurrent_observation(Current_observation current_observation) {
        this.current_observation = current_observation;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "current_observation=" + current_observation +
                '}';
    }
}
