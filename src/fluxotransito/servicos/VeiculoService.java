package fluxotransito.servicos;

import fluxotransito.algoritmos.Quicksort;
import fluxotransito.modelos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoService {
    private final List<Veiculo> veiculos = new ArrayList<>();
    private final Quicksort quicksort = new Quicksort();

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> listarVeiculosOrdenados() {
        int[] placas = veiculos.stream()
                .mapToInt(v -> Integer.parseInt(v.getPlaca().replaceAll("[^0-9]", "")))
                .toArray();
        quicksort.ordenar(placas);

        List<Veiculo> veiculosOrdenados = new ArrayList<>();
        for (int placa : placas) {
            for (Veiculo veiculo : veiculos) {
                if (Integer.parseInt(veiculo.getPlaca().replaceAll("[^0-9]", "")) == placa) {
                    veiculosOrdenados.add(veiculo);
                }
            }
        }
        return veiculosOrdenados;
    }
}
