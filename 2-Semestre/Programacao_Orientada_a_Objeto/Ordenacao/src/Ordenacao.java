public class Ordenacao { // Classe que contém os métodos para ordenação

    // Método principal do algoritmo QuickSort
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) { // Condição de recursão
            int pivoIndex = particionar(array, inicio, fim); // Determina o índice do pivo
            quickSort(array, inicio, pivoIndex - 1); // Recursão para a parte esquerda
            quickSort(array, pivoIndex + 1, fim); // Recursão para a parte direita
        }
    }

    // Método que particiona o array em torno de um pivo
    public static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim]; // O pivo é o último elemento do array
        int i = inicio - 1; // Variável de controle para as trocas

        // Loop para percorrer o array e organizar os elementos
        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) { // Se o valor for menor ou igual ao pivo
                i++; // Incrementa o índice de controle
                trocarPosicao(array, i, j); // Troca os elementos
            }
        }

        trocarPosicao(array, i + 1, fim); // Coloca o pivo na posição correta
        return i + 1; // Retorna a nova posição do pivo
    }

    // Método auxiliar para trocar os elementos de posição
    public static void trocarPosicao(int[] array, int posicao1, int posicao2) {
        int temp = array[posicao1]; // Armazena temporariamente o valor de posicao1
        array[posicao1] = array[posicao2]; // Troca os elementos nas posições especificadas
        array[posicao2] = temp; // Conclui a troca
    }

    // Método que imprime todos os valores do array
    public static void printarArray(int[] array) {
        for (int j : array) { // Percorre o array
            System.out.println("Valor: " + j); // Imprime o valor de cada elemento
        }
    }
}
