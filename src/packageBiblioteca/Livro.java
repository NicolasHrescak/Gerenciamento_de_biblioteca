package packageBiblioteca;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;
    public boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;

    }
    void emprestar(){
        if (disponivel == true){
            disponivel = false;
            System.out.println("Tudo certo! O livro "+'"'+titulo+'"'+"foi emprestado!\n");
        }
        else{
            System.out.println("Não foi possivel,o livro "+'"'+titulo+'"'+ " já foi emprestado!\n");
        }
    }
    void devolver(){
        if(disponivel == false){
            disponivel = true;
            System.out.println("Tudo certo! O livro "+'"'+titulo+'"'+" foi devolvido!\n");
        }
        else{
            System.out.println("Não foi possivel,o livro "+'"'+titulo+'"'+ " já foi devolvido!\n");
        }
    }
    void exibir() {
        System.out.println("Titulo: "+titulo+
                "\nAutor: "+autor+
                "\nAno de Publicação: "+anoPublicacao+
                "\nDisponivel: "+disponivel+"\n");
    }

}
