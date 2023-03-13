package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.services.RotaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/rota")
public class RotaController {

    private final RotaService service;

    public RotaController(RotaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<Rota> request) {
        service.inserir(request);
    }

    @GetMapping
    public List<Rota> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return service.recuperar(codigoEmpresa);
    }
}
