package br.com.cadsma.gestormobileapi.controllers;


import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.services.AreaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/area")
public class AreaController {

    private final AreaService service;

    public AreaController(AreaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Area> request) {
        service.inserir(request);
    }

    @GetMapping
    public List<Area> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return service.recuperar(codigoEmpresa);
    }
}
