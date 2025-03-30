// Importa a classe Scanner para leitura de entrada do usuário
import java.util.Scanner;

// A classe App herda de OperacoesComMatrizes, permitindo o uso de seus métodos
public class App extends OperacoesComMatrizes {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis para armazenar as dimensões das matrizes
        int quantidadeDeLinhas1, quantidadeDeColunas1, quantidadeDeLinhas2, quantidadeDeColunas2;

        // Solicita ao usuário o número de linhas da primeira matriz
        System.out.println("Insira o numero de linhas da primeira matriz:");
        quantidadeDeLinhas1 = sc.nextInt();

        // Solicita ao usuário o número de colunas da primeira matriz
        System.out.println("Insira o numero de colunas da primeira matriz:");
        quantidadeDeColunas1 = sc.nextInt();

        // Cria a primeira matriz com as dimensões especificadas
        int matriz1[][] = new int[quantidadeDeLinhas1][quantidadeDeColunas1];

        // Solicita ao usuário o número de linhas da segunda matriz
        System.out.println("Insira o numero de linhas da segunda matriz:");
        quantidadeDeLinhas2 = sc.nextInt();

        // Solicita ao usuário o número de colunas da segunda matriz
        System.out.println("Insira o numero de colunas da segunda matriz:");
        quantidadeDeColunas2 = sc.nextInt();

        // Cria a segunda matriz com as dimensões especificadas
        int matriz2[][] = new int[quantidadeDeLinhas2][quantidadeDeColunas2];

        // Cria a matriz de resultado com dimensões adequadas para a multiplicação
        int matrizResposta[][] = new int[quantidadeDeLinhas1][quantidadeDeColunas2];

        // Chama o método para inserir os elementos na primeira matriz
        inserirMatriz(matriz1);

        // Chama o método para inserir os elementos na segunda matriz
        inserirMatriz(matriz2);

        // Chama o método para multiplicar as duas matrizes e armazenar o resultado
        multiplicarMatrizes(matriz1, matriz2, matrizResposta);

        // Chama o método para exibir a matriz resultante da multiplicação
        exibirMatriz(matrizResposta);
    }
}
