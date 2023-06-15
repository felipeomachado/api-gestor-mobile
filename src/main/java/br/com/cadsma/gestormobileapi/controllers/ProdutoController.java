package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.controllers.dto.request.ProdutoRequest;
import br.com.cadsma.gestormobileapi.entities.ClienteRca;
import br.com.cadsma.gestormobileapi.entities.Produto;
import br.com.cadsma.gestormobileapi.services.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestHeader(name = "x-primeira-exportacao") boolean primeiraExportacao,
                        @RequestHeader(name = "x-excluir-registros") boolean excluirRegistros,
                        @RequestBody List<Produto> request) {
        service.inserir(request, primeiraExportacao, excluirRegistros);
    }

    @GetMapping
    public List<Produto> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return List.of();
    }
}
