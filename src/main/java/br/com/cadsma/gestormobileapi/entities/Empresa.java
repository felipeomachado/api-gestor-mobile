package br.com.cadsma.gestormobileapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity(name = Empresa.ENTITY_NAME)
public class Empresa {
    public static final String ENTITY_NAME = "EMPRESA";

    @Id
    @Column(name = "CODIGO", nullable = false)
    @JsonProperty("CODIGO")
    @ApiModelProperty(example = "2", required = true)
    private Long codigoEmpresa;

    @Column(name = "NOME", nullable = false, length = 200)
    @JsonProperty("NOME")
    @ApiModelProperty(example = "Empresa Abv", required = true)
    private String nome;

    @Column(name = "FANTASIA", length = 200)
    @JsonProperty("FANTASIA")
    @ApiModelProperty(example = "Fantasia")
    private String fantasia;

    @Column(name = "CASAS_DECIMAIS_PRECO_VENDA", nullable = false)
    @JsonProperty("CASAS_DECIMAIS_PRECO_VENDA")
    @ApiModelProperty(example = "1", required = true)
    private int casasDecimalPrecoVenda;

    @Column(name = "CASAS_DECIMAIS_QTDE_VENDA", nullable = false)
    @JsonProperty("CASAS_DECIMAIS_QTDE_VENDA")
    @ApiModelProperty(example = "1", required = true)
    private int casasDecimaisQtdeVenda;

    @Column(name = "GPS_PEDIDO", length = 5)
    @JsonProperty("GPS_PEDIDO")
    @ApiModelProperty(example = "123")
    private String gpsPedido;

    @Column(name = "GPS_TRACK", length = 5)
    @JsonProperty("GPS_TRACK")
    @ApiModelProperty(example = "123")
    private String gpsTrack;

    @Column(name = "QTD_MESES_MEDIA_SUGESTAO", nullable = false)
    @JsonProperty("QTD_MESES_MEDIA_SUGESTAO")
    @ApiModelProperty(example = "1", required = true)
    private int qtdMesesMediaSugestao;

    @Column(name = "ENDERECO", length = 500)
    @JsonProperty("ENDERECO")
    @ApiModelProperty(example = "123")
    private String endereco;

    @Column(name = "BAIRRO", length = 30)
    @JsonProperty("BAIRRO")
    @ApiModelProperty(example = "123")
    private String bairro;

    @Column(name = "CIDADE", length = 30)
    @JsonProperty("CIDADE")
    @ApiModelProperty(example = "123")
    private String cidade;

    @Column(name = "UF", length = 2)
    @JsonProperty("UF")
    @ApiModelProperty(example = "123")
    private String uf;

    @Column(name = "TELEFONE", length = 30)
    @JsonProperty("TELEFONE")
    @ApiModelProperty(example = "123")
    private String telefone;

    @Column(name = "PERMITE_DESCONTO", nullable = false)
    @JsonProperty("PERMITE_DESCONTO")
    @ApiModelProperty(example = "false", required = true)
    private boolean permiteDesconto;

    @Column(name = "TIPO_DESCONTO", nullable = false)
    @JsonProperty("TIPO_DESCONTO")
    @ApiModelProperty(example = "1", required = true)
    private int tipoDesconto;

    @Column(name = "STATUS", nullable = false)
    @JsonProperty("STATUS")
    @ApiModelProperty(example = "1", required = true)
    private int status;

    @Column(name = "DATA_INICIAL")
    @JsonProperty("DATA_INICIAL")
    private LocalDate dataInicial;

    @Column(name = "TIPO_HIS_COMPRAS", nullable = false)
    @JsonProperty("TIPO_HIS_COMPRAS")
    @ApiModelProperty(example = "1", required = true)
    private int tipoHistoricoCompras;

    @Column(name = "CONTROLA_SALDO", nullable = false)
    @JsonProperty("CONTROLA_SALDO")
    @ApiModelProperty(example = "false", required = true)
    private boolean controlaSaldo;

    @Column(name = "APENAS_C_PRECO", nullable = false)
    @JsonProperty("APENAS_C_PRECO")
    @ApiModelProperty(example = "false", required = true)
    private boolean apenasComPreco;

    @Column(name = "BLOQ_ENV_PEDIDO_CLI_DEBITO", nullable = false)
    @JsonProperty("BLOQ_ENV_PEDIDO_CLI_DEBITO")
    @ApiModelProperty(example = "false", required = true)
    private boolean bloqEnvioPedidoClienteComDebito;

    @Column(name = "TRAVAR_CLI_LIMITE", nullable = false)
    @JsonProperty("TRAVAR_CLI_LIMITE")
    @ApiModelProperty(example = "false", required = true)
    private boolean travarClienteLimite;

    @Column(name = "PERCENT_REAJUSTE_CONSUMIDOR", nullable = false, precision = 10, scale = 2)
    @JsonProperty("PERCENT_REAJUSTE_CONSUMIDOR")
    @ApiModelProperty(example = "12", required = true)
    private BigDecimal percentualReajusteConsumidor;

