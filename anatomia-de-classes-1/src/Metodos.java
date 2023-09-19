
public class Metodos {

    public static void main(String[] args) {

        String primeiroNome = "Mateus";
        String segundoNome = "Fernando";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}