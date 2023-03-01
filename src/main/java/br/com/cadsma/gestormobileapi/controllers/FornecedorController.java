package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Fornecedor;
import br.com.cadsma.gestormobileapi.repositories.FornecedorRepository;
import br.com.cadsma.gestormobileapi.services.InserirFornecedorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/fornecedor")
public class FornecedorController {

    private final InserirFornecedorService service;

    public FornecedorController(InserirFornecedorService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Fornecedor> request) {
        service.execute(request);
    }
}
