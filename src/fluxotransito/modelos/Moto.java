package fluxotransito.modelos;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo, String marca, String cor) {
        super(placa, modelo, marca, cor);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
