import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int numeroDois = scanner.nextInt();

        int resultado = VerificarMaior(numeroUm, numeroDois);

        System.out.println("O maior número entre " + numeroUm + " e " + numeroDois + " é " + resultado);

        scanner.close();
    }

    public static int VerificarMaior(int numeroUm, int numeroDois) {
        if (numeroUm > numeroDois)
            return numeroUm;
        else
            return numeroDois;
    }

}
