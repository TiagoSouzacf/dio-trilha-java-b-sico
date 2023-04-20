public class Usuario {

    /*
     * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
     * Ela tenha as características: ligada (boolean), canal (int) e volume (int);
     * Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
     * Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
     * Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número
     * correspondente.
     */

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume tv: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume tv: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        
        System.out.println("Canal: " + smartTv.canal);

        smartTv.mudarCanal(25);
        System.out.println("Canal: " + smartTv.canal);

    }

    
}
