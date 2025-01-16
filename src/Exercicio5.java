import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");

        int numero = scanner.nextInt();
        int resultado = quantidadeDigitos(numero);

        System.out.println("O número " + numero + " possui " + resultado + " dígito(s).");

        scanner.close();
    }

    public static int quantidadeDigitos(int numero){
        return String.valueOf(Math.abs(numero)).length();
    }

}
