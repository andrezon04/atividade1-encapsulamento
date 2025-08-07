package ClasseLivro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setAutor("Autor");
        livro.setTitulo("Título");
        livro.setNumeroPaginas(4);

        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Numero Paginas: " + livro.getNumeroPaginas());
    }
}