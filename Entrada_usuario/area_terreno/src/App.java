import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double largura, comprimento, area;

        System.out.println("Seja bem-vindo a nossa loja!");
        System.out.println("Qual a largura do terreno?");
        largura = inUser.nextDouble();
        System.out.println("Qual o comprimento do terreno?");
        largura = inUser.nextDouble();
        comprimento = inUser.nextDouble();

        area = largura*comprimento;
        /*
        System.out.println("A area do seu terreno é: " + area + "M(metros)");
        System.out.printf("A area do terreno é: %.2f", area);
        */
        System.out.printf("Você informou que a largura é: %.2f, e o comprimento é: %.2f. A área do terreno é %.2fmts. \n", largura, comprimento, area);

            /*
            Para as saídas formatadas utilize
            %d para inteiros
            %s para Textos String
            %f para numeros fracionados
            %b para bleanos
            %c para caracteres
            */




        inUser.close();
    }
}
