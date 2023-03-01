package br.com.cadsma.gestormobileapi.controllers.dto.request;

import br.com.cadsma.gestormobileapi.entities.Cliente;
import br.com.cadsma.gestormobileapi.entities.Titulo;

import java.util.List;

public class TituloRequest {
    private List<Titulo> list;
    private boolean excluirRegistros;

    public List<Titulo> getList() {
        return list;
    }

    public void setList(List<Titulo> list) {
        this.list = list;
    }

    public boolean isExcluirRegistros() {
        return excluirRegistros;
    }

    public void setExcluirRegistros(boolean excluirRegistros) {
        this.excluirRegistros = excluirRegistros;
    }
}
