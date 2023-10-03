public class Ternario {

    public static void main(String[] args) {

        // Condicional COMPOSTA
        int estoque = 10;
        int quantodadeSolicitada = 5;

        String resultado = estoque < quantodadeSolicitada ? "Estoque insuficiente" : "Adicionado ao carrinho";
        System.out.println(resultado);

        // Condicional ENCADEADA

        int nota = 7;
        int notaNecessaria = 7;
        int notaRecuperacao = 5;

        String resultado1 = nota >= notaNecessaria ? "Aprovado" : nota > notaRecuperacao ? "Recuperação" : "Reprovado";

        System.out.println(resultado1);
    }
};
