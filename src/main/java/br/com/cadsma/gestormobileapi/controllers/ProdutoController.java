package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.controllers.dto.request.ProdutoRequest;
import br.com.cadsma.gestormobileapi.entities.ProdutoInfo;
import br.com.cadsma.gestormobileapi.services.AtualizarProdutoService;
import br.com.cadsma.gestormobileapi.services.InserirProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/produto")
public class ProdutoController {

    private final InserirProdutoService service;
    private final AtualizarProdutoService atualizarProdutoService;

    public ProdutoController(InserirProdutoService service, AtualizarProdutoService atualizarProdutoService) {
        this.service = service;
        this.atualizarProdutoService = atualizarProdutoService;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody ProdutoRequest request) {
        service.execute(request.getList(), request.isExcluirRegistros());
    }

    @PostMapping("/atualizar")
    @ResponseStatus(value = HttpStatus.OK)
    public void atualizar(@RequestBody List<ProdutoInfo> request) {
        atualizarProdutoService.execute(request);
    }
}
