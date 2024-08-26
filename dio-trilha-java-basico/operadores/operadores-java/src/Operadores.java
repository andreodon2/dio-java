public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("OPERADORES DE ATRIBUIÇÃO: \n Fazem atribuiçãode um valor a sua variável correspondente");

        String nome = "André Freitas";
        int idade = 36;
        double peso = 83.5;
        char sexo = 'M';
        boolean doadorOrgao = true;
        //Date dataNascimento = newDate();
        System.out.println("Meu nome é "+ nome + " minha idade é " + idade +", meu peso é " + peso +" Kg. Meu sexo é "+ sexo + " meu status de doação de órgãos é "+ doadorOrgao);
        System.out.println("\n");



        System.out.println("OPERADORES DE ARITIMÉTICOS:\n usam os operadores +; -; * e / por exemplo: \n int x + int y");
        double soma = 10.5 + 15.7;
        System.out.println("A variável soma recebeu os valores 10.5 + 15.7 e o valor foi " + soma);

        int subtracao = 113 - 25;
        System.out.println("A variavel subtracao recebeu os valores 113 - 25 e o resultado foi " + subtracao);

        int multiplicacao = 20 * 7;
        System.out.println("A variável multiplicacao recebeu os valores 20 * 7 e o resultado foi " + multiplicacao);

        int divisao = 15 / 3;
        System.out.println("A variável divisao recebeu os valores 15 / 3 e recebeu o resultado de " + divisao);

        int modulo = 18 % 3;
        System.out.println("A variável modulo recebeu 18 % 3. Traz o resultado qual o resto da divisão. O resultado foi " + modulo);

        double resultado = (10 * 7) + (20 / 4);
        System.out.println("A variável resultado recebeu (10 * 7) + (20 / 4) mostrando a ordem de precedência dos operadores, tendo o resultado " + resultado);

        System.out.println("\n");


        System.out.println("CONCATENAÇÃO COM O +");
        
    }
}
