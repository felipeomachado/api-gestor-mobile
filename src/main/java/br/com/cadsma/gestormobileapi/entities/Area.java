package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.AreaPk;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity
@IdClass(AreaPk.class)
public class Area {
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
    @ApiModelProperty(example = "Area 1", required = true)
    private String nome;

    @Column(name = "GERENTE", nullable = false)
    @JsonProperty("GERENTE")
    @ApiModelProperty(example = "1", required = true)
    private int codigoGerente;

    @Column(name = "SITUACAO", nullable = false)
    @JsonProperty("SITUACAO")
    @ApiModelProperty(example = "1", required = true)
    private int situacao;

    @Column(name = "EXCLUIDO", nullable = false)
    @JsonProperty("EXCLUIDO")
    @ApiModelProperty(example = "0", required = true)
    private int excluido;

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

    public int getCodigoGerente() {
        return codigoGerente;
    }

    public void setCodigoGerente(int codigoGerente) {
        this.codigoGerente = codigoGerente;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getExcluido() {
        return excluido;
    }

    public void setExcluido(int excluido) {
        this.excluido = excluido;
    }
}
