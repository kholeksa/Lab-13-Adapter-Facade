package ua.edu.ucu.apps.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import lombok.SneakyThrows;

public class PDLReader {
    @SneakyThrows
    public Company fetch(String companyName) {
        String API_KEY = "";
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + URLEncoder.encode(companyName, StandardCharsets.UTF_8.toString()));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        
        JSONObject jsonObject = new JSONObject(text);
        System.out.println(jsonObject);
        return new Company();
    }
}
