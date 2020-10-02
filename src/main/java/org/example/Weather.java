package org.example;

import org.example.util.WeatherInfo;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;

public class Weather implements WeatherInfo {

    /**
     * this method get value of Temperature in Bobruisk from weather.com
     * @return information about the weather
     * @throws IOException
     */
    @Override
    public String getWeatherInfo() throws IOException {

        String url = "https://weather.com/";
        String info = Jsoup.connect(url).get().selectFirst("span[data-testid=TemperatureValue]").text();
        System.out.println("Temperature in Bobruisk now" + info);
        Logger logger = LoggerFactory.getLogger(Weather.class);
        logger.info("All is good! I working!");
        return info;
    }
}
