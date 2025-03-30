public class AcoesLivros {
    // Exibe os livros disponíveis no array
    public void mostrarLivros(Livro[] arrayLivros) {
        for (Livro temp : arrayLivros) {
            // Verifica se o livro existe e está disponível
            if (temp != null && temp.getDisponivelLivro()) {
                System.out.println(
                    "Nome: " + temp.getNomeLivro() + '\n' +
                    "ID: " + temp.getIdLivroLivro() + '\n' +
                    "Lingua: " + temp.getLinguaLivro() + '\n' +
                    "Nacionalidade: " + temp.getNacionalidadeLivro() + '\n' +
                    "Editora: " + temp.getEditoraLivro() + '\n'
                );
            }
        }
    }

    // Altera múltiplos atributos de um livro de uma vez
    public void alterarLivro(Livro livro, String novoNome, String novaLingua, String novaNacionalidade, String novaEditora) {
        livro.setNomeLivro(novoNome);
        livro.setLinguaLivro(novaLingua);
        livro.setNacionalidadeLivro(novaNacionalidade);
        livro.setEditoraLivro(novaEditora);
    }

    // Métodos opcionais para alterar atributos individualmente
    public void alterarNomeLivro(Livro livro, String novoNome) {
        livro.setNomeLivro(novoNome);
    }
    
    public void alterarLinguaLivro(Livro livro, String novaLingua) {
        livro.setLinguaLivro(novaLingua);
    }
    
    public void alterarNacionalidadeLivro(Livro livro, String novaNacionalidade) {
        livro.setNacionalidadeLivro(novaNacionalidade);
    }
    
    public void alterarEditoraLivro(Livro livro, String novaEditora) {
        livro.setEditoraLivro(novaEditora);
    }
}