import java.util.Scanner;

public class Bloco3 {

    public static void main(String[] args){
        //exercicio 1, bloco 3 : c)
        Scanner sc = new Scanner(System.in);

        int numeroUser = sc.nextInt();
        int resultadoUser;

        resultadoUser = produtorio(numeroUser);

        System.out.println(resultadoUser);

        //exercicio 2, bloco 3
        Bloco3.percentagemNotasPositivasMediaNegativas();

        //exercicio 3, bloco 3
        Bloco3.percentagemParesMediaImpares();

    }

    //exercicio 1, bloco 3 : a) algoritmo é 1 produtorio que devolve o factorial de 1 dado nº
    public static int produtorio(int numero){
        int resultado = 1;

        for (int x=numero; x>0; x--){ //sem o x>0 o ciclo seria infinito [ alinea c) ]
            resultado = resultado * x;
        }
        return resultado;
    }

    //exercicio 2, bloco 3 : podia n ter o contaNotasNegativas pois é = N - contaNotasPositivas
    public static void percentagemNotasPositivasMediaNegativas (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserir nº de alunos");
        int N = sc.nextInt();
        if (N<=0){
            throw new IllegalArgumentException("Número de alunos inválido");
        }
        int contaNotasPositivas = 0;
        double somaNotasNegativas = 0;
        int contaNotasNegativas = 0;

        for (int i=0;i<N;i++){
            System.out.println("Inserir nota:");
            double nota = sc.nextDouble();
            if (nota<10 && nota>=0 && nota<=20){
                somaNotasNegativas = somaNotasNegativas + nota;
                contaNotasNegativas = contaNotasNegativas + 1;
            } else if (nota>=10 && nota>=0 && nota<=20){
                contaNotasPositivas = contaNotasPositivas + 1;
            } else {
                throw new IllegalArgumentException("Nota inválida, fora de [0,20]");
            }
        }

        double percentagemNotasPositivas = ((contaNotasPositivas*1.0) / N)*100;
        double mediaNotasNegativas;

        if (contaNotasNegativas <= 0){
            mediaNotasNegativas = 0;
        } else {
            mediaNotasNegativas = somaNotasNegativas / contaNotasNegativas;
        }

        System.out.println("% notas positivas: " + percentagemNotasPositivas + " média notas negativas: "
                + mediaNotasNegativas);
    }

