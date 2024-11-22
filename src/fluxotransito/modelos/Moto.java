package fluxotransito.modelos;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
