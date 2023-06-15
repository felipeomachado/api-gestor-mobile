package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.FormaPagamentoPk;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name=FormaPagamento.ENTITY_NAME)
@IdClass(FormaPagamentoPk.class)
public class FormaPagamento {
    public static final String ENTITY_NAME = "FORMA_PAGAMENTO";
    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    private int codigoEmpresa;

    @Id
    @Column(name = "CODIGO", nullable = false)
    @JsonProperty("CODIGO")
    private int codigo;

    @Column(name = "NOME", nullable = false)
    @JsonProperty("NOME")
    private String nome;

    @Column(name = "SITUACAO", nullable = false)
    @JsonProperty("SITUACAO")
    private int situacao;

    @Column(name = "PRAZO", nullable = false)
    @JsonProperty("PRAZO")
    private int codigoPrazo;

    @Column(name = "TRAVAR", nullable = false)
    @JsonProperty("TRAVAR")
    private boolean travar;

    @Column(name = "TIPO", nullable = false)
    @JsonProperty("TIPO")
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getCodigoPrazo() {
        return codigoPrazo;
    }

    public void setCodigoPrazo(int codigoPrazo) {
        this.codigoPrazo = codigoPrazo;
    }

    public boolean isTravar() {
        return travar;
    }

    public void setTravar(boolean travar) {
        this.travar = travar;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
