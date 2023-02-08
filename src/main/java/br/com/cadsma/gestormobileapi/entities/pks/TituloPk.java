package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TituloPk tituloPk = (TituloPk) o;
        return codigoEmpresa == tituloPk.codigoEmpresa && controle == tituloPk.controle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, controle);
    }
}
