import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        int number, number1, number2;


        System.out.println("Digite um número.");
        number = inUser.nextInt();

        number1 = (number - 1);
        number2 = (number + 1);

        System.out.printf("O antecessor de %d é: %d. \n", number, number1);
        System.out.printf("O sucessor de %d é: %d. \n", number, number2);

        inUser.close();
    }
}
