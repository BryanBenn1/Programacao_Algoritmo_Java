import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Cria o Scanner para receber os dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Valor que precisamos juntar para comprar a placa de vídeo
        double meta = 1850.00;

        // Valor que já temos acumulado
        // Começamos com R$ 0,00
        double cofrinho = 0.00;

        // Guarda o valor do freela realizado
        double valorFreela;

        // Guarda a forma de pagamento escolhida
        int pagamento;

        // Guarda o serviço escolhido
        int servico;


        // O do-while vai continuar executando
        // enquanto ainda não tivermos dinheiro suficiente
        do {

            // Mostra o menu de serviços
            System.out.println("""
                    
                    ===== NOVO FREELA =====
                    
                    Escolha o serviço realizado:
                    
                    1 - Formatação de PC e Backup - R$ 150,00
                    2 - Configuração de Roteador/Rede - R$ 200,00
                    3 - Criação de Landing Page HTML/CSS - R$ 500,00
                    
                    """);

            // Lê o serviço escolhido
            servico = scanner.nextInt();

            // Variável para guardar o nome do serviço
            String nomeServico;


            // Verifica qual serviço foi escolhido
            switch (servico) {

                // Serviço 1
                case 1:

                    // Guarda o nome do serviço
                    nomeServico = "Formatação de PC e Backup";

                    // Define o valor do serviço
                    valorFreela = 150.00;

                    // Sai do switch
                    break;


                // Serviço 2
                case 2:

                    // Guarda o nome do serviço
                    nomeServico = "Configuração de Roteador/Rede";

                    // Define o valor do serviço
                    valorFreela = 200.00;

                    // Sai do switch
                    break;


                // Serviço 3
                case 3:

                    // Guarda o nome do serviço
                    nomeServico = "Criação de Landing Page HTML/CSS";

                    // Define o valor do serviço
                    valorFreela = 500.00;

                    // Sai do switch
                    break;


                // Caso o usuário digite uma opção que não existe
                default:

                    // Mostra uma mensagem de erro
                    System.out.println("Serviço inválido!");

                    // Volta para o início do do-while
                    continue;
            }


            // Pergunta a forma de pagamento
            System.out.println("""
                    
                    ===== FORMA DE PAGAMENTO =====
                    
                    1 - Pix
                    2 - Cartão
                    
                    """);

            // Lê a forma de pagamento
            pagamento = scanner.nextInt();


            // Verifica se o pagamento foi feito no cartão
            if (pagamento == 2) {

                // Se for cartão, desconta R$ 10,00
                // referente à taxa da maquininha
                valorFreela = valorFreela - 10.00;

            } else {

                // Se for Pix, não existe desconto
                // Portanto, o valor continua integral
                valorFreela = valorFreela;
            }


            // Adiciona o valor recebido pelo freela
            // ao dinheiro acumulado no cofrinho
            cofrinho = cofrinho + valorFreela;


            // Mostra o resultado do freela
            System.out.printf("""
                    
                    ===== FREELA CONCLUÍDO =====
                    
                    Serviço: %s
                    Valor depositado: R$ %.2f
                    Total acumulado: R$ %.2f
                    Falta para comprar a RTX 4060: R$ %.2f
                    
                    """,

                    // Mostra o nome do serviço
                    nomeServico,

                    // Mostra quanto realmente entrou no cofrinho
                    // depois da possível taxa
                    valorFreela,

                    // Mostra o total acumulado
                    cofrinho,

                    // Calcula quanto ainda falta para chegar aos R$ 1.850
                    // Math.max evita mostrar valor negativo
                    Math.max(0, meta - cofrinho)
            );


        // Continua fazendo freelas enquanto o dinheiro
        // acumulado for menor que R$ 1.850
        } while (cofrinho < meta);


        // Quando sair do loop, significa que a meta foi atingida
        System.out.println("""
                
                =========================================
                META ATINGIDA!
                
                Você já pode comprar sua RTX 4060
                e rodar seus jogos no ultra!
                =========================================
                
                """);


        // Fecha o Scanner
        scanner.close();
    }
}