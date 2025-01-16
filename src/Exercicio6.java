import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = scanner.nextInt();

        String resultado = DivisivelPorTres(numero);

        System.out.println("O número " + numero + " " + resultado + " por três");

        scanner.close();
    }

    public static String DivisivelPorTres(int numero) {
        if (numero % 3 == 0)
            return "é divisivel";
        else
            return "não é divisivel";
    }

}
