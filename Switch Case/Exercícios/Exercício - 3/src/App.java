import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner transporte = new Scanner(System.in);

        System.out.println("""
            Seja bem-vindo a Bilheteria!

            Informe o número do sua passagem:
            
            1 - Ônibus Urbano
            2 - Metrô
            3 - Trem Intermunicipal
            4 - Ônibus Rodoviário

            """);
            int NumeroTransporte = transporte.nextInt();
            System.out.println("Quantos Bilhetes você quer?");    
            int QtdBilhetes = transporte.nextInt();


            switch (NumeroTransporte) {
                case 1 ->{
                        System.out.printf("Você escolheu %d, então seu transporte é Ônibus Urbano. \n", NumeroTransporte);
                        double PriceBilhetes = 4.40;
                        System.out.printf("Ficou R$%.2f \n", QtdBilhetes * PriceBilhetes);
                         } 
                case 2 ->{
                        System.out.printf("Você escolheu %d, então seu transporte é Ônibus Urbano. \n", NumeroTransporte);
                        double PriceBilhetes = 5.0;
                        System.out.printf("Ficou R$%.2f \n", QtdBilhetes * PriceBilhetes);
                         }
                case 3 ->{
                        System.out.printf("Você escolheu %d, então seu transporte é Ônibus Urbano. \n", NumeroTransporte);
                        double PriceBilhetes = 6.50;
                        System.out.printf("Ficou R$%.2f \n", QtdBilhetes * PriceBilhetes);
                         } 
                case 4 ->{
                        System.out.printf("Você escolheu %d, então seu transporte é Ônibus Urbano. \n", NumeroTransporte);
                        double PriceBilhetes = 12.0;
                        System.out.printf("Ficou R$%.2f \n", QtdBilhetes * PriceBilhetes);
                         } 
                default -> {
                    System.out.println("Transorte não encontrado.");
                }
                    
            }

        
        transporte.close();
    }
}

