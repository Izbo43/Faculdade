public class Livro {
    private String nome;
    static int id = 0; // ID estático (compartilhado entre todas as instâncias)
    private String lingua;
    private String nacionalidade;
    private String editora;
    private boolean disponivel;

    // Construtor: inicializa atributos e incrementa ID automaticamente
    public Livro(String nome, String lingua, String nacionalidade, String editora) {
        this.nome = nome;
        this.id++; // Incrementa o ID para cada novo livro
        this.lingua = lingua;
        this.nacionalidade = nacionalidade;
        this.editora = editora;
        this.disponivel = true; // Por padrão, livro está disponível
    }

    // Setters (modificam atributos)
    public void setNomeLivro(String nome) {
        this.nome = nome;
    }

    public void setLinguaLivro(String lingua) {
        this.lingua = lingua;
    }

    public void setNacionalidadeLivro(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setEditoraLivro(String editora) {
        this.editora = editora;
    }

    public void setDisponivelLivro(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Getters (retornam atributos)
    public String getNomeLivro() {
        return nome;
    }

    public int getIdLivroLivro() {
        return id;
    }

    public String getLinguaLivro() {
        return lingua;
    }

    public String getNacionalidadeLivro() {
        return nacionalidade;
    }

    public String getEditoraLivro() {
        return editora;
    }

    public boolean getDisponivelLivro() {
        return disponivel;
    }
}