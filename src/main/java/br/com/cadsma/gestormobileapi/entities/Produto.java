package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.ProdutoPk;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity(name = Produto.ENTITY_NAME)
@IdClass(ProdutoPk.class)
public class Produto {
    public static final String ENTITY_NAME = "PRODUTO";

    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    private int codigoEmpresa;

    @Id
    @Column(name = "CODIGO", nullable = false)
    @JsonProperty("CODIGO")
    private int codigo;

    @Column(name = "MARCA")
    @JsonProperty("MARCA")
    private String marca;

    @Column(name = "NOME")
    @JsonProperty("NOME")
    private String nome;

    @Column(name = "UNIDADE_VENDA")
    @JsonProperty("UNIDADE_VENDA")
    private String unidadeVenda;

    @Column(name = "DESCONTO_MAXIMO")
    @JsonProperty("DESCONTO_MAXIMO")
    private BigDecimal descontoMaximo;

    @Column(name = "FORNECEDOR")
    @JsonProperty("FORNECEDOR")
    private int codigoFornecedor;

    @Column(name = "PESO")
    @JsonProperty("PESO")
    private BigDecimal peso;

    @Column(name = "PRECO_COMPRA")
    @JsonProperty("PRECO_COMPRA")
    private BigDecimal precoCompra;

    @Column(name = "PRECO_MINIMO_VENDA")
    @JsonProperty("PRECO_MINIMO_VENDA")
    private BigDecimal precoMinimoVenda;

    @Column(name = "PRECO_VENDA")
    @JsonProperty("PRECO_VENDA")
    private BigDecimal precoVenda;

    @Column(name = "PRECO_VENDA2")
    @JsonProperty("PRECO_VENDA2")
    private BigDecimal precoVenda2;

    @Column(name = "PRECO_VENDA3")
    @JsonProperty("PRECO_VENDA3")
    private BigDecimal precoVenda3;

    @Column(name = "PRECO_VENDA4")
    @JsonProperty("PRECO_VENDA4")
    private BigDecimal precoVenda4;

    @Column(name = "PRECO_VENDA5")
    @JsonProperty("PRECO_VENDA5")
    private BigDecimal precoVenda5;

    @Column(name = "PRECO_VENDA6")
    @JsonProperty("PRECO_VENDA6")
    private BigDecimal precoVenda6;

    @Column(name = "PRECO_VENDA7")
    @JsonProperty("PRECO_VENDA7")
    private BigDecimal precoVenda7;

    @Column(name = "COD_TRIBUTACAO", nullable = false)
    @JsonProperty("COD_TRIBUTACAO")
    private int codigoTributacao;

    @Column(name = "PROMOCAO")
    @JsonProperty("PROMOCAO")
    private boolean promocao;

    @Column(name = "GRUPO", nullable = false)
    @JsonProperty("GRUPO")
    private int grupo;

    @Column(name = "SALDO")
    @JsonProperty("SALDO")
    private BigDecimal saldo;

    @Column(name = "QTDE_EMBALAGEM")
    @JsonProperty("QTDE_EMBALAGEM")
    private int qtdEmbalagem;

    @Column(name = "QTD_ATACADO", nullable = false)
    @JsonProperty("QTD_ATACADO")
    private BigDecimal qtdAtacado;

    @Column(name = "SITUACAO")
    @JsonProperty("SITUACAO")
    private int situacao;

    @Column(name = "EXCLUIDO")
    @JsonProperty("EXCLUIDO")
    private int excluido;

    @Column(name = "CODIGO_BARRAS")
    @JsonProperty("CODIGO_BARRAS")
    private String codigoBarras;

    @Column(name = "FATOR")
    @JsonProperty("FATOR")
    private BigDecimal fator;

    @Column(name = "BALANCA")
    @JsonProperty("BALANCA")
    private boolean balanca;

    @Column(name = "CONSUMO", nullable = false)
    @JsonProperty("CONSUMO")
    private int consumo;

    @Column(name = "SECAO")
    @JsonProperty("SECAO")
    private String secao;

    @Column(name = "SUBSTANCIA")
    @JsonProperty("SUBSTANCIA")
    private String substancia;

    @Column(name = "PRECO_CUSTO")
    @JsonProperty("PRECO_CUSTO")
    private String precoCusto;

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

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }
}
