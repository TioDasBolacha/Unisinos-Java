import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pao = 0.50;
        double broa = 2.00;


                System.out.print("Digite a quantidade de pães vendidos no dia: ");
                int quantPao = scanner.nextInt();

                System.out.print("Digite quantas broas vendidas no dia: ");
                int quantBroa = scanner.nextInt();

                double precoPao = pao * quantPao;
                double precoBroa = broa * quantBroa;
                double totalDia = precoPao + precoBroa;

                System.out.println("No dia foram vendidos: "+quantPao+" pães e "+quantBroa+" broas. ");
                System.out.println("O total arrecadado no dia foi de: "+"R$ "+totalDia);

                scanner.close();



    }
}
