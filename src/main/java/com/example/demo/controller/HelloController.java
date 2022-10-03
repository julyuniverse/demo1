package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee Taesung
 * @since 2022-10-03
 */

@RestController
@RequiredArgsConstructor
public class HelloController {
    @GetMapping
    public ResponseEntity<String> hello() {
        String str1 = "hello!";

        return ResponseEntity.ok().body(str);
    }
}
