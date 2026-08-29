import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner inUser = new Scanner(System.in);

        String nome;
        

        System.out.println("Olá, qual o seu nome?");
        nome = inUser.nextLine();
        

        System.out.printf("Seja bem-vindo %s. \n", nome);


        inUser.close();
    }
}
