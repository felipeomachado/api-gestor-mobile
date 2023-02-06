package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.RotaPk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(RotaPk.class)
public class Rota {
    @Id
    private int codigoEmpresa;
    @Id
    private int codigoRca;
    @Id
    private int codigo;
    private String nome;
    private int codigoSetor;
    private int situacao;
    private int excluido;

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
}
