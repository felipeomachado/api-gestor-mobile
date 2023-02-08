package br.com.cadsma.gestormobileapi.entities.pks;

import java.io.Serializable;
import java.util.Objects;

public class GrupoEquipePk implements Serializable {
    private int codigoEmpresa;
    private int codigoGrupo;
    private int codigoEquipe;

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public int getCodigoEquipe() {
        return codigoEquipe;
    }

    public void setCodigoEquipe(int codigoEquipe) {
        this.codigoEquipe = codigoEquipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrupoEquipePk that = (GrupoEquipePk) o;
        return codigoEmpresa == that.codigoEmpresa && codigoGrupo == that.codigoGrupo && codigoEquipe == that.codigoEquipe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEmpresa, codigoGrupo, codigoEquipe);
    }
}
