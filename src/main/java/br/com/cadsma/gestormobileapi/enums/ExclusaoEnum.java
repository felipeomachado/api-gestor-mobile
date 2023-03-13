package br.com.cadsma.gestormobileapi.enums;

public enum ExclusaoEnum {
    NAO_EXCLUIDO(0), EXCLUIDO(1);

    private final int codigo;

    ExclusaoEnum(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
