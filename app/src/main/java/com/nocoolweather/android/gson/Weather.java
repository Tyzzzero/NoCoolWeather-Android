package com.nocoolweather.android.gson;

import java.util.List;

/**
 * Created by PanDiwen on 2017/5/13.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SuppressWarnings("daily_forecast")
    public List<Forecast> forecastList;
}
