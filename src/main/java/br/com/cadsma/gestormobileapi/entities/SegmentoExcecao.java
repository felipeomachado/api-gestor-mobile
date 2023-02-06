package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.SegmentoExcecaoPk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(SegmentoExcecaoPk.class)
public class SegmentoExcecao {
    @Id
    private int codigoEmpresa;
    @Id
    private int codigoSegmento;
    @Id
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
