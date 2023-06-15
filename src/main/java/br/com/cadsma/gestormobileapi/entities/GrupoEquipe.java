package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.GrupoEquipePk;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = GrupoEquipe.ENTITY_NAME)
@IdClass(GrupoEquipePk.class)
public class GrupoEquipe {
    public static final String ENTITY_NAME = "GRUPO_EQUIPE";

    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    private int codigoEmpresa;
    @Id
    @Column(name = "GRUPO_CODIGO", nullable = false)
    @JsonProperty("GRUPO_CODIGO")
    private int codigoGrupo;
    @Id
    @Column(name = "EQUIPE_CODIGO", nullable = false)
    @JsonProperty("EQUIPE_CODIGO")
    private int codigoEquipe;

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public int getCodigoEquipe() {
        return codigoEquipe;
    }

    public void setCodigoEquipe(int codigoEquipe) {
        this.codigoEquipe = codigoEquipe;
    }
}
