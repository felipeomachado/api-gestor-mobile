package br.com.cadsma.gestormobileapi.entities;

import br.com.cadsma.gestormobileapi.entities.pks.GrupoPk;
import br.com.cadsma.gestormobileapi.entities.pks.MetaPk;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity(name = Meta.ENTITY_NAME)
@IdClass(MetaPk.class)
public class Meta {
    public static final String ENTITY_NAME = "META";

    @Id
    @Column(name = "EMPRESA_CODIGO", nullable = false)
    @JsonProperty("EMPRESA_CODIGO")
    private int codigoEmpresa;

    @Id
    @Column(name = "CODIGO", nullable = false)
    @JsonProperty("CODIGO")
    private int codigo;

    @Id
    @Column(name = "ANO_BASE", nullable = false)
    @JsonProperty("ANO_BASE")
    private int anoBase;

    @Id
    @Column(name = "TIPO", nullable = false)
    @JsonProperty("TIPO")
    private int tipo;

    @Column(name = "CHAVE", nullable = false)
    @JsonProperty("CHAVE")
    private int chave;

    @Column(name = "META_01", nullable = false)
    @JsonProperty("META_01")
    private BigDecimal meta01;

    @Column(name = "META_02", nullable = false)
    @JsonProperty("META_02")
    private BigDecimal meta02;

    @Column(name = "META_03", nullable = false)
    @JsonProperty("META_03")
    private BigDecimal meta03;

    @Column(name = "META_04", nullable = false)
    @JsonProperty("META_04")
    private BigDecimal meta04;

    @Column(name = "META_05", nullable = false)
    @JsonProperty("META_05")
    private BigDecimal meta05;

    @Column(name = "META_06", nullable = false)
    @JsonProperty("META_06")
    private BigDecimal meta06;

    @Column(name = "META_07", nullable = false)
    @JsonProperty("META_07")
    private BigDecimal meta07;

    @Column(name = "META_08", nullable = false)
    @JsonProperty("META_08")
    private BigDecimal meta08;

    @Column(name = "META_09", nullable = false)
    @JsonProperty("META_09")
    private BigDecimal meta09;

    @Column(name = "META_10", nullable = false)
    @JsonProperty("META_10")
    private BigDecimal meta10;

    @Column(name = "META_11", nullable = false)
    @JsonProperty("META_11")
    private BigDecimal meta11;

    @Column(name = "META_12", nullable = false)
    @JsonProperty("META_12")
    private BigDecimal meta12;

    @Column(name = "ATINGIDO_01", nullable = false)
    @JsonProperty("ATINGIDO_01")
    private BigDecimal atingido01;

    @Column(name = "ATINGIDO_02", nullable = false)
    @JsonProperty("ATINGIDO_02")
    private BigDecimal atingido02;

    @Column(name = "ATINGIDO_03", nullable = false)
    @JsonProperty("ATINGIDO_03")
    private BigDecimal atingido03;

    @Column(name = "ATINGIDO_04", nullable = false)
    @JsonProperty("ATINGIDO_04")
    private BigDecimal atingido04;

    @Column(name = "ATINGIDO_05", nullable = false)
    @JsonProperty("ATINGIDO_05")
    private BigDecimal atingido05;

    @Column(name = "ATINGIDO_06", nullable = false)
    @JsonProperty("ATINGIDO_06")
    private BigDecimal atingido06;

    @Column(name = "ATINGIDO_07", nullable = false)
    @JsonProperty("ATINGIDO_07")
    private BigDecimal atingido07;

    @Column(name = "ATINGIDO_08", nullable = false)
    @JsonProperty("ATINGIDO_08")
    private BigDecimal atingido08;

    @Column(name = "ATINGIDO_09", nullable = false)
    @JsonProperty("ATINGIDO_09")
    private BigDecimal atingido09;

    @Column(name = "ATINGIDO_10", nullable = false)
    @JsonProperty("ATINGIDO_10")
    private BigDecimal atingido10;

    @Column(name = "ATINGIDO_11", nullable = false)
    @JsonProperty("ATINGIDO_11")
    private BigDecimal atingido11;

    @Column(name = "ATINGIDO_12", nullable = false)
    @JsonProperty("ATINGIDO_12")
    private BigDecimal atingido12;

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

