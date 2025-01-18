import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = scanner.nextInt();

        String resultado = VerificarPrimo(numero);

        System.out.println(resultado);

        scanner.close();
    }

    public static String VerificarPrimo(int numero) {
        if (numero <= 1)
            return "O número " + numero + " não é primo";
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return "O número " + numero + " não é primo";

        }
        return "O número " + numero + " é primo";

    }
}
