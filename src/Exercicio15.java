import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio15 {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.print("Informe um número que deseje tabular:");
            int numero = scanner.nextInt();

            System.out.print("Informe até qual valor o primeiro número será tabulado:");
            int limite = scanner.nextInt();

            for (int i = 0; i <= limite; i++) {
                System.out.println(numero + " x " + i + " = " + (i * numero));
            }

        } catch (InputMismatchException e) {
            System.out.print("Informe um número inteiro");
        }
    }
}
