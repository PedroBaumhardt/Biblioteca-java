public class Livro {
    public enum ECategoria {DIDATICO, INFANTIL, FICCAO, AUTO_AJUDA}

    private final int id;
    private final String titulo;
    private final ECategoria categoria;
    private final String autor;
    private final String dataPublicacao;

    public Livro(int id, String titulo, String categoria, String autor, String dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = ECategoria.valueOf(categoria);
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String toString() {
        return "Livro: " + this.id + " - " + this.titulo + " - " + this.categoria + " - " + this.autor + " - " + this.dataPublicacao;
    }
}
