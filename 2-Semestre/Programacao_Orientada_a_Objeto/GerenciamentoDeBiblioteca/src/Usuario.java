public class Usuario {
    private String nome;
    static int id = 0; // ID estático (compartilhado entre todas as instâncias)
    private boolean status;

    // Construtor: define nome, incrementa ID e define status como ativo (true)
    public Usuario(String nome) {
        this.nome = nome;
        this.id++; // Incrementa ID para cada novo usuário
        this.status = true;
    }

    // Setters
    public void setNomeUsuario(String nomeInput) {
        this.nome = nomeInput;
    }

    public void setStatusUsuario(boolean novoStatus) {
        this.status = novoStatus;
    }

    // Getters
    public String getNomeUsuario() {
        return nome;
    }

    public int getIdUsuario() {
        return id;
    }

    public boolean getStatusUsuario() {
        return status;
    }
}