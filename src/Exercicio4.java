import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int numeroDois = scanner.nextInt();

        System.out.println("Informe o terceiro número:");
        int numeroTres = scanner.nextInt();

        int resultado = calcular(numeroUm, numeroDois, numeroTres);

        System.out.println("O resultado da multiplicação de " + numeroUm + " e " + numeroDois + " subtraido por "
                + numeroTres + " é: " + resultado);

        scanner.close();
    }

    public static int calcular(int numeroUm, int numeroDois, int numeroTres) {
        return numeroUm * numeroDois - numeroTres;
    }

}
