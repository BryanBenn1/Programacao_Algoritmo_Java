import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int pontuacaoInicial, pontuacao1, pontuacao2, pontuacao3, pontuacaoFinal;

        System.out.println("Digite a pontuação inicial: ");
        pontuacaoInicial = scanner.nextInt();
        System.out.println("Pontos ganhos na 1ª rodada: ");
        pontuacao1 = scanner.nextInt();
        System.out.println("Pontos perdidos na 2ª rodada: ");
        pontuacao2 = scanner.nextInt();
        System.out.println("Pontos ganhos na 3ª rodada: ");
        pontuacao3 = scanner.nextInt();

        pontuacaoFinal = pontuacaoInicial + pontuacao1 - pontuacao2 + pontuacao3;

        System.out.printf("Pontuação final do jogador: %d pontos", pontuacaoFinal);

        scanner.close();



    }
}
