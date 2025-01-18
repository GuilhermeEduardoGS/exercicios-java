import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Informe a temperatura em graus fahrenheit");
            double fahrenheit = scanner.nextDouble();

            double celsius = (5.0/9.0) * (fahrenheit - 32.0);

            System.out.println("O valor de " + fahrenheit + " convertido para celsius fica: " + celsius); 

        } catch (InputMismatchException e) {
            System.out.println("Informe um valor inteiro ou decimal");
        }
    }
}
