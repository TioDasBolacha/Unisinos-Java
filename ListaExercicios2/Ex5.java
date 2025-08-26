import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua altura em cm: ");
        double alturaCm = scanner.nextDouble();

        double alturaMetros = alturaCm / 100.0;

        System.out.println("Sua altura é de: "+alturaMetros+" metros");

        scanner.close();

    }
}
