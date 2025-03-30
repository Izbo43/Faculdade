public class AcoesUsuarios {
    // Lista usuários com status ativo (true)
    public static void mostrarUsuarios(Usuario[] arrayUsuarios) {
        for (Usuario temp : arrayUsuarios) {
            if (temp != null && temp.getStatusUsuario()) {
                System.out.println(
                    "Nome: " + temp.getNomeUsuario() + '\n' +
                    "ID: " + temp.getIdUsuario() + '\n'
                );
            }
        }
    }

    // Métodos sobrecarregados para alterar nome ou status do usuário
    public static void alterarUsuario(Usuario usuario, String novoNome) {
        usuario.setNomeUsuario(novoNome);
    }

    public static void alterarUsuario(Usuario usuario, boolean novoStatus) {
        usuario.setStatusUsuario(novoStatus);
    }
}