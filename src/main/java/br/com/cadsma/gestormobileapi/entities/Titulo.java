package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.TituloPk;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity
@IdClass(TituloPk.class)
public class Titulo {
    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    private int codigoEmpresa;

    @Id
    @Column(name = "CONTROLE", nullable = false)
    @JsonProperty("CONTROLE")
    private int controle;

    @Column(name = "CLIENTE_CODIGO", nullable = false)
    @JsonProperty("CLIENTE_CODIGO")
    private int codigoCliente;

    @Column(name = "PRE_VENDA", nullable = false)
    @JsonProperty("PRE_VENDA")
    private String preVenda;

    @Column(name = "NUMERO", nullable = false)
    @JsonProperty("NUMERO")
    private String numero;

    @Column(name = "NOTA_FISCAL", nullable = false)
    @JsonProperty("NOTA_FISCAL")
    private String notaFiscal;

    @Column(name = "EMISSAO", nullable = false)
    @JsonProperty("EMISSAO")
    private String dataEmissao;

    @Column(name = "VENCIMENTO", nullable = false)
    @JsonProperty("VENCIMENTO")
    private String dataVencimento;

    @Column(name = "FORMA_PAGAMENTO", nullable = false)
    @JsonProperty("FORMA_PAGAMENTO")
    private int codigoFormaPagamento;

    @Column(name = "VALOR", nullable = false)
    @JsonProperty("VALOR")
    private BigDecimal valorBruto;

    @Column(name = "HAVER", nullable = false)
    @JsonProperty("HAVER")
    private BigDecimal valorHaver;

    @Column(name = "A_RECEBER", nullable = false)
    @JsonProperty("A_RECEBER")
    private BigDecimal valorReceber;

    @Column(name = "SITUACAO", nullable = false)
    @JsonProperty("SITUACAO")
    private int situacao;

    @Column(name = "EXCLUIDO", nullable = false)
    @JsonProperty("EXCLUIDO")
    private int excluido;

    @Column(name = "GRUPO", nullable = false)
    @JsonProperty("GRUPO")
    private int codigoGrupo;

    @Column(name = "JUROS_MORA", nullable = false)
    @JsonProperty("JUROS_MORA")
    private BigDecimal jurosMora;

    @Column(name = "MULTA", nullable = false)
    @JsonProperty("MULTA")
    private BigDecimal muta;

    @Column(name = "DT_SITUACAO", nullable = false)
    @JsonProperty("DT_SITUACAO")
    private String dataSituacao;

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getPreVenda() {
        return preVenda;
    }

    public void setPreVenda(String preVenda) {
        this.preVenda = preVenda;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getCodigoFormaPagamento() {
        return codigoFormaPagamento;
    }

    public void setCodigoFormaPagamento(int codigoFormaPagamento) {
        this.codigoFormaPagamento = codigoFormaPagamento;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    public BigDecimal getValorHaver() {
        return valorHaver;
    }

    public void setValorHaver(BigDecimal valorHaver) {
        this.valorHaver = valorHaver;
    }

    public BigDecimal getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(BigDecimal valorReceber) {
        this.valorReceber = valorReceber;
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

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public BigDecimal getJurosMora() {
        return jurosMora;
    }

    public void setJurosMora(BigDecimal jurosMora) {
        this.jurosMora = jurosMora;
    }

    public BigDecimal getMuta() {
        return muta;
    }

    public void setMuta(BigDecimal muta) {
        this.muta = muta;
    }

    public String getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(String dataSituacao) {
        this.dataSituacao = dataSituacao;
    }
}