    public int getAnoBase() {
        return anoBase;
    }

    public void setAnoBase(int anoBase) {
        this.anoBase = anoBase;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public BigDecimal getMeta01() {
        return meta01;
    }

    public void setMeta01(BigDecimal meta01) {
        this.meta01 = meta01;
    }

    public BigDecimal getMeta02() {
        return meta02;
    }

    public void setMeta02(BigDecimal meta02) {
        this.meta02 = meta02;
    }

    public BigDecimal getMeta03() {
        return meta03;
    }

    public void setMeta03(BigDecimal meta03) {
        this.meta03 = meta03;
    }

    public BigDecimal getMeta04() {
        return meta04;
    }

    public void setMeta04(BigDecimal meta04) {
        this.meta04 = meta04;
    }

    public BigDecimal getMeta05() {
        return meta05;
    }

    public void setMeta05(BigDecimal meta05) {
        this.meta05 = meta05;
    }

    public BigDecimal getMeta06() {
        return meta06;
    }

    public void setMeta06(BigDecimal meta06) {
        this.meta06 = meta06;
    }

    public BigDecimal getMeta07() {
        return meta07;
    }

    public void setMeta07(BigDecimal meta07) {
        this.meta07 = meta07;
    }

    public BigDecimal getMeta08() {
        return meta08;
    }

    public void setMeta08(BigDecimal meta08) {
        this.meta08 = meta08;
    }

    public BigDecimal getMeta09() {
        return meta09;
    }

    public void setMeta09(BigDecimal meta09) {
        this.meta09 = meta09;
    }

    public BigDecimal getMeta10() {
        return meta10;
    }

    public void setMeta10(BigDecimal meta10) {
        this.meta10 = meta10;
    }

    public BigDecimal getMeta11() {
        return meta11;
    }

    public void setMeta11(BigDecimal meta11) {
        this.meta11 = meta11;
    }

    public BigDecimal getMeta12() {
        return meta12;
    }

    public void setMeta12(BigDecimal meta12) {
        this.meta12 = meta12;
    }

    public BigDecimal getAtingido01() {
        return atingido01;
    }

    public void setAtingido01(BigDecimal atingido01) {
        this.atingido01 = atingido01;
    }

    public BigDecimal getAtingido02() {
        return atingido02;
    }

    public void setAtingido02(BigDecimal atingido02) {
        this.atingido02 = atingido02;
    }

    public BigDecimal getAtingido03() {
        return atingido03;
    }

    public void setAtingido03(BigDecimal atingido03) {
        this.atingido03 = atingido03;
    }

    public BigDecimal getAtingido04() {
        return atingido04;
    }

    public void setAtingido04(BigDecimal atingido04) {
        this.atingido04 = atingido04;
    }

    public BigDecimal getAtingido05() {
        return atingido05;
    }

    public void setAtingido05(BigDecimal atingido05) {
        this.atingido05 = atingido05;
    }

    public BigDecimal getAtingido06() {
        return atingido06;
    }

    public void setAtingido06(BigDecimal atingido06) {
        this.atingido06 = atingido06;
    }

    public BigDecimal getAtingido07() {
        return atingido07;
    }

    public void setAtingido07(BigDecimal atingido07) {
        this.atingido07 = atingido07;
    }

    public BigDecimal getAtingido08() {
        return atingido08;
    }

    public void setAtingido08(BigDecimal atingido08) {
        this.atingido08 = atingido08;
    }

    public BigDecimal getAtingido09() {
        return atingido09;
    }

    public void setAtingido09(BigDecimal atingido09) {
        this.atingido09 = atingido09;
    }

    public BigDecimal getAtingido10() {
        return atingido10;
    }

    public void setAtingido10(BigDecimal atingido10) {
        this.atingido10 = atingido10;
    }

    public BigDecimal getAtingido11() {
        return atingido11;
    }

    public void setAtingido11(BigDecimal atingido11) {
        this.atingido11 = atingido11;
    }

    public BigDecimal getAtingido12() {
        return atingido12;
    }

    public void setAtingido12(BigDecimal atingido12) {
        this.atingido12 = atingido12;
    }
}
