// import java.util.Random;

public class DoWhile {
    int num = 5, count = 1;
    // public static void main(String[] args) {
    // System.out.println("Discando...");

    // do {
    // System.out.println("Telefone tocando");
    // } while (tocando());

    // System.out.println("Alo !!!");
    // }

    // private static boolean tocando() {
    // boolean atendeu = new Random().nextInt(3) == 1;
    // System.out.println("Atendeu " + atendeu);

    // return !atendeu;
    // }
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) // % operador que representa módulo de uma divisão
                System.out.println(x);
        }
    }

}
