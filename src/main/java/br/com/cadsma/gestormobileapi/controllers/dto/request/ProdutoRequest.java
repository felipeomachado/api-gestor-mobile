package br.com.cadsma.gestormobileapi.controllers.dto.request;


import br.com.cadsma.gestormobileapi.entities.Produto;

import java.util.List;

public class ProdutoRequest {
    private List<Produto> list;
    private boolean excluirRegistros;

    public List<Produto> getList() {
        return list;
    }

    public void setList(List<Produto> list) {
        this.list = list;
    }

    public boolean isExcluirRegistros() {
        return excluirRegistros;
    }

    public void setExcluirRegistros(boolean excluirRegistros) {
        this.excluirRegistros = excluirRegistros;
    }
}
