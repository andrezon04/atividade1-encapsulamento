public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularTempo(float dist) {
        return dist / 80;
    }
}