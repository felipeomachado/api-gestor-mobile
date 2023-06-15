package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.FormaPagamento;
import br.com.cadsma.gestormobileapi.services.FormaPagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/formaPagamento")
public class FormaPagamentoController {

    private final FormaPagamentoService service;

    public FormaPagamentoController(FormaPagamentoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<FormaPagamento> request) {
        service.inserir(request);
    }

    @GetMapping
    public List<FormaPagamento> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return service.recuperar(codigoEmpresa);
    }
}
