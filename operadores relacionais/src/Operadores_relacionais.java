public class Operadores_relacionais {
    public static void main(String[] args) throws Exception {
        String nomeUm = "André";
        // String nomeDois = "André";
        String nomeDois = new String("André");
        // System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois)); // Compara conteúdos e objetos
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A condição é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
}
