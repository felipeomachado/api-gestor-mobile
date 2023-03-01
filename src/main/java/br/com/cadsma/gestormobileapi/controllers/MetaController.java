package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Grupo;
import br.com.cadsma.gestormobileapi.entities.Meta;
import br.com.cadsma.gestormobileapi.services.InserirGrupoService;
import br.com.cadsma.gestormobileapi.services.InserirMetaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/meta")
public class MetaController {

    private final InserirMetaService service;

    public MetaController(InserirMetaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Meta> request) {
        service.execute(request);
    }
}
