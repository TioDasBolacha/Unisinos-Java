import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor total da compra: ");
        double valorCompra = scanner.nextDouble();

        double desconto = valorCompra*0.15;
        double totalDesconto = valorCompra - desconto;

        System.out.println("O seu desconto foi de: R$ "+desconto);
        System.out.println("o valor total da sua compra mais o desconto ficou: R$ "+totalDesconto);

        scanner.close();

    }
}
