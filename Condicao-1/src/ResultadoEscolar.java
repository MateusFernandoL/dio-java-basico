public class ResultadoEscolar {
    public static void main(String[] args) {

        // // Condicional SIMPLES
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println(saldo);

        // // Condicional COMPOSTA
        int estoque = 10;
        int quantidadeSolicitada = 5;

        if (quantidadeSolicitada <= estoque)

            System.out.println("Adicionado ao carrinho");

        else

            System.out.println("Estoque insuficiente");

        // // Condicional ENCADEADA
        int nota = 6;
        int notaNecessaria = 7;
        int notaRecuperacaoA = 5;
        int notaRecuperacaoB = 6;

        if (nota >= notaNecessaria)

            System.out.println("Aprovado");

        else if (nota == notaRecuperacaoA || nota == notaRecuperacaoB)

            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");

    }
}
