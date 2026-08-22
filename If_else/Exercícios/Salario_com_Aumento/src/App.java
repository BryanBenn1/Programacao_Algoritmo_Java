public class App {
    public static void main(String[] args) throws Exception {
        
        double salario, aumento, total;
        salario = 2000;
        aumento = (15*salario)/100;

        total = (salario) + (aumento);
        System.out.println("O novo salario é: R$" + total);
        System.out.println("O valor do aumento é: R$" + aumento);


    }
}
