package fluxotransito.modelos;

public class Carro extends Veiculo {
    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}
