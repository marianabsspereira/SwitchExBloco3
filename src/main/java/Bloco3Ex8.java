import java.util.Scanner;

public class Bloco3Ex8 {
    public static void main(String[] args){
        Bloco3Ex8.somaNumeros();
    }
    //exercicio 8, bloco 3 : sem validação tipo de dados
    public static void somaNumeros (){
        int soma = 0;
        int numeroInserido;
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
        int menorNumero = N;

        while (soma <= N){
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
            soma += numeroInserido;
            if (menorNumero > numeroInserido){
                menorNumero = numeroInserido;
            }
        }

        System.out.println("Menor numero: "+ menorNumero);
    }
}
