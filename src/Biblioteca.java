public class Biblioteca {
    private String nome;
    private final int size = 100;
    private int totalLivros = 0;
    private final Livro[] livros = new Livro[this.size];

    public boolean inserirLivro(Livro livro) {
        if (this.totalLivros == this.size) {return false;}
        for (int i = 0; i < this.size; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
        totalLivros++;
        return true;
    }

    public boolean removerLivro(String id) {
        boolean flag = false;
        for (int i=0; i<this.size; i++) {
            if (livros[i] != null && livros[i].getId().equals(id)) {
                livros[i] = null;
                this.totalLivros--;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int getTotalLivros() {
        return totalLivros;
    }
}
