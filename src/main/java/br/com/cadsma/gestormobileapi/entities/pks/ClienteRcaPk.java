package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

public class ClienteRcaPk implements Serializable {
    private int codigoEmpresa;
    private int codigoRca;
    private int codigoCliente;

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

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteRcaPk that = (ClienteRcaPk) o;
        return codigoEmpresa == that.codigoEmpresa && codigoRca == that.codigoRca && codigoCliente == that.codigoCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, codigoRca, codigoCliente);
    }
}
