package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.FormaPagamentoPk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(FormaPagamentoPk.class)
public class FormaPagamento {
    @Id
    private int codigoEmpresa;
    @Id
    private int codigo;
    private String nome;
    private int situacao;
    private int codigoPrazo;
    private boolean travar;
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
