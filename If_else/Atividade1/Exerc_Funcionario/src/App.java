import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        String name;
        double salario;
        salario = 1850.0;

        System.out.println("Olá, diga me qual o seu nome para eu informar-lhe sobre seu salário.");
        name = inUser.nextLine();

        System.out.printf("Seja bem-vindo %s seu salário é de: %.2f. \n", name, salario);

        inUser.close();
    }
}
