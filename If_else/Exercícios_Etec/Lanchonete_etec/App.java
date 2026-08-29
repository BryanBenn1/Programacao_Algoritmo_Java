import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        int qtdBurger, qtdSoda;

        double priceBurger, priceSoda, total;
        priceBurger = 18;
        priceSoda = 7;

        System.out.println("Seja bem-vindo à lanchonete!");
        System.out.println("Quantos Hamburgueres você quer?");
        qtdBurger = inUser.nextInt();
        System.out.println("Quantos Refrigerantes você quer?");
        qtdSoda = inUser.nextInt();

        total = qtdBurger * priceBurger + qtdSoda * priceSoda;

        System.out.printf("O valor de cada hamburguer é: R$%.2f, e o valor de cada refrigerante é: R$%.2f. \n",
                priceBurger, priceSoda);
        System.out.printf("Você pediu " + qtdBurger + " hamburgueres e " + qtdSoda + " refrigerantes. \n");
        System.out.printf("O valor total dos hamburgueres é: R$%.2f, e o valor total dos refrigerantes é: R$%.2f. O total do seu pedido é R$%.2f. \n",
                qtdBurger * priceBurger, qtdSoda * priceSoda, total);

        inUser.close();
    }
}
