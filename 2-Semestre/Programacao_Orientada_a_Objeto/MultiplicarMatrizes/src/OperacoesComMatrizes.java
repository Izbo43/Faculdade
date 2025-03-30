// Importa a classe Scanner para leitura de entrada do usuário
import java.util.Scanner;


// A classe OperacoesComMatrizes contém métodos para operações relacionadas a matrizes
public class OperacoesComMatrizes {

    // Método para verificar se as matrizes podem ser multiplicadas
    public static boolean verificarMultiplicacaoMatrizes(int[][] matriz1, int[][] matriz2) {   
        // Obtém o número de colunas da primeira matriz
        int numeroDeColunasMatriz1 = matriz1[0].length;
        // Obtém o número de linhas da segunda matriz
        int numeroDeLinhasMatriz2 = matriz2.length;

        // Verifica se o número de colunas da primeira matriz é igual ao número de linhas da segunda
        if (numeroDeColunasMatriz1 == numeroDeLinhasMatriz2) {
            return true; // As matrizes podem ser multiplicadas
        } else {   
            // Exibe uma mensagem de erro caso as matrizes não possam ser multiplicadas
            System.out.println("A matriz não pode ser multiplicada pois a quantidade de colunas da primeira matriz é diferente do numero de linhas da segunda matriz");
            return false; // As matrizes não podem ser multiplicadas
        }
    }

    // Método para exibir os elementos de uma matriz
    public static void exibirMatriz(int[][] matriz) {
        // Itera sobre cada linha da matriz
        for (int[] linha : matriz) {
            // Itera sobre cada elemento da linha
            for (int elemento : linha) {
                // Imprime o elemento seguido de um espaço
                System.out.print(elemento + " ");
            }
            // Após imprimir todos os elementos de uma linha, pula para a próxima linha
            System.out.println();
        }
    }

    // Método para inserir elementos em uma matriz
    public static void inserirMatriz(int[][] matriz) {
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Itera sobre cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Itera sobre cada coluna da matriz
            for (int j = 0; j < matriz[i].length; j++) {   
                // Solicita ao usuário o valor do elemento na posição [i][j]
                System.out.println("Insira o elemento de [" + i + "][" + j + "]");
                // Lê o valor inteiro inserido pelo usuário e atribui à posição [i][j] da matriz
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    // Método para multiplicar duas matrizes e armazenar o resultado em uma terceira matriz
    public static void multiplicarMatrizes(int[][] matriz1, int[][] matriz2, int[][] matrizResultado) {
        // Verifica se as matrizes podem ser multiplicadas
        if (verificarMultiplicacaoMatrizes(matriz1, matriz2)) {
            // Itera sobre cada linha da matriz resultado
            for (int i = 0; i < matrizResultado.length; i++) {
                // Itera sobre cada coluna da matriz resultado
                for (int j = 0; j < matrizResultado[0].length; j++) {
                    // Inicializa o elemento da matriz resultado na posição [i][j]
                    matrizResultado[i][j] = 0;
                    // Realiza a soma dos produtos dos elementos correspondentes das matrizes
                    for (int k = 0; k < matriz1[0].length; k++) {
                        matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
        }
    }
}
