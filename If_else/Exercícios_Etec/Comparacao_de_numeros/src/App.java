import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        int maior;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            maior = num1;
        } else {
            maior = num2;
        }
       

        System.out.printf("O maior número entre %d e %d é: %d", num1, num2, maior);

        scanner.close();
    }
}
