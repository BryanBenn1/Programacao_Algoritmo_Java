import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double largura, comprimento, area;

        System.out.println("Fale a largura do terreno em metros: ");
        largura = scanner.nextDouble();
        System.out.println("Fale o comprimento do terreno em metros: ");
        comprimento = scanner.nextDouble();

        area = largura * comprimento;

        System.out.printf("Área total do terreno é de: %.2fM(Metros)", area);

        scanner.close();
    }
}
