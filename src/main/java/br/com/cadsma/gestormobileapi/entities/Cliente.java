package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.ClientePk;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity(name = Cliente.ENTITY_NAME)
@IdClass(ClientePk.class)
public class Cliente {
    public static final String ENTITY_NAME = "CLIENTE";
    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    private int codigoEmpresa;

    @Id
    @Column(name = "CODIGO", nullable = false)
    @JsonProperty("CODIGO")
    private int codigo;

    @Column(name = "RAZAO_SOCIAL", length = 150)
    @JsonProperty("RAZAO_SOCIAL")
    private String razaoSocial;

    @Column(name = "NOME_FANTASIA", length = 100)
    @JsonProperty("NOME_FANTASIA")
    private String nomeFantasia;

    @Column(name = "ENDERECO", length = 100)
    @JsonProperty("ENDERECO")
    private String endereco;

    @Column(name = "BAIRRO", length = 30)
    @JsonProperty("BAIRRO")
    private String bairro;

    @Column(name = "CD_CIDADE")
    @JsonProperty("CD_CIDADE")
    private int codigoCidade;

    @Column(name = "CIDADE", length = 100)
    @JsonProperty("CIDADE")
    private String cidade;

    @Column(name = "UF", length = 2)
    @JsonProperty("UF")
    private String uf;

    @Column(name = "CEP", length = 10)
    @JsonProperty("CEP")
    private String cep;

    @Column(name = "CATEGORIA", length = 1, nullable = false)
    @JsonProperty("CATEGORIA")
    private String categoria;

    @Column(name = "CNPJ", length = 18)
    @JsonProperty("CNPJ")
    private String cnpj;

    @Column(name = "IE", length = 20)
    @JsonProperty("IE")
    private String ie;

    @Column(name = "CONTATO", length = 100)
    @JsonProperty("CONTATO")
    private String contato;

    @Column(name = "TELEFONE1", length = 15)
    @JsonProperty("TELEFONE1")
    private String telefone1;

    @Column(name = "TELEFONE2", length = 15)
    @JsonProperty("TELEFONE2")
    private String telefone2;

    @Column(name = "FAX", length = 15)
    @JsonProperty("FAX")
    private String fax;

    @Column(name = "EMAIL", length = 100)
    @JsonProperty("EMAIL")
    private String email;

    @Column(name = "TABELA")
    @JsonProperty("TABELA")
    private int tabela;

    @Column(name = "LIMITE", scale = 2, precision = 15)
    @JsonProperty("LIMITE")
    private BigDecimal limite;

    @Column(name = "VISITA")
    @JsonProperty("VISITA")
    private int visita;

    @Column(name = "ROTA")
    @JsonProperty("ROTA")
    private int rota;

    @Column(name = "INTINERARIO")
    @JsonProperty("INTINERARIO")
    private int itinerario;

    @Column(name = "TIPO", length = 1)
    @JsonProperty("TIPO")
    private String tipo;

    @Column(name = "STATUS")
    @JsonProperty("STATUS")
    private int status;

    @Column(name = "FORMA_PAGAMENTO")
    @JsonProperty("FORMA_PAGAMENTO")
    private int codigoFormaPagamento;

    @Column(name = "PRAZO")
    @JsonProperty("PRAZO")
    private int codigoPrazo;

    @Column(name = "LATITUDE", length = 100)
    @JsonProperty("LATITUDE")
    private String latitude;

    @Column(name = "LONGITUDE", length = 100)
    @JsonProperty("LONGITUDE")
    private String longitude;

    @Column(name = "DATA_NASCIMENTO", length = 15)
    @JsonProperty("DATA_NASCIMENTO")
    private String dataNascimento;

    @Column(name = "SITUACAO")
    @JsonProperty("SITUACAO")
    private int situacao = 0;

    @Column(name = "EXCLUIDO")
    @JsonProperty("EXCLUIDO")
    private int excluido;

    @Column(name = "SINCRONIZADO")
    @JsonProperty("SINCRONIZADO")
    private int sincronizado = 0;

    @Column(name = "CLI_GIRO", nullable = false)
    @JsonProperty("CLI_GIRO")
    private int giro = 3;

    @Column(name = "PONTO_REFERENCIA", length = 60)
    @JsonProperty("PONTO_REFERENCIA")
    private String pontoReferencia;

    @Column(name = "DATA_ULT_COMPRA", length = 11)
    @JsonProperty("DATA_ULT_COMPRA")
    private String dataUltimaCompra;

    @Column(name = "CODIGO_SEGMENTO", nullable = false)
    @JsonProperty("CODIGO_SEGMENTO")
    private int codigoSegmento;

    @Column(name = "SEGMENTO", length = 50)
    @JsonProperty("SEGMENTO")
    private String segmento;

    @Column(name = "DESCONTO_PADRAO", scale = 2, precision = 6, nullable = false)
    @JsonProperty("DESCONTO_PADRAO")
    private BigDecimal descontoPadrao;

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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
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

    public int getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(int codigoCidade) {
        this.codigoCidade = codigoCidade;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTabela() {
        return tabela;
    }

    public void setTabela(int tabela) {
        this.tabela = tabela;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public int getVisita() {
        return visita;
    }

    public void setVisita(int visita) {
        this.visita = visita;
    }

    public int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        this.rota = rota;
    }

    public int getItinerario() {
        return itinerario;
    }

    public void setItinerario(int itinerario) {
        this.itinerario = itinerario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCodigoFormaPagamento() {
        return codigoFormaPagamento;
    }

    public void setCodigoFormaPagamento(int codigoFormaPagamento) {
        this.codigoFormaPagamento = codigoFormaPagamento;
    }

    public int getCodigoPrazo() {
        return codigoPrazo;
    }

    public void setCodigoPrazo(int codigoPrazo) {
        this.codigoPrazo = codigoPrazo;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public String getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(String dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }

    public int getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(int codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public BigDecimal getDescontoPadrao() {
        return descontoPadrao;
    }

    public void setDescontoPadrao(BigDecimal descontoPadrao) {
        this.descontoPadrao = descontoPadrao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getSincronizado() {
        return sincronizado;
    }

    public void setSincronizado(int sincronizado) {
        this.sincronizado = sincronizado;
    }
}
