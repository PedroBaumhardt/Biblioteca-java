

public class Livro {
    public enum ECategoria {DIDATICO, INFANTIL, FICCAO, AUTO_AJUDA}

    private final String id;
    private final String titulo;
    private final ECategoria categoria;
    private final String autor;
    private final String dataPublicacao;

    public Livro(String id, String titulo, ECategoria categoria, String autor, String dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public String getId() {
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
}
