package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;

public class FormaPagamentoPk implements Serializable {
    private int codigoEmpresa;
    private int codigo;

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
