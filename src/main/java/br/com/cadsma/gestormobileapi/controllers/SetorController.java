package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Prazo;
import br.com.cadsma.gestormobileapi.entities.Setor;
import br.com.cadsma.gestormobileapi.services.InserirPrazoService;
import br.com.cadsma.gestormobileapi.services.InserirSetorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/setor")
public class SetorController {

    private final InserirSetorService service;

    public SetorController(InserirSetorService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Setor> request) {
        service.execute(request);
    }
}