    //exercicio 3, bloco 3
    public static void percentagemParesMediaImpares (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserir numero:");
        int numero = sc.nextInt(); // usando o do while não precisava desta linha de código (da parte sc.nextInt();)
        int contaNumerosInseridos = 0;
        int contaNumerosPares = 0;
        int somaNumerosImpares = 0;
        double mediaImpares;
        double percentagemPares;

        while (numero > 0){
            if (numero % 2 == 0){
                contaNumerosPares = contaNumerosPares + 1;
            } else {
                somaNumerosImpares = somaNumerosImpares + numero;
            }

            contaNumerosInseridos = contaNumerosInseridos + 1;
            System.out.println("Inserir numero:");
            numero = sc.nextInt();
        }

        if (contaNumerosInseridos>0){
            percentagemPares = (contaNumerosPares*1.0 / contaNumerosInseridos)*100;
        } else {
            percentagemPares = 0;
        }
        mediaImpares = somaNumerosImpares / (contaNumerosInseridos-contaNumerosPares);
        System.out.println("Percentagem pares: " + percentagemPares + " Média impares: " + mediaImpares);
    }
    //exercicio 4, bloco 3: Sem qualquer validação de dados ou tratamento de excepções
    public static String multiplosA (int limInferior, int limSuperior){
        String msg = "";
        for (int i = limInferior; i <= limSuperior; i++){
            if (i % 3 == 0){
                msg = msg + " " + i + ";";
            }
        }
        return msg;
    }
    public static String multiplosB (int numero, int limInferior, int limSuperior){
        String msg = "";
        for (int i = limInferior; i <= limSuperior; i++){
            if (i % numero == 0){
                msg = msg + " " + i + ";";
            }
        }
        return msg;
    }
    public static String multiplosC (int limInferior, int limSuperior){
        String multiplosDe3 = "";
        String multiplosDe5 = "";
        for (int i = limInferior; i <= limSuperior; i++){
            if (i % 3 == 0){
                multiplosDe3 = multiplosDe3 + " " + i + ";";
            } else if (i % 5 == 0){
                multiplosDe5 = multiplosDe5 + " " + i + ";";
            }
        }
        return "Multiplos de 3: " + multiplosDe3 + "Multiplos de 5: " + multiplosDe5;
    }
    public static String multiplosD (int num1, int num2, int limInferior, int limSuperior){
        String multiplos1 = "";
        String multiplos2 = "";
        for (int i = limInferior; i <= limSuperior; i++){
            if (i % num1 == 0){
                multiplos1 = multiplos1 + " " + i + ";";
            } else if (i % num2 == 0){
                multiplos2 = multiplos2 + " " + i + ";";
            }
        }
        return "Multiplos de: " + num1 + multiplos1 + "Multiplos de: " + num2 + multiplos2;
    }
    public static int multiplosE (int num1, int num2, int limInferior, int limSuperior){
        int soma = 0;
        for (int i = limInferior; i <= limSuperior; i++){
            if (i % num1 == 0){
                soma += i;
            } else if (i % num2 == 0){
                soma += i;
            }
        }
        return soma;
    }
    //exercicio 5, bloco 3 : Sem qualquer validação de dados ou tratamento de excepções
    public static int somaParesA (int limInferior, int limSuperior){
        int soma = 0;
        for (int i = limInferior; i<= limSuperior; i++){
            if (i % 2 == 0){
                soma += i;
            }
        }
        return soma;
    }
    public static int contaParesB (int limInferior, int limSuperior){
        int conta = 0;
        for (int i = limInferior; i<= limSuperior; i++){
            if (i % 2 == 0){
                conta++;
            }
        }
        return conta;
    }
    public static int somaImparesC (int limInferior, int limSuperior){
        int soma = 0;
        for (int i = limInferior; i<= limSuperior; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }
        return soma;
    }
    public static int contaImparesD (int limInferior, int limSuperior){
        int conta = 0;
        for (int i = limInferior; i<= limSuperior; i++){
            if (i % 2 != 0){
                conta ++;
            }
        }
        return conta;
    }
    public static int somaMultiplosE (int num, int lim1, int lim2){ //intervalo : [limInf,limSup]
        int soma = 0;
        if (lim1 > lim2){
            for (int i = lim2; i <= lim1; i++){
                if (i % num == 0){
                    soma += i;
                }
            }
        } else if (lim1 < lim2){
            for (int i = lim1; i <= lim2; i++){
                if (i % num == 0){
                    soma += i;
                }
            }
        } else {
            if (lim1 % num == 0){
                soma += lim1;
            }
        }

        return soma;
    }
    public static int produtorioMultiplosF (int num, int lim1, int lim2){
        int produto = 1;
        if (lim1 < lim2){
            for (int i = lim1; i <= lim2; i++){
                if (i % num == 0){
                    produto = produto * i;
                }
            }
        } else if (lim1 > lim2){
            for (int i = lim2; i <= lim1; i++){
                if (i % num == 0){
                    produto = produto * i;
                }
            }
        } else { // caso lim1 = lim2 testa se é multiplo
            if (lim1 % num == 0){
                produto = produto * lim1;
            }
        }

        return produto;
    }
    public static double mediaMultiplosG (int num, int lim1, int lim2){
        int soma = 0;
        int conta = 0; // conta só os multiplos
        double media;

        if (lim1 < lim2){
            for (int i = lim1; i <= lim2; i++){
                if (i % num == 0 && i != 0){
                    soma += i;
                    conta ++;
                }
            }
        } else if (lim1 > lim2){
            for (int i = lim2; i <= lim1; i++){
                if (i % num == 0 && i != 0){
                    soma += i;
                    conta ++;
                }
            }
        } else { // caso lim1 = lim2 testa se é multiplo
            if (lim1 % num == 0){
                soma += num;
                conta ++;
            }
        }
        if (conta != 0){
            media = (double) soma / conta;
        } else {
            media = 0;
        }

        return media;
    }
    public static double mediaMultiplosDe2numH(int X, int Y, int lim1, int lim2){
        int soma = 0;
        int conta = 0; // conta só os multiplos
        double media;

        if (lim1 < lim2){
            for (int i = lim1; i <= lim2; i++){
                if ((i % X == 0 || i % Y == 0) && i != 0){
                    soma += i;
                    conta ++;
                }
            }
        } else if (lim1 > lim2){
            for (int i = lim2; i <= lim1; i++){
                if ((i % X == 0 || i % Y == 0) && i != 0){
                    soma += i;
                    conta ++;
                }
            }
        } else { // caso lim1 = lim2 testa se é multiplo
            if (lim1 % X == 0){
                soma += X;
                conta ++;
            } else if (lim1 % Y == 0){
                soma += Y;
                conta ++;
            }
        }
        if (conta != 0){
            media = (double) soma / conta;
        } else {
            media = 0;
        }

        return media;
    }
    //exercicio 6, bloco 3
    public static int numeroAlgarismosA (long numero){
        int contaALgarismos = 0;
        int i = 1;
        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            contaALgarismos ++;
            i = i * 10;
        }
        //condição existe porque sem ela quando numero = 0, devolve 0
        if (numero == 0){
            contaALgarismos = 1;
        }

