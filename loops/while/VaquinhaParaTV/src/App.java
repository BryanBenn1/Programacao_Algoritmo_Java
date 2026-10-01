import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner TvTime = new Scanner(System.in);
        double dinheiroDepositado;
        double conta = 0;
        double valorTv = 6634.05;
        double novaConta = 0;
        

        
        
        do{
            System.out.printf("""
                    Seu saldo é de %.2f.
                    Seu objetivo é %.2f.
                    Você deseja depositar quanto?
                    \n""", novaConta, valorTv);

            dinheiroDepositado = TvTime.nextDouble();
            double saldoAnterior = conta;
            conta = conta + dinheiroDepositado;
            novaConta = conta;
            if( conta != valorTv ){
            System.out.printf("""
                    Seu saldo na conta era de %.2f.
                    Você depositou %.2f na sua conta.
                    Com isso seu saldo é de %.2f.\n
                    Ficou faltando %.2f para você comprar sua TV.\n
                    
                    """, saldoAnterior, dinheiroDepositado, novaConta, (valorTv - novaConta));
            }
            
            

        }while( conta < valorTv );

        if (novaConta >= valorTv ){
            System.out.println("Parábens você concluiu sua meta, já pode comprar sua TV\n");
        }else;
        

        //*  não estude esse código, ele está todo errado. */
        
        


       //(conta + dinheiroDepositado)
        

        TvTime.close();
    }
}