    @Column(name = "PERCENTUAL_FINAN_PRAZO", nullable = false, precision = 10, scale = 2)
    @JsonProperty("PERCENTUAL_FINAN_PRAZO")
    @ApiModelProperty(example = "12", required = true)
    private BigDecimal percentualFinanPrazo;

    @Column(name = "PROD_SEM_SALDO_VENDA")
    @JsonProperty("PROD_SEM_SALDO_VENDA")
    @ApiModelProperty(example = "false")
    private boolean prodSemSaldoVenda;

    @Column(name = "LIMITE_DESCONTO", nullable = false, precision = 6, scale = 2)
    @JsonProperty("LIMITE_DESCONTO")
    @ApiModelProperty(example = "12", required = true)
    private BigDecimal limiteDesconto;

    @Column(name = "EXPORTAR_TITULOS_LIQUIDADOS", nullable = false)
    @JsonProperty("EXPORTAR_TITULOS_LIQUIDADOS")
    @ApiModelProperty(example = "false", required = true)
    private boolean exportarTitulosLiquidados;


    public Long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public int getCasasDecimalPrecoVenda() {
        return casasDecimalPrecoVenda;
    }

    public void setCasasDecimalPrecoVenda(int casasDecimalPrecoVenda) {
        this.casasDecimalPrecoVenda = casasDecimalPrecoVenda;
    }

    public int getCasasDecimaisQtdeVenda() {
        return casasDecimaisQtdeVenda;
    }

    public void setCasasDecimaisQtdeVenda(int casasDecimaisQtdeVenda) {
        this.casasDecimaisQtdeVenda = casasDecimaisQtdeVenda;
    }

    public String getGpsPedido() {
        return gpsPedido;
    }

    public void setGpsPedido(String gpsPedido) {
        this.gpsPedido = gpsPedido;
    }

    public String getGpsTrack() {
        return gpsTrack;
    }

    public void setGpsTrack(String gpsTrack) {
        this.gpsTrack = gpsTrack;
    }

    public int getQtdMesesMediaSugestao() {
        return qtdMesesMediaSugestao;
    }

    public void setQtdMesesMediaSugestao(int qtdMesesMediaSugestao) {
        this.qtdMesesMediaSugestao = qtdMesesMediaSugestao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isPermiteDesconto() {
        return permiteDesconto;
    }

    public void setPermiteDesconto(boolean permiteDesconto) {
        this.permiteDesconto = permiteDesconto;
    }

    public int getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(int tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public int getTipoHistoricoCompras() {
        return tipoHistoricoCompras;
    }

    public void setTipoHistoricoCompras(int tipoHistoricoCompras) {
        this.tipoHistoricoCompras = tipoHistoricoCompras;
    }

    public boolean isControlaSaldo() {
        return controlaSaldo;
    }

    public void setControlaSaldo(boolean controlaSaldo) {
        this.controlaSaldo = controlaSaldo;
    }

    public boolean isApenasComPreco() {
        return apenasComPreco;
    }

    public void setApenasComPreco(boolean apenasComPreco) {
        this.apenasComPreco = apenasComPreco;
    }

    public boolean isBloqEnvioPedidoClienteComDebito() {
        return bloqEnvioPedidoClienteComDebito;
    }

    public void setBloqEnvioPedidoClienteComDebito(boolean bloqEnvioPedidoClienteComDebito) {
        this.bloqEnvioPedidoClienteComDebito = bloqEnvioPedidoClienteComDebito;
    }

    public boolean isTravarClienteLimite() {
        return travarClienteLimite;
    }

    public void setTravarClienteLimite(boolean travarClienteLimite) {
        this.travarClienteLimite = travarClienteLimite;
    }

    public BigDecimal getPercentualReajusteConsumidor() {
        return percentualReajusteConsumidor;
    }

    public void setPercentualReajusteConsumidor(BigDecimal percentualReajusteConsumidor) {
        this.percentualReajusteConsumidor = percentualReajusteConsumidor;
    }

    public BigDecimal getPercentualFinanPrazo() {
        return percentualFinanPrazo;
    }

    public void setPercentualFinanPrazo(BigDecimal percentualFinanPrazo) {
        this.percentualFinanPrazo = percentualFinanPrazo;
    }

    public boolean isProdSemSaldoVenda() {
        return prodSemSaldoVenda;
    }

    public void setProdSemSaldoVenda(boolean prodSemSaldoVenda) {
        this.prodSemSaldoVenda = prodSemSaldoVenda;
    }

    public BigDecimal getLimiteDesconto() {
        return limiteDesconto;
    }

    public void setLimiteDesconto(BigDecimal limiteDesconto) {
        this.limiteDesconto = limiteDesconto;
    }

    public boolean isExportarTitulosLiquidados() {
        return exportarTitulosLiquidados;
    }

    public void setExportarTitulosLiquidados(boolean exportarTitulosLiquidados) {
        this.exportarTitulosLiquidados = exportarTitulosLiquidados;
    }
}
