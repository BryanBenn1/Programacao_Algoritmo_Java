import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int idade;
        boolean possuiIngresso;

        System.out.print("Digite a idade da pessoa: ");
        idade = scanner.nextInt();
        System.out.print("A pessoa possui ingresso? (true/false): ");
        possuiIngresso = scanner.nextBoolean();

        boolean podeEntrar = (idade >= 18) && possuiIngresso;


        if (podeEntrar) {
            System.out.printf("Você pode entrar na festa. \n");
        } else{
            System.out.printf("Você não pode entrar na festa. \n");
        }


        
        
        
        scanner.close();
    }
}
