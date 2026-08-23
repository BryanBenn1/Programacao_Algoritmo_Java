import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        int numero;
        boolean parOuImpar;

        System.out.println("Qual o número de hoje?");
        numero = inUser.nextInt();
        
        parOuImpar = (numero % 2 == 0);

        System.out.printf("O número %d é Par?, %b%n \n", numero, parOuImpar);
        System.out.printf("Classificado como: %s%n", parOuImpar ? "Par" : "Impar");

        inUser.close();

    }
}
