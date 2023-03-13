package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

public class MetaPk implements Serializable {
    private int codigoEmpresa;
    private int codigo;
    private int anoBase;
    private int tipo;

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

    public int getAnoBase() {
        return anoBase;
    }

    public void setAnoBase(int anoBase) {
        this.anoBase = anoBase;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetaPk metaPk = (MetaPk) o;
        return codigoEmpresa == metaPk.codigoEmpresa && codigo == metaPk.codigo && anoBase == metaPk.anoBase && tipo == metaPk.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, codigo, anoBase, tipo);
    }
}
