package br.com.desafio.consultatabelafipe.consultatabelafipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
