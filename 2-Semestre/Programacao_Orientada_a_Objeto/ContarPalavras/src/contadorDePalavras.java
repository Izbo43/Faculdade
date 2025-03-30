// Define a classe contadorDePalavras
public class contadorDePalavras {

    // Método estático que recebe uma frase e retorna o número de palavras nela
    public static int contarPalavras(String frase) {   
        // Variável para contar a quantidade de palavras
        int quantidadePalavras = 0;
        // Converte a frase em um array de caracteres
        char[] fraseEmCaracteres = frase.toCharArray();

        // Loop que percorre cada caractere da frase
        for (int i = 0; i < fraseEmCaracteres.length; i++) {
            // Verifica se é o primeiro caractere ou se é um espaço
            if (i == 0 || fraseEmCaracteres[i] == ' ') {   
                // Inicializa a variável j com o valor de i
                int j = i;
                // Loop que avança até encontrar o próximo espaço, identificando o fim de uma palavra
                while (fraseEmCaracteres[j] != ' ') {
                    j++;
                }
                // Incrementa a contagem de palavras
                quantidadePalavras++;
                // Reseta j para 0 (embora não seja utilizado após isso)
                j = 0;
            }
        }

        // Retorna a quantidade total de palavras encontradas
        return quantidadePalavras;
    }
}
