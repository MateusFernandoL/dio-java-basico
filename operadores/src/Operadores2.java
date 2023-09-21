public class Operadores2 {
    public static void main(String[] args) {

        // ++ adicionar +1
        int numero = 5;
        ++numero; // A alteração ocorrera de forma antecipada ao colocar o operador primeiro
        System.out.println(numero);

        // ! negação
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        // Ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        // == também pode ser utilizado o .equals() quando se tratar de objeto
        String um, dois;
        um = "Mateus";
        dois = "Mateus";

        System.out.println(um.equals(dois));
    }
}
