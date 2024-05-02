package SmartTvMetodo;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O volume da tv está em: " + smartTv.volume);
        System.out.println("O canal atual é: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("A TV agora está: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("O volume atual é: " + smartTv.volume);

        smartTv.aumentarCanal(23);
        System.out.println("Canal atual é: " + smartTv.canal);

    }
}
