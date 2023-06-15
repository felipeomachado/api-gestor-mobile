package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Cliente;
import br.com.cadsma.gestormobileapi.services.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestHeader(name = "x-primeira-exportacao") boolean primeiraExportacao,
                        @RequestHeader(name = "x-excluir-registros") boolean excluirRegistros,
                        @RequestBody List<Cliente> request) {
        service.inserir(request, primeiraExportacao, excluirRegistros);
    }

    @GetMapping
    public List<Cliente> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return List.of();
    }
}
