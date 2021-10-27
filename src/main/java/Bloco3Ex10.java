import java.util.Scanner;

public class Bloco3Ex10 {
    public static void main(String[] args){
        int produto = 1;
        int numeroInserido;
        int maiorNumero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserir numero máximo:");
        int N = sc.nextInt();
        sc.nextLine();

        if (N<0){
            do {
                System.out.println("Nº máximo inválido, inserir novo:");
                N = sc.nextInt();
                sc.nextLine();
            } while (N<0);
        }

        while (produto <= N){
            System.out.println("Inserir numero:");
            numeroInserido = sc.nextInt();
            sc.nextLine();
            if (numeroInserido<=0){ //se o utilizador só inserir 0 ou numeros negativos o ciclo fica infinito
                do {
                    System.out.println("Nº inválido, inserir novo:");
                    numeroInserido = sc.nextInt();
                    sc.nextLine();
                } while (numeroInserido<=0);
            }
            produto = produto * numeroInserido;
            if (maiorNumero < numeroInserido){
                maiorNumero = numeroInserido;
            }
        }

        System.out.println("Maior numero: " + maiorNumero);
    }
}
