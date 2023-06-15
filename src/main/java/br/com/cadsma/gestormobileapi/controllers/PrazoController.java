package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.FormaPagamento;
import br.com.cadsma.gestormobileapi.entities.Prazo;
import br.com.cadsma.gestormobileapi.services.PrazoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/prazo")
public class PrazoController {

    private final PrazoService service;

    public PrazoController(PrazoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Prazo> request) {
        service.inserir(request);
    }

    @GetMapping
    public List<Prazo> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return service.recuperar(codigoEmpresa);
    }

}
