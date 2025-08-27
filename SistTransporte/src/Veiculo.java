public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public double calcularTempo(float dist) {
        return dist / 2;
    }
}