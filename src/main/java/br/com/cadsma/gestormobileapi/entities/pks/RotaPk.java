package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;

public class RotaPk implements Serializable {
    private int codigoEmpresa;
    private int codigoRca;
    private int codigo;

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
}
