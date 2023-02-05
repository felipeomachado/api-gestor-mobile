package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Fornecedor;
import br.com.cadsma.gestormobileapi.repositories.FornecedorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/fornecedor")
public class FornecedorController {

    private final FornecedorRepository fornecedorRepository;

    public FornecedorController(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @GetMapping
    public List<Fornecedor> listFornecedores() {
        return fornecedorRepository.findAll();
    }

    @PostMapping
    public void insertFornecedores(@RequestBody List<Fornecedor> fornecedorList) {
        fornecedorRepository.saveAll(fornecedorList);
    }
}
