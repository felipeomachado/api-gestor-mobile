package br.com.cadsma.gestormobileapi.controllers.dto.request;

import br.com.cadsma.gestormobileapi.entities.Cliente;

import java.util.List;

public class ClienteRequest {
    private List<Cliente> list;
    private boolean excluirRegistros;

    public List<Cliente> getList() {
        return list;
    }

    public void setList(List<Cliente> list) {
        this.list = list;
    }

    public boolean isExcluirRegistros() {
        return excluirRegistros;
    }

    public void setExcluirRegistros(boolean excluirRegistros) {
        this.excluirRegistros = excluirRegistros;
    }
}
