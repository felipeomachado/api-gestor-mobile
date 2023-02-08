package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

public class RotaPk implements Serializable {
    private int codigoEmpresa;
    private int codigoRca;
    private int codigo;

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigoRca() {
        return codigoRca;
    }

    public void setCodigoRca(int codigoRca) {
        this.codigoRca = codigoRca;
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
        RotaPk rotaPk = (RotaPk) o;
        return codigoEmpresa == rotaPk.codigoEmpresa && codigoRca == rotaPk.codigoRca && codigo == rotaPk.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, codigoRca, codigo);
    }
}
