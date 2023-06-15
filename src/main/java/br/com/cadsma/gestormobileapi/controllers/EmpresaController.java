package br.com.cadsma.gestormobileapi.controllers;


import br.com.cadsma.gestormobileapi.entities.Empresa;
import br.com.cadsma.gestormobileapi.services.EmpresaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/empresa")
public class EmpresaController {

    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody Empresa request) {
        service.inserir(request);
    }

    @GetMapping
    public Empresa recuperar(@RequestHeader(name = "x-codigo-empresa") Long codigoEmpresa) {
        return service.recuperar(codigoEmpresa);
    }
}
