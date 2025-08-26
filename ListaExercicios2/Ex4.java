import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua nota do Grau A: ");
        double grauA = scanner.nextDouble();

        System.out.print("Insira sua nota do Grau B: ");
        double grauB = scanner.nextDouble();

        double notaGrauA = grauA*(1.0/3.0);
        double notaGrauB = grauB*(2.0/3.0);

        double mediaNota = notaGrauA+notaGrauB;

        System.out.println("Sua média final foi de: "+mediaNota);

        scanner.close();
    }
}
