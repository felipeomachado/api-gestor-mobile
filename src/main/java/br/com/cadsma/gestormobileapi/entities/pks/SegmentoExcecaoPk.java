package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;

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
}
