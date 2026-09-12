import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Uni = new Scanner(System.in);
        
        
        System.out.println("""
            Seja bem-vindo ao nosso calendário semanal!

            Informe o dia da semana:

            1 - Domingo
            2 - Segunda
            3 - Terça
            4 - Quarta
            5 - Quinta
            6 - Sexta
            7 - Sábado
            
            """);

            int diaSemana = Uni.nextInt();

            switch(diaSemana){
                case 1: {
                    System.out.printf("Você escolheu %d. O dia da semana é domingo. \n", diaSemana);
                }
                break;
                case 2: {
                    System.out.printf("Você escolheu %d. O dia da semana é segunda.\n", diaSemana);
                }
                break;
                case 3: {
                    System.out.printf("Você escolheu %d. O dia da semana é terça. \n", diaSemana);
                }
                break;
                case 4: {
                    System.out.printf("Você escolheu %d. O dia da semana é quarta.\n", diaSemana);
                }
                break;
                case 5: {
                    System.out.printf("Você escolheu %d. O dia da semana é quinta. \n", diaSemana);
                }
                break;
                case 6: {
                    System.out.printf("Você escolheu %d. O dia da semana é sexta. \n", diaSemana);
                }
                break;
                case 7: {
                    System.out.printf("Você escolheu %d. O dia da semana é sábado. \n", diaSemana);
                }
                break;
                default:
                    {
                        System.out.println("Opção inválida. \n");
            }
            }

            Uni.close();

    }
}
