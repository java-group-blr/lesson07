package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

  public static void main(String... args) throws IOException {
    Weather weatherInfo = new Weather();
    weatherInfo.getWeatherInfo();
    Logger logger = LoggerFactory.getLogger(Main.class);
    logger.info("программа завершена успешно");


  }

}
