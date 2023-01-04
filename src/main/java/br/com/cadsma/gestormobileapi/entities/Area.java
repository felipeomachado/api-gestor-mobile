package br.com.cadsma.gestormobileapi.entities;

public record Area(
    int codigoEmpresa,
    int codigo,
    String nome,
    int codigoGerente,
    int situacao,
    int excluido
) {
    public static final String COLLECTION_NAME = "Area";
}
