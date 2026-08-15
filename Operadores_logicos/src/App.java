public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores Lógicos");

            
        double nota = 6;
        int frequencia = 75;
        boolean result;

        System.out.println("Operador e" );
        result = (nota >=6 && frequencia >=75);
        System.out.println(result);

        System.out.println("\n Operador ou" );
        result = (nota >=4 || frequencia >=75);
        System.out.println(result);

        System.out.println("\n Operador not" );
        
        System.out.println(result);
        System.out.println(!result);
        System.out.println(!(!result));




    }
}
