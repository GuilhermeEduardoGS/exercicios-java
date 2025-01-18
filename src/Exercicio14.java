import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Informe o primeiro número:");
            int numeroUm = scanner.nextInt();

            System.out.println("Informe o segundo número:");
            int numeroDois = scanner.nextInt();

            System.out.println("Informe o terceiro número:");
            int numeroTres = scanner.nextInt();

            int numeros[] = { numeroUm, numeroDois, numeroTres };
            int maior = numeros[0];
            int menor = numeros[0];
            int meio = numeros[0];

            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] > maior)
                    maior = numeros[i];

                if (numeros[i] < menor)
                    menor = numeros[i];
            }

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > menor && numeros[i] < maior)
                    meio = numeros[i];
            }

            int decrescente[] = { maior, meio, menor };

            for (int posicoes : decrescente) {
                System.out.println(posicoes);
            }

        } catch (InputMismatchException e) {
            System.out.println("Os valores informados devem ser números inteiros");
        }
    }
}
