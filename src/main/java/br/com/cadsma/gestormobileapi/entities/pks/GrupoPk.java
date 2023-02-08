package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

public class GrupoPk implements Serializable {
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
        GrupoPk grupoPk = (GrupoPk) o;
        return codigoEmpresa == grupoPk.codigoEmpresa && codigo == grupoPk.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, codigo);
    }
}
