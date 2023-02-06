package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.SegmentoPk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(SegmentoPk.class)
public class Segmento {
    @Id
    private int codigoEmpresa;
    @Id
    private int codigo;
    private String nome;
    private int excluido;

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

    public int getExcluido() {
        return excluido;
    }

    public void setExcluido(int excluido) {
        this.excluido = excluido;
    }
}
