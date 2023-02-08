package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

public class SegmentoExcecaoPk implements Serializable {
    private int codigoEmpresa;
    private int codigoSegmento;
    private int codigoGrupo;

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(int codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SegmentoExcecaoPk that = (SegmentoExcecaoPk) o;
        return codigoEmpresa == that.codigoEmpresa && codigoSegmento == that.codigoSegmento && codigoGrupo == that.codigoGrupo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, codigoSegmento, codigoGrupo);
    }
}
