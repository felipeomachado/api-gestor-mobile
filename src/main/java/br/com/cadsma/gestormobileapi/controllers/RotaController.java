package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Grupo;
import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.services.InserirGrupoService;
import br.com.cadsma.gestormobileapi.services.InserirRotaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/rota")
public class RotaController {

    private final InserirRotaService service;

    public RotaController(InserirRotaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Rota> request) {
        service.execute(request);
    }
}
