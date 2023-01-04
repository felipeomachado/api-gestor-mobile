package br.com.cadsma.gestormobileapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/area")
public class AreaController {

    @GetMapping
    public String abc() {
        return "OK";
    }
}
