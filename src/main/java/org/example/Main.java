package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Weather.class);

  public static void main(String... args) throws IOException {
    Weather weatherInfo = new Weather();
    weatherInfo.getWeatherInfo();
    logger.info("программа завершена успешно");


  }

}
