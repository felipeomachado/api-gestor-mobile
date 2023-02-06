package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.RcaPk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(RcaPk.class)
public class Rca {
    @Id
    private int codigoEmpresa;
    @Id
    private int codigo;
    private String nome;
    private int codigoEquipe;

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

    public int getCodigoEquipe() {
        return codigoEquipe;
    }

    public void setCodigoEquipe(int codigoEquipe) {
        this.codigoEquipe = codigoEquipe;
    }
}
