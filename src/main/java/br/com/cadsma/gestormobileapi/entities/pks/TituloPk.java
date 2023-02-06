package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;

public class TituloPk implements Serializable {
    private int codigoEmpresa;
    private int controle;

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }
}
