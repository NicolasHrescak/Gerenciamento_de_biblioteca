package packageBiblioteca;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Biblioteca biblioteca = new Biblioteca();
        Livro Lion = new Livro("The Lion"
                ,"Nicolas Hrescak"
                ,2023);

        Livro Revolucao_Dos_Bichos = new Livro("A revolução dos bichos"
        ,"George Orwell"
        ,1950);

        Livro Campones = new Livro("O camponês"
        ,"Julia de castro"
        ,2002);

        biblioteca.adicionarLivro(Lion);
        biblioteca.adicionarLivro(Revolucao_Dos_Bichos);
        biblioteca.adicionarLivro(Campones);

        Lion.emprestar();
        Campones.emprestar();

        biblioteca.emprestarLivro("O camponês");
        biblioteca.devolverLivro("A revolução dos bichos");
        biblioteca.exibirLivrosDisponiveis();
        Campones.exibir();
        Lion.devolver();
        biblioteca.devolverLivro("O camponês");
        biblioteca.exibirLivrosDisponiveis();

    }

}