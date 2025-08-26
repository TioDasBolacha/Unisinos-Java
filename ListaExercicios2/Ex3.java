import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da gasolina: ");
        double precoGas = scanner.nextDouble();

        System.out.print("Quantos reais em gasolina vai querer: ");
        double dinCliente = scanner.nextDouble();

        double totalGas = dinCliente/precoGas;

        System.out.println("vc abasteceu: "+totalGas+" litros");

        scanner.close();
    }
}
