package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.ClienteRca;
import br.com.cadsma.gestormobileapi.entities.GrupoEquipe;
import br.com.cadsma.gestormobileapi.services.ClienteRcaService;
import br.com.cadsma.gestormobileapi.services.GrupoEquipeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/clienteRca")
public class ClienteRcaController {

    private final ClienteRcaService service;

    public ClienteRcaController(ClienteRcaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<ClienteRca> request) {
        service.inserir(request);
    }

    @GetMapping
    public List<ClienteRca> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return service.recuperar(codigoEmpresa);
    }
}
