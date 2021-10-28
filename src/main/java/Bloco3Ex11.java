import java.util.Scanner;

public class Bloco3Ex11 {
    public static void main(String[] args){
        int N;
        int conta = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserir numero que pertença a [1,20]:");
        N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 10; j++) {
                if (i + j == N){
                    conta ++;
                }
            }
        }
        conta = conta / 2;
        System.out.println("Nº de formas possíveis: " + conta);
    }

}
