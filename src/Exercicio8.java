import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = scanner.nextInt();

        int resultado = ValorAbsoluto(numero);

        System.out.println("O valor absoludo do número " + numero + " é " + resultado);

        scanner.close();
    }

    public static int ValorAbsoluto(int numero){
        return Math.abs(numero);
    }
}
