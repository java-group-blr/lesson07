package org.example;

import org.example.util.Parser;
import org.example.util.WeatherInfo;

public class Main {
  public static void main(String... args) {
    WeatherInfo weatherInfo = new Parser();
    System.out.println(weatherInfo.getWeatherInfo());
  }
}
