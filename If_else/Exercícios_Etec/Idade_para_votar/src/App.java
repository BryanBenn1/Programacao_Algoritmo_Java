import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        int idade;
        boolean podeVotar;

        System.out.println("Me informe sua Idade.");
        idade = inUser.nextInt();
        
        podeVotar = idade >= 16;
        if(podeVotar == true){
           System.out.printf("Você tem %d anos de idade, então pode votar \n", idade);
           
        }else{
           System.out.printf("Você tem %d anos de idade, então não pode votar \n", idade);

        }

        
           


        inUser.close();
    }
}
