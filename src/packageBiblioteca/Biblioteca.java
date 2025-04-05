package packageBiblioteca;
import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Livro> listaLivro = new ArrayList<Livro>();

    void adicionarLivro(Livro livro){
        listaLivro.add(livro);//Ao criar um livro esse metodo sempre tem que ser chamado
    }
    void emprestarLivro(String titulo){
        for (int k=0; k<listaLivro.size(); k++){
            Livro livro = listaLivro.get(k);
            if(livro.titulo.equals(titulo)){
               livro.emprestar();
               break;
            }
        }
    }
    void devolverLivro(String titulo){
        for (int k=0; k<listaLivro.size();k++){
            Livro livro = listaLivro.get(k);
            if(livro.titulo.equals(titulo)){
                livro.devolver();
            }
        }
    }
    void exibirLivrosDisponiveis(){
        System.out.println("Livros disponíveis: ");
        for(int k=0; k<listaLivro.size();k++){
            Livro livro = listaLivro.get(k);
            if(livro.disponivel == true){
                livro.exibir();
                System.out.println("\n");
            }
        }
    }
}

