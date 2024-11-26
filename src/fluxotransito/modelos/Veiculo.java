package fluxotransito.modelos;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private String marca;


    public Veiculo(String placa, String modelo, String cor, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {return cor;}
    public String getMarca() {return marca;}

    public abstract String getTipo();
}
