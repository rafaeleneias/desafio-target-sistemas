import java.util.Scanner;

public class desafio5 {

    // Método para inverter a string manualmente
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();  // Converte a string em um array de caracteres
        String invertida = "";  // Variável para armazenar a string invertida

        // Percorre o array de trás para frente e constrói a string invertida
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        return invertida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita que o usuário informe uma string
        System.out.print("Informe uma string: ");
        String entrada = sc.nextLine();

        // Chama o método para inverter a string
        String resultado = inverterString(entrada);

        // Exibe o resultado
        System.out.println("String invertida: " + resultado);

        sc.close();
    }
}
