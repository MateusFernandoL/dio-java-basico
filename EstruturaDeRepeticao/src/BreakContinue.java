public class BreakContinue {
    public static void main(String[] arg) {
        for (int numero = 1; numero <= 5; numero++) {

            if (numero == 3)
                continue; // NÃO EXECUTA O CODIGO DO IF
            // break; NÃO CONTINUA A SEQUENCIA
            System.out.println(numero);
        }
    }
}
