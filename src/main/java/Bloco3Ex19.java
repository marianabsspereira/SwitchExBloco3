import java.util.Scanner;

//In e Out estao c/ calculo para n usar vectores (a func de calc devia receber vector)
//Pelo motivo acima referido não tem testes

public class Bloco3Ex19 {
    public static void main(String[] args){
        //exercicio 19, bloco 3
        int n;
        int impares = 0;
        int pares = 0;
        int numero;
        int resultado;
        int contaAlg = 1;
        int contaPares = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserir numero de algarismos: ");
        n = sc.nextInt();
        //1º iteração
        System.out.println("Inserir algarismo:");
        numero = sc.nextInt();

        while (contaAlg <= n) {

            if (numero % 2 != 0){
                impares = impares * 10;
                impares += numero;
            } else {
                pares = pares * 10;
                pares += numero;
                contaPares++;
            }

            if (contaAlg < n) {
                System.out.println("Inserir algarismo:");
                numero = sc.nextInt();
            }

            contaAlg++;
        };

        if (impares == 0 && pares != 0){
            resultado = pares;
        } else if (pares == 0 && impares != 0){
            resultado = impares;
        } else if (impares != 0 && pares != 0) {
            resultado = (int) (impares * Math.pow(10,(contaPares-1)) + pares);
        } else {
            resultado = 0;
        }
        System.out.println(resultado);
    }
}
