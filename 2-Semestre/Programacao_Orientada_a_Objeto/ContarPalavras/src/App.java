// Importa a classe Scanner do pacote java.util para leitura de entradas do usuário
import java.util.Scanner;

// A classe App estende a classe contadorDePalavras
public class App extends contadorDePalavras {
    // Método principal que é o ponto de entrada do programa
    public static void main(String[] args) throws Exception {
        
        // Declara uma variável do tipo String para armazenar a frase inserida pelo usuário
        String frase = new String();
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira uma frase
        System.out.println("Insira a frase:");
        // Lê a linha inteira inserida pelo usuário e armazena na variável 'frase'
        frase = sc.nextLine();
        // Chama o método contarPalavras da classe pai para contar as palavras na frase e exibe o resultado
        System.out.println(contarPalavras(frase));
    }   
}
