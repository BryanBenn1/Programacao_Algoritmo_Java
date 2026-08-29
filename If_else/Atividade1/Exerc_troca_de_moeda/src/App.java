import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double real, dolar;

        System.out.println("Informe o seu dinheiro em Real.");
        real = inUser.nextDouble();

        dolar = (real / 5.19);

        System.out.printf("Você tem R$%.2f real(is), se for converter para dólar(es), ficaria $%.2f dólar(es). \n", real, dolar);

        inUser.close();
    }
}
