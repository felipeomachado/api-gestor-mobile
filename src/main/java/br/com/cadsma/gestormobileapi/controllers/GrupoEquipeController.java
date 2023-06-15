package br.com.cadsma.gestormobileapi.controllers;

import br.com.cadsma.gestormobileapi.entities.Grupo;
import br.com.cadsma.gestormobileapi.entities.GrupoEquipe;
import br.com.cadsma.gestormobileapi.services.GrupoEquipeService;
import br.com.cadsma.gestormobileapi.services.GrupoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/grupoEquipe")
public class GrupoEquipeController {

    private final GrupoEquipeService service;

    public GrupoEquipeController(GrupoEquipeService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void inserir(@RequestBody List<GrupoEquipe> request) {
        service.inserir(request);
    }

    @GetMapping
    public List<GrupoEquipe> recuperar(@RequestHeader(name = "x-codigo-empresa") int codigoEmpresa) {
        return service.recuperar(codigoEmpresa);
    }
}