        return contaALgarismos;
    }
    public static int contaAlgarismosParesB (long numero){
        int contaALgarismos = 0;
        int i = 1;
        if (numero<0){
            numero = Math.abs(numero);
        }

        while (numero / i > 0){
            if (i != 1 && (((numero % i)) / (i/10)) % 2 == 0){
                contaALgarismos ++;
            }
            i = i * 10;
        }
        //condição existe porque sem ela quando numero = 0, devolve 0 (considera 0 par)
        if (numero == 0){
            contaALgarismos = 1;
        }
        //linha existe para capturar o 1º algarismo. Poderia ser eliminada se no while o passo fosse decrescente
        if (numero != 0 && (numero / (i / 10)) % 2 == 0){
            contaALgarismos ++;
        }

        return contaALgarismos;
    }
    public static int contaAlgarismosImparesC (long numero){
        int contaALgarismos = 0;
        int i = 1;
        if (numero<0){
            numero = Math.abs(numero);
        }

        while (numero / i > 0){
            if (i != 1 && (((numero % i)) / (i/10)) % 2 != 0){
                contaALgarismos ++;
            }
            i = i * 10;
        }
        //linha existe para capturar o 1º algarismo. Soluções melhores da alinea d em diante
        if (numero != 0 && (numero / (i / 10)) % 2 != 0){
            contaALgarismos ++;
        }

        return contaALgarismos;
    }
    public static int somaAlgarismosD (long numero){
        int soma = 0;
        int i = 1;
        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            soma += (numero / i) % 10;
            i = i * 10;
        }

        return soma;
    }
    public static int somaAlgarismosParesE (long numero){
        int soma = 0;
        int i = 1;
        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            if (((numero / i) % 10) % 2 == 0){
                soma += (numero / i) % 10;
            }
            i = i * 10;
        }

        return soma;
    }
    public static int somaAlgarismosImparesF (long numero){
        int soma = 0;
        int i = 1;
        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            if (((numero / i) % 10) % 2 != 0){
                soma += (numero / i) % 10;
            }
            i = i * 10;
        }
        return soma;
    }
    public static double mediaAlgarismosG (long numero){
        int soma = 0;
        int conta = 0;
        double media = 0;
        int i = 1;

        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            soma += (numero / i) % 10;
            conta ++;
            i = i * 10;
        }
        if (conta == 0){
            media = 0;
        } else {
            media =  (double) soma / (double) conta;
        }
        return media;
    }
    public static double mediaAlgarismosParesH (long numero){
        int soma = 0;
        int conta = 0;
        double media = 0;
        int i = 1;

        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            if (((numero / i) % 10) % 2 == 0) {
                soma += (numero / i) % 10;
                conta ++;
            }
            i = i * 10;
        }
        if (conta == 0){
            media = 0;
        } else {
            media =  (double) soma / (double) conta;
        }
        return media;
    }
    public static double mediaAlgarismosImparesI (long numero){
        int soma = 0;
        int conta = 0;
        double media = 0;
        int i = 1;

        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            if (((numero / i) % 10) % 2 != 0) {
                soma += (numero / i) % 10;
                conta ++;
            }
            i = i * 10;
        }
        if (conta == 0){
            media = 0;
        } else {
            media =  (double) soma / (double) conta;
        }
        return media;
    }
    public static long inverteAlgarismosJ (long numero){
        long resultado = 0;
        int i = 1;
        int j = 10;
        int k = 1;
        int contaALgarismos = 0;
        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / k > 0){
            contaALgarismos ++;
            k = k * 10;
        }
        contaALgarismos -= 1;
        j = (int) Math.pow(j,contaALgarismos);

        while (numero / i > 0){
            resultado += ((numero / i) % 10) * j;
            i = i * 10;
            j = j / 10;
        }
        return resultado;
    }
}
