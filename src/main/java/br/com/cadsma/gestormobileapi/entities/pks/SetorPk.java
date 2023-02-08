package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

public class SetorPk implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetorPk setorPk = (SetorPk) o;
        return codigoEmpresa == setorPk.codigoEmpresa && codigo == setorPk.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, codigo);
    }
}
