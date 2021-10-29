public class Bloco3Ex20 {
    public static void main(String[] args){

    }

    public static String classificaNumero (int numero){
        String resultado = "";
        int somaDivisores = 0;

        if (numero < 0){
            numero = Math.abs(numero);
        }

        for (int i = 1; i <= (numero / 2); i++){
            if (numero % i == 0){
                somaDivisores += i;
            }
        }

        //Prof de 6ª prefere os if assim
        if (numero == somaDivisores){
            resultado = "Número perfeito";
        } else
            if (numero < somaDivisores) {
                resultado = "Número abundante";
            } else
                if (numero > somaDivisores)  {
                    resultado = "Número reduzido";
                } else {
                    resultado = "Erro";
                }

        if (numero == 1) {
            resultado = "Número perfeito";
        }

        return resultado;
    }
}
