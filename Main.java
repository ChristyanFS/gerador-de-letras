import java.util.Scanner;
/**
 * Programa que recebe um número (1–26) e retorna as primeiras letras do alfabeto.
 */
public class Main {
    static char[] obterLetras(int valor) { // Função que vai retornar a Array.
        int cont;
        char[] letras = new char[valor]; // Array que irá retornar.
        char[] alfabeto = new char[26];
        
        for (int i = 0; i < 26; i++) { // For para criar um Array com as letras do alfabeto.
            alfabeto[i] = (char) ('a' + i);
        }
        for (cont = 0; cont < valor; cont++) { // For que vai jogar de uma Array para outra.
            letras[cont] = alfabeto[cont]; // Fazendo a adição de uma para outra.
        }
        return letras; // Retornando a Array.
    }

    // Programa principal.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        char[] resul;

        do {
            System.out.print("Digite um número de 1 a 26: ");
            num = input.nextInt();
        } while (num < 1 || num > 26);
        char[] resultado = obterLetras(num);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("LETRAS");
        for (char c : resultado) { // Um for para mostrar o resultado de forma mais organizada.
            System.out.print(c + ".. ");
        }
    }
}
