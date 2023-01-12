package org.arkham.examples.soap.controller;

import org.arkham.examples.soap.client.NumbersConvClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * The objective of this class is to create REST Service that will convert a number into words.
 * @author Ing. Antonio Hernandez
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/number/conversion")
public class NumbersConvRest {

    private final NumbersConvClient client;

    @Autowired
    public NumbersConvRest(NumbersConvClient client) {
        this.client = client;
    }

    /**
     * This method converts a number into a word by means of a SOAP client.
     * @param number value to convert.
     * @return response http with the number word.
     */
    @GetMapping("/words/{number}")
    public ResponseEntity<Map<String, Object>> convertNumberWords(@PathVariable Long number) {
        final String word = client.convertNumberToWord(number).trim();
        final Map<String, Object> body = new HashMap<>();
        body.put("number", number);
        body.put("word", word);

        return new ResponseEntity<>(body,HttpStatus.OK);
    }

}
