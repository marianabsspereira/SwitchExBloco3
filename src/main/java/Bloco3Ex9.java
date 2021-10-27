import java.util.Scanner;

public class Bloco3Ex9 { //falta validar dados do utilizador
    public static void main(String[] args){
        double salarioBase;
        double horasExtra = 0;
        double salarioMensal;
        double somaSalarios = 0;
        int contaFuncionarios = 0;
        double PERCENTAGEMHE = 0.02;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Inserir salário base:");
            salarioBase = sc.nextDouble();
            sc.nextLine();
            System.out.println("Inserir horas extra:");
            horasExtra = sc.nextDouble();
            sc.nextLine();
            salarioMensal = salarioBase + salarioBase * PERCENTAGEMHE * horasExtra;
            if (horasExtra != -1){
                System.out.println("Salário mensal: " + salarioMensal);
            }
            contaFuncionarios ++;
            somaSalarios += salarioMensal;
        } while (horasExtra != -1);

        somaSalarios = somaSalarios - salarioBase - salarioBase * PERCENTAGEMHE * horasExtra;
        contaFuncionarios --;
        System.out.println("Média salários mês: " + (somaSalarios/contaFuncionarios));
    }
}
