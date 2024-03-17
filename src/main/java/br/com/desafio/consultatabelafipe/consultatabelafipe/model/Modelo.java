package br.com.desafio.consultatabelafipe.consultatabelafipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Modelo (
    @JsonProperty("codigo")
    int codigo,
    @JsonProperty("nome")
    String nome
) {}

