import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio11 {
    
    public static void main(String [] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in);){
            double salarioMinimo = 1293.20;

            System.out.println("Informe seu salário:");
            double salarioUsuario = scanner.nextDouble();

            double resultado = salarioUsuario / salarioMinimo;

            System.out.println("Você ganha aproximadamente " + resultado + " salários mínimos."); 
        }
        catch(InputMismatchException e){
            System.out.println("O salário deve ser um valor numérico");
        }

    }
}
