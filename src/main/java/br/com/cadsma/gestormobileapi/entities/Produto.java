package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.ProdutoPk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity
@IdClass(ProdutoPk.class)
public class Produto {
    @Id
    private int codigoEmpresa;
    @Id
    private int codigo;
    private String marca;
    private String nome;
    private String unidadeVenda;
    private BigDecimal descontoMaximo;
    private int codigoFornecedor;
    private BigDecimal peso;
    private BigDecimal precoCompra;
    private BigDecimal precoMinimoVenda;
    private BigDecimal precoVenda;
    private BigDecimal precoVenda2;
    private BigDecimal precoVenda3;
    private BigDecimal precoVenda4;
    private BigDecimal precoVenda5;
    private BigDecimal precoVenda6;
    private BigDecimal precoVenda7;
    private int codigoTributacao;
    private boolean promocao;
    private int grupo;
    private BigDecimal saldo;
    private int qtdEmbalagem;
    private BigDecimal qtdAtacado;
    private int situacao;
    private int excluido;
    private String codigoBarras;
    private BigDecimal fator;
    private boolean balanca;
    private int consumo;
    private String secao;
    private String substancia;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidadeVenda() {
        return unidadeVenda;
    }

    public void setUnidadeVenda(String unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
    }

    public BigDecimal getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(BigDecimal descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoMinimoVenda() {
        return precoMinimoVenda;
    }

    public void setPrecoMinimoVenda(BigDecimal precoMinimoVenda) {
        this.precoMinimoVenda = precoMinimoVenda;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public BigDecimal getPrecoVenda2() {
        return precoVenda2;
    }

    public void setPrecoVenda2(BigDecimal precoVenda2) {
        this.precoVenda2 = precoVenda2;
    }

    public BigDecimal getPrecoVenda3() {
        return precoVenda3;
    }

    public void setPrecoVenda3(BigDecimal precoVenda3) {
        this.precoVenda3 = precoVenda3;
    }

    public BigDecimal getPrecoVenda4() {
        return precoVenda4;
    }

    public void setPrecoVenda4(BigDecimal precoVenda4) {
        this.precoVenda4 = precoVenda4;
    }

    public BigDecimal getPrecoVenda5() {
        return precoVenda5;
    }

    public void setPrecoVenda5(BigDecimal precoVenda5) {
        this.precoVenda5 = precoVenda5;
    }

    public BigDecimal getPrecoVenda6() {
        return precoVenda6;
    }

    public void setPrecoVenda6(BigDecimal precoVenda6) {
        this.precoVenda6 = precoVenda6;
    }

    public BigDecimal getPrecoVenda7() {
        return precoVenda7;
    }

    public void setPrecoVenda7(BigDecimal precoVenda7) {
        this.precoVenda7 = precoVenda7;
    }

    public int getCodigoTributacao() {
        return codigoTributacao;
    }

    public void setCodigoTributacao(int codigoTributacao) {
        this.codigoTributacao = codigoTributacao;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public int getQtdEmbalagem() {
        return qtdEmbalagem;
    }

    public void setQtdEmbalagem(int qtdEmbalagem) {
        this.qtdEmbalagem = qtdEmbalagem;
    }

    public BigDecimal getQtdAtacado() {
        return qtdAtacado;
    }

    public void setQtdAtacado(BigDecimal qtdAtacado) {
        this.qtdAtacado = qtdAtacado;
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

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public BigDecimal getFator() {
        return fator;
    }

    public void setFator(BigDecimal fator) {
        this.fator = fator;
    }

    public boolean isBalanca() {
        return balanca;
    }

    public void setBalanca(boolean balanca) {
        this.balanca = balanca;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getSubstancia() {
        return substancia;
    }

    public void setSubstancia(String substancia) {
        this.substancia = substancia;
    }
}
