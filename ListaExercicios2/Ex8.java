import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira quantas camisetas vc comprou: ");
        int quantCamisetas = scanner.nextInt();

        System.out.print("Insira quantas calças vc comprou: ");
        int quantCalc= scanner.nextInt();

        System.out.print("Insira quantos cintos vc comprou: ");
        int quantCinto = scanner.nextInt();

        double valorCamisetas = quantCamisetas*25.00;
        double valorCalc = quantCalc*100.00;
        double valorCinto = quantCinto*40.00;

        double valorCompra = valorCamisetas + valorCalc + valorCinto;
        
        double desconto = valorCompra*0.10;
        double totalDesconto = valorCompra - desconto;

        System.out.println("O valor total da sua compra foi de: R$ "+valorCompra);
        System.out.println("O seu desconto foi de: R$ "+desconto);
        System.out.println("o valor total da sua compra mais o desconto ficou: R$ "+totalDesconto);

        scanner.close();
    }
}
