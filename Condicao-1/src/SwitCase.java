public class SwitCase {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");

            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
                break;

        }

        // IF em vez de switch case
        // if (sigla == "P")
        // System.out.println("PEQUENO");

        // else if (sigla == "M")
        // System.out.println("MEDIO");

        // else if (sigla == "G")
        // System.out.println("GRANDE");

        // else
        // System.out.println("Indefinido");
    }
}
