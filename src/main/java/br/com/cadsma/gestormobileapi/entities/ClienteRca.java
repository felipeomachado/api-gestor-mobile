package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.ClienteRcaPk;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = ClienteRca.ENTITY_NAME)
@IdClass(ClienteRcaPk.class)
public class ClienteRca {
    public static final String ENTITY_NAME = "CLIENTE_RCA";
    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    private int codigoEmpresa;
    @Id
    @Column(name = "RCA_CODIGO", nullable = false)
    @JsonProperty("RCA_CODIGO")
    private int codigoRca;
    @Id
    @Column(name = "CLIENTE_CODIGO", nullable = false)
    @JsonProperty("CLIENTE_CODIGO")
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
}
