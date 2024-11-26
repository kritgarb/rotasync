package fluxotransito.modelos;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo, String marca, String cor) {
        super(placa, modelo, marca, cor);
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}
