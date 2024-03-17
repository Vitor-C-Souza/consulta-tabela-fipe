package br.com.desafio.consultatabelafipe.consultatabelafipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosResultado(
    @JsonAlias("Valor") String valor,
    @JsonAlias("Marca") String Marca,
    @JsonAlias("Modelo") String Modelo,
    @JsonAlias("AnoModelo") String AnoModelo,
    @JsonAlias("Combustivel") String Combustivel,
    @JsonAlias("CodigoFipe") String CodigoFipe,
    @JsonAlias("MesReferencia") String MesReferencia,
    @JsonAlias("SiglaCombustivel") String SiglaCombustivel
) {
    
}
