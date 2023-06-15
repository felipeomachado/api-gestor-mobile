package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.RotaPk;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = Rota.ENTITY_NAME)
@IdClass(RotaPk.class)
public class Rota {
    public static final String ENTITY_NAME = "ROTA";

    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    @ApiModelProperty(example = "2", required = true)
    private int codigoEmpresa;

    @Id
    @Column(name = "RCA_CODIGO", nullable = false)
    @JsonProperty("RCA_CODIGO")
    @ApiModelProperty(example = "1", required = true)
    private int codigoRca;

    @Id
    @Column(name = "CODIGO", nullable = false)
    @JsonProperty("CODIGO")
    @ApiModelProperty(example = "1", required = true)
    private int codigo;

    @Column(name = "NOME", nullable = false)
    @JsonProperty("NOME")
    @ApiModelProperty(example = "Rota 1", required = true)
    private String nome;

    @Column(name = "SETOR", nullable = false)
    @JsonProperty("SETOR")
    @ApiModelProperty(example = "3", required = true)
    private int codigoSetor;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
}
