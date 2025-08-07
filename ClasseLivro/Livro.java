package ClasseLivro;

public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas){
        if (numeroPaginas >= 5){
            this.numeroPaginas = numeroPaginas;
        }else {
            System.out.println("O número de páginas não pode ser menor que '5'! ");
        }
    }
}