package ClasseRPG;

public class PersonagemRPG {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        if (nivel >= 1){
            this.nivel = nivel;
        }else {
            System.out.println("O 'Nível' não pode ser menor que 1! ");
        }
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida){
        if (vida >= 0 && vida <= 100){
            this.vida = vida;
        }else {
            System.out.println("A 'Vida' deve estar maior ou igual a 0 e menor ou igual a 100! ");
        }
    }
}