public class ForExemplo {
    public static void main(String[] args) throws Exception {
        // FOR PADRAO
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + " Carneirinho");
        }
        System.out.println("Mateus Dormiu :3");

        // FOR COM ARRAY
        String alunos[] = { "Ana", "Claudia", "Helena", "Giovanna" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        }
    }
}
