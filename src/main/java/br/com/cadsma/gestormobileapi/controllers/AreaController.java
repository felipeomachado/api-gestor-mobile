package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.repositories.AreaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/area")
public class AreaController {

    private final AreaRepository areaRepository;

    public AreaController(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @PostMapping
    public String abc(@RequestBody Area area) {
        areaRepository.save(area);
        return "OK";
    }
}
