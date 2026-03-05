import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private String nome;
    private Map<String, Integer> autores = new HashMap<>();
    private final int size = 100;
    private int totalLivros = 0;
    private final Livro[] livros = new Livro[this.size];

    public boolean inserirLivro(Livro livro) {
        if (this.totalLivros == this.size) {return false;}
        for (int i = 0; i < this.size; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                autores.put(livro.getAutor(), autores.getOrDefault(livro.getAutor(), 0) + 1);
                break;
            }
        }
        totalLivros++;
        return true;
    }

    public boolean removerLivro(int id) {
        boolean flag = false;
        for (int i=0; i<this.size; i++) {
            if (livros[i] != null && livros[i].getId() == id) {
                autores.put(livros[i].getAutor(), autores.get(livros[i].getAutor()) - 1);
                livros[i] = null;
                this.totalLivros--;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void imprimirLivros() {
        for (int i=0; i<this.size; i++) {
            if (livros[i] != null) {
                System.out.println(livros[i].toString());
            }
        }
    }

    public int getTotalLivros() {
        return totalLivros;
    }

    public void imprimirAutoresDec() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(autores.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.print("\n");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
