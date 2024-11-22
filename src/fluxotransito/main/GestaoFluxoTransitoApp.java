package fluxotransito.servicos;
import fluxotransito.modelos.*;
import fluxotransito.servicos.VeiculoService;

public class GestaoFluxoTransitoApp {
    public static void main(String[] args) {
        VeiculoService veiculoService = new VeiculoService();

        veiculoService.adicionarVeiculo(new Carro("ABC1234", "Sedan"));
        veiculoService.adicionarVeiculo(new Moto("XYZ5678", "Esportiva"));
        veiculoService.adicionarVeiculo(new Caminhao("DEF9101", "Caminhão de carga"));

        System.out.println("Veículos ordenados por placa:");
        veiculoService.listarVeiculosOrdenados().forEach(veiculo ->
                System.out.println(veiculo.getTipo() + " - Placa: " + veiculo.getPlaca()));
    }
}
