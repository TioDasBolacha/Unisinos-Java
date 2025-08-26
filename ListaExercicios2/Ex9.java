import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas moedas de 1 centavo: ");
        int moedasUm = scanner.nextInt();

        System.out.print("Digite quantas moedas de 5 centavos: ");
        int moedasCinco = scanner.nextInt();

        System.out.print("Digite quantas moedas de 10 centavos: ");
        int moedasDez = scanner.nextInt();

        System.out.print("Digite quantas moedas de 25 centavos: ");
        int moedasVinteCinco = scanner.nextInt();

        System.out.print("Digite quantas moedas de 50 centavos: ");
        int moedasCinquenta = scanner.nextInt();

        System.out.print("Digite quantas moedas de 1 real: ");
        int moedasUmReal = scanner.nextInt();

        // Cálculo do total em reais
        double total = (moedasUm * 0.01) + (moedasCinco * 0.05) + (moedasDez * 0.10) + (moedasVinteCinco * 0.25) + (moedasCinquenta * 0.50) + (moedasUmReal * 1.00);

        System.out.printf("O total economizado é: R$ "+ total);

        scanner.close();
    }
}
