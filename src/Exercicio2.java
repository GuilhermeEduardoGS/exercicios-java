import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = scanner.nextInt();

        String resultado = VerificarParOuImpar(numero);

        System.out.println("O número " + numero + " é " + resultado);

        scanner.close();
    }

    public static String VerificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else
            return "Impar";
    }
}
