import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos minutos deseja transformar em segundos: ");
        double minutos = scanner.nextDouble();

        double segundos = minutos* 60.0;

        System.out.println(minutos+" minutos se transformam em: "+segundos+" segundos");

        scanner.close();

    }
}
