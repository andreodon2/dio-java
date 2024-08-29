public class Operadores_logicos {
    public static void main(String[] args) throws Exception {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        else {
            System.out.println("As duas condições são falsas");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
        else {
            System.out.println("As duas condições são falsas");
        }
    }
}
