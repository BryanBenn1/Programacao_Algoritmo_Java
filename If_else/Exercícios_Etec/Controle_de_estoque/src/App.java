import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int estoqueInicial, vendidos, recebidos, estoqueFinal;

        System.out.println("Me diga a quantidade inicial no estoque: ");
        estoqueInicial = scanner.nextInt();
        System.out.println("Então me diga a quantidade de produtos vendidos: ");
        vendidos = scanner.nextInt();
        System.out.println("E agora me diga a quantidade de produtos recebidos: ");
        recebidos = scanner.nextInt();

        estoqueFinal = estoqueInicial - vendidos + recebidos;

        System.out.printf("O Estoque final é de: %d produtos", estoqueFinal);

        scanner.close();
    }
}
