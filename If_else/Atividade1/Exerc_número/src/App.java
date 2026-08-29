import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        
        double number, dobro, dividoPor3;
        
        System.out.println("Digite um número.");
        number = inUser.nextDouble();

        dobro = (number*2);
        dividoPor3 = (dobro/3);

        System.out.printf("O número no qual você digitou é: %.2f, o dobro dele é: %.2f e a terceira parte dele é: %.2f. \n", number, dobro, dividoPor3);


        inUser.close();
    }
}
