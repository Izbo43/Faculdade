public class App {
    public static void main(String[] args) {
        // Arrays para armazenar livros e usuários (tamanho máximo: 100)
        Livro[] livros = new Livro[100];
        Usuario[] usuarios = new Usuario[100];
        // Inicia o menu principal
        Menus.menuPrincipal(livros, usuarios);
    }
}