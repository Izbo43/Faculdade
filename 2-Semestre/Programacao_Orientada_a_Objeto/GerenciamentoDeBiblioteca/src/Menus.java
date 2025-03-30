import java.util.Scanner;

public class Menus {
    private static Scanner scanner = new Scanner(System.in);
    private static int indiceLivro = 0; // Controla a posição de inserção de novos livros
    private static int indiceUsuario = 0; // Controla a posição de inserção de novos usuários

    // Menu principal: redireciona para submenus
    public static void menuPrincipal(Livro[] livros, Usuario[] usuarios) {
        while (true) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Gerenciar Livros");
            System.out.println("2. Gerenciar Usuários");
            System.out.println("3. Sair");
            System.out.print("Escolha o NÚMERO da opção: ");

            String input = scanner.nextLine().trim();
            int opcao;
            try {
                opcao = Integer.parseInt(input); // Converte entrada para inteiro
            } catch (NumberFormatException e) {
                System.out.println("Erro: Insira um número válido!");
                continue;
            }

            switch (opcao) {
                case 1:
                    menuLivros(livros);
                    break;
                case 2:
                    menuUsuarios(usuarios);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return; // Encerra o programa
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // Submenu para operações com livros
    private static void menuLivros(Livro[] livros) {
        AcoesLivros acoes = new AcoesLivros();
        while (true) {
            System.out.println("\n--- MENU LIVROS ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros Disponíveis");
            System.out.println("3. Alterar Dados do Livro");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine().trim();
            int opcao;
            try {
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Insira um número válido!");
                continue;
            }

            switch (opcao) {
                case 1:
                    // Verifica se há espaço no array
                    if (indiceLivro >= livros.length) {
                        System.out.println("Limite de livros atingido!");
                        break;
                    }
                    // Coleta dados do livro
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Língua: ");
                    String lingua = scanner.nextLine();
                    System.out.print("Nacionalidade: ");
                    String nacionalidade = scanner.nextLine();
                    System.out.print("Editora: ");
                    String editora = scanner.nextLine();

                    // Adiciona o livro ao array e incrementa o índice
                    livros[indiceLivro] = new Livro(nome, lingua, nacionalidade, editora);
                    indiceLivro++;
                    System.out.println("Livro cadastrado!");
                    break;
                case 2:
                    acoes.mostrarLivros(livros); // Lista livros disponíveis
                    break;
                case 3:
                    // Busca livro por ID
                    System.out.print("Digite o ID do livro: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Livro livroAlterar = null;
                    for (Livro l : livros) {
                        if (l != null && l.getIdLivroLivro() == id) {
                            livroAlterar = l;
                            break;
                        }
                    }
                    // Atualiza dados se o livro for encontrado
                    if (livroAlterar != null) {
                        System.out.print("Novo nome: ");
                        String novoNome = scanner.nextLine();
                        System.out.print("Nova língua: ");
                        String novaLingua = scanner.nextLine();
                        System.out.print("Nova nacionalidade: ");
                        String novaNacionalidade = scanner.nextLine();
                        System.out.print("Nova editora: ");
                        String novaEditora = scanner.nextLine();
                        acoes.alterarLivro(livroAlterar, novoNome, novaLingua, novaNacionalidade, novaEditora);
                        System.out.println("Livro atualizado!");
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;
                case 4:
                    return; // Volta ao menu principal
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // Submenu para operações com usuários
    private static void menuUsuarios(Usuario[] usuarios) {
        while (true) {
            System.out.println("\n--- MENU USUÁRIOS ---");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários Ativos");
            System.out.println("3. Alterar Status do Usuário");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine().trim();
            int opcao;
            try {
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Insira um número válido!");
                continue;
            }

            switch (opcao) {
                case 1:
                    // Verifica espaço no array
                    if (indiceUsuario >= usuarios.length) {
                        System.out.println("Limite de usuários atingido!");
                        break;
                    }
                    // Cria usuário e incrementa índice
                    System.out.print("Nome do usuário: ");
                    String nome = scanner.nextLine();
                    usuarios[indiceUsuario] = new Usuario(nome);
                    indiceUsuario++;
                    System.out.println("Usuário cadastrado!");
                    break;
                case 2:
                    AcoesUsuarios.mostrarUsuarios(usuarios); // Lista usuários ativos
                    break;
                case 3:
                    // Busca usuário por ID e altera status
                    System.out.print("ID do usuário: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Usuario usuarioAlterar = null;
                    for (Usuario u : usuarios) {
                        if (u != null && u.getIdUsuario() == id) {
                            usuarioAlterar = u;
                            break;
                        }
                    }
                    if (usuarioAlterar != null) {
                        System.out.print("Novo status (true/false): ");
                        boolean novoStatus = Boolean.parseBoolean(scanner.nextLine());
                        usuarioAlterar.setStatusUsuario(novoStatus);
                        System.out.println("Status alterado!");
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case 4:
                    return; // Volta ao menu principal
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}