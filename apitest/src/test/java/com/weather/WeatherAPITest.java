package com.weather;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class WeatherAPITest {

    private final String BASE_URL = "https://api.weatherbit.io/v2.0/current";
    private final String API_KEY = "769f54f6f713460fb138a2929a2b4312";

    @Test
    @Description("Test to get current weather data by latitude and longitude")
    public void testGetWeatherForMultipleLocations() {
        // Test case for Tokyo, Japan
        getWeatherByLatLon(35.6895, 139.6917, "Tokyo");

        // Test case for New York City, USA
        getWeatherByLatLon(40.7128, -74.0060, "New York City");

        // Test case for Sydney, Australia
        getWeatherByLatLon(-33.8688, 151.2093, "Sydney");

        // Add more test cases for other locations as needed
    }

    @Step("Getting weather data for latitude: {lat}, longitude: {lon}")
    public void getWeatherByLatLon(double lat, double lon, String expectedCity) {
        given()
                .queryParam("lat", lat)
                .queryParam("lon", lon)
                .queryParam("key", API_KEY)
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .body("data[0].city_name", equalTo(expectedCity));
    }

}
