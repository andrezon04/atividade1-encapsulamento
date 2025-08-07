package ClasseRPG;

public class Main {
    public static void main(String[] args) {
        PersonagemRPG personagem = new PersonagemRPG();

        personagem.setNome("André");
        personagem.setClasse("Guerreiro");
        personagem.setVida(5);
        personagem.setNivel(5);

        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Classe: " + personagem.getClasse());
        System.out.println("Vida: " + personagem.getVida());
        System.out.println("Nivel: " + personagem.getNivel());
    }
}