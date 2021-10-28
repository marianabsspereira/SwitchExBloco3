import java.util.Scanner;

public class Bloco3Ex9 { //Já com validação dos 2 dados inseridos pelo utilizador
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

            if (salarioBase <= 0){
                do {
                    System.out.println("Salário base inválido, inserir novo valor:");
                    salarioBase = sc.nextDouble();
                    sc.nextLine();
                } while (salarioBase <= 0);
            }

            System.out.println("Inserir horas extra:");
            horasExtra = sc.nextDouble();
            sc.nextLine();

            if (horasExtra < 0 && horasExtra != -1){
                do {
                    System.out.println("Horas extra inválidas, inserir novo valor:");
                    horasExtra = sc.nextDouble();
                    sc.nextLine();
                } while (horasExtra < 0 && horasExtra != -1);
            }

            salarioMensal = salarioBase + salarioBase * PERCENTAGEMHE * horasExtra;
            if (horasExtra != -1){
                System.out.println("Salário mensal: " + salarioMensal);
            }
            contaFuncionarios ++;
            somaSalarios += salarioMensal;
        } while (horasExtra != -1);

        // 2 linhas para excluir o salário base e horas extra inseridos
        // no ultimo ciclo quando horas extra = -1 que termina o programa
        somaSalarios = somaSalarios - salarioBase - salarioBase * PERCENTAGEMHE * horasExtra;
        contaFuncionarios --;
        System.out.println("Média salários mês: " + (somaSalarios/contaFuncionarios));
    }
}
