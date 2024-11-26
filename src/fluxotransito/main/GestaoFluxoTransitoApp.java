package fluxotransito.main;
import fluxotransito.modelos.Carro;
import fluxotransito.modelos.Moto;
import fluxotransito.modelos.Caminhao;
import fluxotransito.servicos.VeiculoService;

public class GestaoFluxoTransitoApp {
    public static void main(String[] args) {
        VeiculoService veiculoService = new VeiculoService();
        veiculoService.adicionarVeiculo(new Moto("XYZ5678", "Esportiva", "Branca", "Honda"));
        veiculoService.adicionarVeiculo(new Caminhao("DEF9101", "Caminhão de carga", "Azul", "Volvo"));
        veiculoService.adicionarVeiculo(new Carro("ABC1234", "Sedan", "Preto", "Nissan"));
        veiculoService.adicionarVeiculo(new Carro("CAB4321", "4X4", "Vermelho", "Jeep"));

        System.out.println("Veículos ordenados por placa:");
        veiculoService.listarVeiculosOrdenados()
                .forEach(veiculo -> {
                    String descricao = String.format("%s: %s %s - %s - Placa: %s",
                            veiculo.getTipo(),
                            veiculo.getMarca(),
                            veiculo.getCor(),
                            veiculo.getModelo(),
                            veiculo.getPlaca());
                    System.out.println(descricao);
                });
    }
}
