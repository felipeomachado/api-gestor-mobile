package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.SetorPk;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = Setor.ENTITY_NAME)
@IdClass(SetorPk.class)
public class Setor {
    public static final String ENTITY_NAME = "SETOR";
    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    @ApiModelProperty(example = "2", required = true)
    private int codigoEmpresa;

    @Id
    @Column(name = "CODIGO", nullable = false)
    @JsonProperty("CODIGO")
    @ApiModelProperty(example = "1", required = true)
    private int codigo;

    @Column(name = "NOME", nullable = false)
    @JsonProperty("NOME")
    @ApiModelProperty(example = "Setor 1", required = true)
    private String nome;

    @Column(name = "AREA", nullable = false)
    @JsonProperty("AREA")
    @ApiModelProperty(example = "1", required = true)
    private int codigoArea;

    @Column(name = "SUPERVISOR", nullable = false)
    @JsonProperty("SUPERVISOR")
    @ApiModelProperty(example = "10", required = true)
    private int codigoSupervisor;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getCodigoSupervisor() {
        return codigoSupervisor;
    }

    public void setCodigoSupervisor(int codigoSupervisor) {
        this.codigoSupervisor = codigoSupervisor;
    }
}
