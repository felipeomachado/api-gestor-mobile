package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.controllers.dto.request.ClienteRequest;
import br.com.cadsma.gestormobileapi.controllers.dto.request.TituloRequest;
import br.com.cadsma.gestormobileapi.services.InserirClienteService;
import br.com.cadsma.gestormobileapi.services.InserirTituloService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/titulo")
public class TituloController {

    private final InserirTituloService service;

    public TituloController(InserirTituloService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody TituloRequest request) {
        service.execute(request.getList(), request.isExcluirRegistros());
    }
}
