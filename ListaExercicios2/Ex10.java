import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira quanto o primeiro membro do casal ganha: R$ ");
       double salarioMembro1 = scanner.nextDouble();

        System.out.print("Insira quanto o segundo membro do casal ganha: R$ ");
       double salarioMembro2 = scanner.nextDouble();

        System.out.print("Inisra quanto o casal gasta com despesas: R$ ");
       double gastosCasal = scanner.nextDouble();

       double rendaTotal = salarioMembro1 + salarioMembro2;

       double porcentagemSalario1 = salarioMembro1/rendaTotal;
       double porcentagemSalario2 = salarioMembro2/rendaTotal;

       double porcentagemPagarMembro1 = porcentagemSalario1*100;
       double porcentagemPagarMembro2 = porcentagemSalario2*100;

       double totalPagarMembro1 = porcentagemSalario1*gastosCasal;
       double totalPagarMembro2 = porcentagemSalario2*gastosCasal;

        System.out.printf("\nO primeiro membro do casal deve pagar: R$ %.2f (%.2f%%)\n", totalPagarMembro1, porcentagemPagarMembro1);
        System.out.printf("O segundo membro do casal deve pagar: R$ %.2f (%.2f%%)\n", totalPagarMembro2, porcentagemPagarMembro2);
        scanner.close();





    }
}
