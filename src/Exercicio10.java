import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in);){

            System.out.println("Informe o primeiro número:");
            int a = scanner.nextInt();

            System.out.println("Informe o segundo número:");
            int b = scanner.nextInt();

            int c;

            if (a == b)
                c = Somar(a, b);
            else
                c = Multiplicar(a, b);

            System.out.println("Resultado: " + c);

        }

        catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Informe um número inteiro!");
        }

    }

    static int Somar(int a, int b) {
        return a + b;
    }

    static int Multiplicar(int a, int b) {
        return a * b;
    }
}
