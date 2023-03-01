package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.FormaPagamento;
import br.com.cadsma.gestormobileapi.services.InserirFormaPagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/formaPagamento")
public class FormaPagamentoController {

    private final InserirFormaPagamentoService service;

    public FormaPagamentoController(InserirFormaPagamentoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<FormaPagamento> request) {
        service.execute(request);
    }
}
