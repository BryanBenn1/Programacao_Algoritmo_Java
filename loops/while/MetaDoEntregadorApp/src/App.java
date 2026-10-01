import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Cria o Scanner para permitir que o usuário digite informações
        Scanner scanner = new Scanner(System.in);

        // Define a meta que o entregador precisa alcançar
        double meta = 150.00;

        // Guarda o valor total arrecadado durante o dia
        // Começamos com R$ 0,00
        double saldoTotal = 0.00;

        // Vai guardar o valor da corrida atual
        double valorCorrida;

        // Vai guardar o valor da tarifa adicional da chuva
        double tarifaChuva;

        // Guarda a opção escolhida no menu do aplicativo
        int aplicativo;

        // Guarda a resposta sobre estar chovendo ou não
        int chuva;

        // O do-while executa pelo menos uma entrega
        // e continua enquanto o saldo for menor que a meta
        do {

            // Exibe o menu para escolher o aplicativo
            System.out.println("""
                    
                    ===== NOVA ENTREGA =====
                    
                    Escolha o aplicativo:
                    1 - iFood
                    2 - Rappi
                    3 - Zé Delivery
                    
                    """);

            // Lê a opção digitada pelo usuário
            aplicativo = scanner.nextInt();

            // Variável que vai guardar o nome do aplicativo escolhido
            String nomeApp;

            // O switch verifica qual aplicativo foi escolhido
            switch (aplicativo) {

                // Se o usuário escolher 1
                case 1:

                    // Guarda o nome do aplicativo
                    nomeApp = "iFood";

                    // Define o valor da corrida do iFood
                    valorCorrida = 8.00;

                    // Encerra esse case
                    break;

                // Se o usuário escolher 2
                case 2:

                    // Guarda o nome do aplicativo
                    nomeApp = "Rappi";

                    // Define o valor da corrida do Rappi
                    valorCorrida = 9.00;

                    // Encerra esse case
                    break;

                // Se o usuário escolher 3
                case 3:

                    // Guarda o nome do aplicativo
                    nomeApp = "Zé Delivery";

                    // Define o valor da corrida do Zé Delivery
                    valorCorrida = 10.00;

                    // Encerra esse case
                    break;

                // Caso o usuário digite qualquer outra opção
                default:

                    // Exibe uma mensagem informando que a opção é inválida
                    System.out.println("Aplicativo inválido!");

                    // Volta para o começo do do-while
                    continue;
            }

            // Pergunta se estava chovendo durante a entrega
            System.out.println("""
                    
                    Estava chovendo?
                    1 - Sim
                    2 - Não
                    
                    """);

            // Lê a resposta do usuário
            chuva = scanner.nextInt();

            // Verifica se estava chovendo
            if (chuva == 1) {

                // Se estava chovendo, adiciona R$ 5,00
                tarifaChuva = 5.00;

            } else {

                // Se não estava chovendo, não existe tarifa adicional
                tarifaChuva = 0.00;
            }

            // Soma a tarifa da chuva ao valor da corrida
            //
            // Exemplo:
            // iFood = R$ 8,00
            // Chuva = R$ 5,00
            // Total = R$ 13,00
            valorCorrida = valorCorrida + tarifaChuva;

            // Adiciona o valor da corrida ao saldo total do dia
            //
            // Exemplo:
            // Saldo anterior = R$ 20,00
            // Nova corrida = R$ 13,00
            // Novo saldo = R$ 33,00
            saldoTotal = saldoTotal + valorCorrida;

            // Mostra as informações da entrega realizada
            System.out.printf("""
                    
                    ===== ENTREGA FINALIZADA =====
                    
                    Aplicativo: %s
                    Valor da entrega: R$ %.2f
                    Saldo total do dia: R$ %.2f
                    Falta para atingir a meta: R$ %.2f
                    
                    """,

                    // Mostra o nome do aplicativo
                    nomeApp,

                    // Mostra quanto ganhou nessa entrega
                    valorCorrida,

                    // Mostra quanto já acumulou no dia
                    saldoTotal,

                    // Calcula quanto falta para chegar aos R$ 150,00
                    //
                    // Math.max impede que apareça um valor negativo
                    // caso o entregador ultrapasse a meta
                    Math.max(0, meta - saldoTotal)
            );

        // Continua fazendo entregas enquanto o saldo for menor que R$ 150
        } while (saldoTotal < meta);


        // Quando sair do loop significa que a meta foi atingida
        System.out.println("""
                
                =================================
                META ATINGIDA!
                Você pode encerrar o expediente.
                =================================
                
                """);

        // Fecha o Scanner
        scanner.close();
    }
}