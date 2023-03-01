package br.com.cadsma.gestormobileapi.controllers;


import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.repositories.AreaRepository;
import br.com.cadsma.gestormobileapi.services.InserirAreaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/area")
public class AreaController {

    private final InserirAreaService service;

    public AreaController(InserirAreaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Area> request) {
        service.execute(request);
    }
}
