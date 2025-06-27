package com.example.nacosproperties.controller;

import com.example.nacosproperties.entity.Jokes;
import com.example.nacosproperties.service.JokesService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangchen
 * @date 2025/6/27 12:25
 */
@RestController
@RequestMapping("/joke")
public class JokeController {

    @Autowired
    private JokesService jokesService;
    @RequestMapping("/get/{id}")
    public String get(@PathVariable("id")Integer id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Jokes byId = jokesService.getById(id);
        if (byId != null) {
            return objectMapper.writeValueAsString(byId);
        }
        return "find msg is null";
    }
}
