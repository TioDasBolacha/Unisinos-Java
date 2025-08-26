import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura em metros: ");
        int largura = scanner.nextInt();

        System.out.print("Digite o comprimento em metros: ");
        int comprimento = scanner.nextInt();

        int area = largura * comprimento;

        System.out.println("A área do terreno é de: " + area + " metros");

        scanner.close();
    }
}