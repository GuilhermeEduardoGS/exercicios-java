import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio13 {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Inform o primeiro valor booleano:");
            boolean primeiroValor = scanner.nextBoolean();

            System.out.println("Inform o segundo valor booleano:");
            boolean segundoValor = scanner.nextBoolean();

            verificarBooleano(primeiroValor, segundoValor);
        } catch (InputMismatchException e) {
            System.out.println("Informe um valor booleano entre 'true' ou 'false'");
        }
    }

    static void verificarBooleano(boolean primeiroValor, boolean segundoValor) {
        if (primeiroValor && !segundoValor)
            System.out.println("O primeiro valor informado é verdadeiro");
        else if (!primeiroValor && segundoValor)
            System.out.println("O segundo valor informado é verdadeiro");
        else if (primeiroValor && segundoValor)
            System.out.println("Ambos os valores são verdadeiros");
        else
            System.out.println("Ambos os valores são falsos");
    }
}
