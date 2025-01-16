import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = scanner.nextInt();

        String resultado = VerificarSinal(numero);

        System.out.println(resultado);

        scanner.close();
    }

    public static String VerificarSinal(int numero) {
        if (numero >= 1)
            return "O número é positivo";
        else if (numero == 0)
            return "O número é zero";
        else
            return "O número é negatio";
    }
}
