package fluxotransito.modelos;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}
