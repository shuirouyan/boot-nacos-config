package com.example.nacosproperties.service;

import com.example.nacosproperties.entity.Jokes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

  @Resource
  private JokesService jokesService;

  @Tool(description = "Get weather information by city name")
  public String getWeather(@ToolParam(description = "City name") String cityName) {
    return "Sunny in " + cityName;
  }

  @Tool(description = "获取一个笑话")
  public String getJokeService(@ToolParam(description = "笑话id") Integer id) {
    Jokes byId = jokesService.getById(id);
    if (byId != null) {
      ObjectMapper objectMapper = new ObjectMapper();
      try {
        return objectMapper.writeValueAsString(byId);
      } catch (JsonProcessingException e) {
        throw new RuntimeException(e);
      }
    }
    return "id is not jokes;";
  }
}