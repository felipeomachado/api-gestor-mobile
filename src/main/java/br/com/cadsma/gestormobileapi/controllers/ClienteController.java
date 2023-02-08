package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.controllers.dto.request.ClienteRequest;
import br.com.cadsma.gestormobileapi.services.InserirClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/cliente")
public class ClienteController {

    private final InserirClienteService service;

    public ClienteController(InserirClienteService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody ClienteRequest request) {
        service.execute(request.getList(), request.isExcluirRegistros());
    }
}
