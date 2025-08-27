public class Onibus extends Veiculo {
    private float paradas;

    public Onibus(String modelo, float paradas) {
        super(modelo);
        this.paradas = paradas;
    }

    @Override
    public double calcularTempo(float dist) {
        return dist / 60 + (paradas * 0.25);
    }
}