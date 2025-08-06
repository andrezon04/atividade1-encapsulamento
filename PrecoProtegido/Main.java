package PrecoProtegido;

public class Main {
    public static void main(String[] args) {
    Produto produto = new Produto();

    produto.setNome("Arroz");
    produto.setPreco(25);
    produto.aplicarDesconto(-1);

    System.out.println("Produto: " + produto.getNome());
    System.out.println("Preco: " + produto.getPreco());

    }
}