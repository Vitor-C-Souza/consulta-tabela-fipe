package br.com.desafio.consultatabelafipe.consultatabelafipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosAnos(
    @JsonAlias("codigo") String codigo,
    @JsonAlias("nome") String nome
) {
    
}
