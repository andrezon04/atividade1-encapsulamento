package PrecoSugerido;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O valor não pode ser negativo. ");
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            double desconto = this.preco * (percentual/100);
            this.preco -= desconto;
        }
    }
}