package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Grupo;
import br.com.cadsma.gestormobileapi.entities.Prazo;
import br.com.cadsma.gestormobileapi.services.InserirGrupoService;
import br.com.cadsma.gestormobileapi.services.InserirPrazoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/grupo")
public class GrupoController {

    private final InserirGrupoService service;

    public GrupoController(InserirGrupoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Grupo> request) {
        service.execute(request);
    }
}
