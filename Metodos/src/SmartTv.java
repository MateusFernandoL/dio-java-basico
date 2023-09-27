public class SmartTv {

    boolean energia = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        energia = true;
        System.out.println("Tv ligada");
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

    public void desligar() {
        energia = false;
        canal = 1;
        volume = 25;
        System.out.println("Tv desligada");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void aumentarCanal() {
        if (canal == 10) {
            canal = 1;
        } else {
            canal++;
        }
        System.out.println("Canal: " + canal);
    }

    public void diminuirCanal() {
        if (canal == 1) {
            canal = 10;
        } else {
            canal--;
        }
        System.out.println("Canal: " + canal);
    }

    public void inserirCanal(int numero) {
        if (numero > 10 || numero < 1) {
            System.out.println("Insira um canal válido");
        } else {
            canal = numero;
            System.out.println("Canal: " + canal);
        }
    }
}