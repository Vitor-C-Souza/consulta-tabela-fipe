package br.com.desafio.consultatabelafipe.Menu;



import java.util.List;

import br.com.desafio.consultatabelafipe.consultatabelafipe.model.DadosAnos;
import br.com.desafio.consultatabelafipe.consultatabelafipe.model.DadosModelos;
import br.com.desafio.consultatabelafipe.consultatabelafipe.model.DadosResultado;
import br.com.desafio.consultatabelafipe.consultatabelafipe.model.DadosVeiculos;
import br.com.desafio.consultatabelafipe.consultatabelafipe.model.Modelo;
import br.com.desafio.consultatabelafipe.consultatabelafipe.service.ConsumoAPI;
import br.com.desafio.consultatabelafipe.consultatabelafipe.service.ConverteDados;

public class Menu {
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";

    public void getVeiculo(String Veiculo) {
        ENDERECO = ENDERECO + Veiculo + "/marcas/";

        var json = consumoAPI.obterDados(ENDERECO);        
        DadosVeiculos[] DadosVeiculos = conversor.obterDados(json, DadosVeiculos[].class);

        for (int i = 0; i < DadosVeiculos.length; i++) {
            System.out.println("Cod: " + DadosVeiculos[i].codigo() + " Descrição: " + DadosVeiculos[i].nome());
        }        
    }

    public void getModelo (String Marca) {
        ENDERECO = ENDERECO + Marca + "/modelos/";
        
        var json = consumoAPI.obterDados(ENDERECO);
        DadosModelos DadosModelos = conversor.obterDados(json, DadosModelos.class); 

        List<Modelo> modelos = DadosModelos.modelos();

        modelos.stream()
            .forEach(m -> System.out.println("Cód: " + m.codigo() + " Descrição: " + m.nome()));
    }

    public void getAno(String Modelo){
        ENDERECO = ENDERECO + Modelo + "/anos/";

        var json = consumoAPI.obterDados(ENDERECO);
        var DadosAnos = conversor.obterDados(json, DadosAnos[].class);
        
        for (int i = 0; i < DadosAnos.length; i++) {
            System.out.println("Cod: " + DadosAnos[i].codigo() + " Descrição: " + DadosAnos[i].nome());
        }
    }

    public void getResultado(String ano) {
        ENDERECO = ENDERECO + ano;

        // System.out.println(ENDERECO);

        var json = consumoAPI.obterDados(ENDERECO);
        var dadosResultado = conversor.obterDados(json, DadosResultado.class);

        System.out.println("Valor: " + dadosResultado.valor() + " Marca: " + dadosResultado.Marca() + " Modelo: " + dadosResultado.Modelo() + " AnoModelo: " + dadosResultado.AnoModelo() + " Combustivel: " + dadosResultado.Combustivel() + " CodigoFipe: " + dadosResultado.CodigoFipe() + " MesReferencia: " + dadosResultado.MesReferencia() + " SiglaCombustivel: " + dadosResultado.SiglaCombustivel());
    }
}
