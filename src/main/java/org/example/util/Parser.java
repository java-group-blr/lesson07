package org.example.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;
import java.net.URL;

public class Parser implements WeatherInfo{

    final static String GISMETEO_URL = "https://www.gismeteo.by/weather-minsk-4248/";
    private Document page = null;

    private Document getPage() {
        try {
            page = Jsoup.parse(new URL(GISMETEO_URL), 10000);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Проверьте интернет соединение.");
        }
        return page;
    }

    @Override
    public String getWeatherInfo() {
        Document page = getPage();
        Element tableWth = page.select("div[class=tabs _center]").first();
        String todayWeather = tableWth.select("div[class=tab-weather]").select("span[class=unit unit_temperature_c]").first().text();
        String todayDate = tableWth.select("div[class=tab  tooltip]").select("div[class=tab-content]").select("div[class=date]").text();
        String timeNow = tableWth.select("div[id=time]").first().text();
        return "Вас приветстует прогноз погоды!" +
                "\nСегодня: " + todayDate +
                "\nСейчас: " + timeNow +
                "\nТемпература: " + todayWeather +
                "\nЖелаем хорошего дня!";
    }
}
