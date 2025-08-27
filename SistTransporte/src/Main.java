import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Celta"));
        veiculos.add(new Bicicleta("Caloi"));
        veiculos.add(new Onibus("Mercedes", 4));

        for (Veiculo v : veiculos) {
            System.out.println(v);
            System.out.println(v.calcularTempo(100));
        }

    }
}