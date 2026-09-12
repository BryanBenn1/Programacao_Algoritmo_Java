import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Fruit = new Scanner(System.in);
        
        System.out.println("""
            Seja bem-vindo ao Hortifrutti!
            
            Informe o número da fruta:

            1 - Maçã
            2 - Banana
            3 - Laranja
        
                    

        """);

        int NumeroFruta = Fruit.nextInt();

        switch (NumeroFruta) {
            case 1:
                System.out.printf("Você escolheu %d. A fruta é Maçã. \n", NumeroFruta);
                break;
                case 2:
                System.out.printf("Você escolheu %d. A fruta é Banana. \n", NumeroFruta);
                break;
                case 3:
                System.out.printf("Você escolheu %d. A fruta é Laranja. \n", NumeroFruta);
                break;
        
            default:
                System.out.println("Fruta inválida. \n");
                break;
        }




        Fruit.close();
    }
}
