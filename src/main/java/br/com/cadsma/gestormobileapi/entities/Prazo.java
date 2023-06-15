package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.PrazoPk;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity(name = Prazo.ENTITY_NAME)
@IdClass(PrazoPk.class)
public class Prazo {
    public static final String ENTITY_NAME = "PRAZO";
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

    @Column(name = "TABELA", nullable = false)
    @JsonProperty("TABELA")
    private int tabela;

    @Column(name = "ORDEM", nullable = false)
    @JsonProperty("ORDEM")
    private int ordem;

    @Column(name = "DIAS", nullable = false)
    @JsonProperty("DIAS")
    private int dias;

    @Column(name = "DIAS2", nullable = false)
    @JsonProperty("DIAS2")
    private int dias2;

    @Column(name = "PARCELAS", nullable = false)
    @JsonProperty("PARCELAS")
    private int parcelas;

    @Column(name = "PEDIDO_MINIMO", nullable = false)
    @JsonProperty("PEDIDO_MINIMO")
    private BigDecimal pedidoMinimo;

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

    public int getTabela() {
        return tabela;
    }

    public void setTabela(int tabela) {
        this.tabela = tabela;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDias2() {
        return dias2;
    }

    public void setDias2(int dias2) {
        this.dias2 = dias2;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public BigDecimal getPedidoMinimo() {
        return pedidoMinimo;
    }

    public void setPedidoMinimo(BigDecimal pedidoMinimo) {
        this.pedidoMinimo = pedidoMinimo;
    }
}
