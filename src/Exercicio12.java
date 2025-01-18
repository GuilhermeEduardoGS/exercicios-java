import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String [] args) throws Exception{

        try (Scanner scanner = new Scanner(System.in);){

            System.out.println("Informe um número");
            double numero = scanner.nextDouble();

            double reajuste = 0.05 * numero;

            double resultado = numero + reajuste;

            System.out.println("O número " + numero + " com reajuste de 5% fica " + resultado);

        }
        catch (InputMismatchException e){
            System.out.println("Entrada inválida! Informe um valor numérico!");
        }
    }
}
