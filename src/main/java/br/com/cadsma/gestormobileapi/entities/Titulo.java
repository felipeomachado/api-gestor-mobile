package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.TituloPk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity
@IdClass(TituloPk.class)
public class Titulo {
    @Id
    private int codigoEmpresa;
    @Id
    private int controle;
    private int codigoCliente;
    private String preVenda;
    private String numero;
    private String notaFiscal;
    private String dataEmissao;
    private String dataVencimento;
    private int codigoFormaPagamento;
    private BigDecimal valorBruto;
    private BigDecimal valorHaver;
    private BigDecimal valorReceber;
    private int situacao;
    private int excluido;
    private int codigoGrupo;

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
}
