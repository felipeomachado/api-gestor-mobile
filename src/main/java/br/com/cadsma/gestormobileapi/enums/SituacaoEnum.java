package br.com.cadsma.gestormobileapi.enums;

public enum SituacaoEnum {
    ATIVO(1), INATIVO(0);

    private final int codigo;

    SituacaoEnum(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
