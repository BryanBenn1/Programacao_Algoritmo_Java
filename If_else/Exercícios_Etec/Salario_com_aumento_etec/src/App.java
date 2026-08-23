import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double salario, valor_aumento, novoSalario;

        int aumento;

        System.out.println("Me informe seu salário");
        salario = inUser.nextDouble();
        System.out.println("Me informe seu aumento");
        aumento = inUser.nextInt();

        valor_aumento = (salario*aumento)/100;
        novoSalario = (valor_aumento + salario);

        System.out.printf("Se o Salário é R$%.2f e o aumento é de %d porcento, então fazendo a multiplicação, e depois fazendo a soma, o valor do aumento será R$%.2f \n", salario, aumento, valor_aumento);
        System.out.printf("Em seguida fazendo a soma do salário R$%.2f com o valor do aumento R$%.2f, descobrimos o novo salário que é R$%.2f \n", salario, valor_aumento, novoSalario);





        inUser.close();

    }
}
