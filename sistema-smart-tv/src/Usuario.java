public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: -> TV ligada? " + smartTv.ligada);
    }
}
