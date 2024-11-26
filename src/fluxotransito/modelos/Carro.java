package fluxotransito.modelos;

public class Carro extends Veiculo {
    public Carro(String placa, String modelo, String marca, String cor) {
        super(placa, modelo, marca, cor);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}
