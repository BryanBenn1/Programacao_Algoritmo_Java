import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int senha = 1234;
        int tentativa = 0;
        int chances = 0;

        do{
            System.out.println("Tente descobrir a minha senha e escape do loop\n");
            tentativa = leia.nextInt();
            if(tentativa != senha){
                System.out.printf("""
                    Você digitou %d.
                    Tentativa de desbloqueio INCORRETA!!! Tente novamente.\n
                """, tentativa);
            }
            chances += 1;
        }while(tentativa != senha);

            
        System.out.printf("""
            Parábens você acertou!!!
            Para chegar neste resultado, você tentou %d vez(es)!
            """, chances);

        

        leia.close();
    }
}
