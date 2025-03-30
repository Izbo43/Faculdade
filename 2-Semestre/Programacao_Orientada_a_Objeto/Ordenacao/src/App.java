import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class App extends Ordenacao { // A classe App herda de Ordenacao
    public static void main(String[] args) throws Exception { // Método principal
        Scanner sc = new Scanner(System.in); // Criação do objeto Scanner para entrada de dados
        int tamanho = 0; // Variável para armazenar o tamanho do array

        System.out.println("Quantos numeros deseja inserir?:"); // Solicita o número de elementos
        tamanho = sc.nextInt(); // Lê o número de elementos a serem inseridos pelo usuário

        int[] ArrayInteiros = new int[tamanho]; // Cria o array de inteiros com o tamanho informado

        // Loop para preencher o array com os valores fornecidos pelo usuário
        for (int i = 0; i < ArrayInteiros.length; i++) {
            System.out.println("Insira o " + (i + 1) + " valor:"); // Solicita o valor para o i-ésimo elemento
            ArrayInteiros[i] = sc.nextInt(); // Armazena o valor lido no array
        }

        quickSort(ArrayInteiros, 0, tamanho - 1); // Chama o método quickSort para ordenar o array
        printarArray(ArrayInteiros); // Chama o método printarArray para exibir o array ordenado
    }
}
