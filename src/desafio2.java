import java.util.Scanner;

public class desafio2 {
    public static boolean pertenceFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1;
        int fibonacci = a + b;

        // Calcula a sequência de Fibonacci até encontrar o número ou ultrapassá-lo
        while (fibonacci <= num) {
            if (fibonacci == num) {
                return true;
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = sc.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        sc.close();
    }

}
