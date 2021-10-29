public class Bloco3Ex18 {

    public static boolean validaCC (int numeroCC, int numeroExtra){
        boolean resultado;
        int DIGITOSCC = 8;
        int soma = 0;
        //int j = (DIGITOSCC + 1); enunciado diz que devia ser multiplicado na ordem original. Penso que será na ordem inversa
        int i = 1;
        int k = 1;
        int conta = 0;

        numeroCC = numeroCC * 10 + numeroExtra;

        while (conta < (DIGITOSCC + 1)) {
            soma += ((numeroCC / i) % 10) * k;
            i = i * 10;
            k++;
            conta++;
        }

        if (soma % 11 == 0){
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }
}
