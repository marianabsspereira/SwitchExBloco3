import java.util.Scanner;

public class Bloco3Ex12 {
    public static void main(String[] args){
        int N;
        double a;
        double b;
        double c;
        String msg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserir numero de equações a resolver: ");
        N = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i<=N; i++){
            System.out.println("Inserir valor de a: ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.println("Inserir valor de b: ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.println("Inserir valor de c: ");
            c = sc.nextInt();
            sc.nextLine();
            msg = Bloco3Ex12.equacoes2grau(a,b,c);
            System.out.println(msg);
        }
    }
    public static String equacoes2grau (double a, double b, double c){
        String resultado = "";
        double sol1;
        double sol2;
        double delta = Math.pow(b,2) - 4 * a * c;
        if (a == 0){
            resultado = "Com a = 0 a equação não é de 2º grau";
        } else if (delta < 0 ){
            resultado = "Equação não tem soluções em R";
        } else if (delta == 0){
            sol1 = -b / (2*a);
            resultado = "Equação tem raíz dupla: " + sol1;
        } else if (delta > 0){
            sol1 = (-b + delta)/(2*a);
            sol2 = (-b - delta)/(2*a);
            resultado = "Equação tem 2 raizes: " + sol1 + ";" + sol2;
        } else if (b == 0 && c < 0) {
            sol1 = Math.sqrt(c/a);
            sol2 = - Math.sqrt(c/a);
            resultado = "Equação tem 2 raizes: " + sol1 + ";" + sol2;
        } else if (b == 0 && c == 0) {
            sol1 = 0;
            resultado = "Equação tem 1 raíz: " + sol1;
        } else if (b == 0 && c > 0) {
            resultado = "Equação não tem soluções em R";
        } else if (c== 0) {
            resultado = "Equação incompleta";
        } else {
            resultado = "Erro";
        }

       return resultado;
    }
}
