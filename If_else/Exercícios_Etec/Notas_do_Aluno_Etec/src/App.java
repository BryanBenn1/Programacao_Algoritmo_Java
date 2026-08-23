import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        int nota1, nota2, nota3, media;

        System.out.println("Aluno: Qual foi minha nota em Física?");
        nota1 = inUser.nextInt();
        System.out.println("Aluno: Ok, e quanto eu tirei em Biologia?");
        nota2 = inUser.nextInt();
        System.out.println("Aluno: Opa, já melhorei ( :D ), então quanto eu tirei em Química?");
        nota3 = inUser.nextInt();
        System.out.println("Aluno: Nossa minha nota caiu tanto assim ( D: ), irei estudar mais; OK, mas qual foi o total? Vamos calcular.");

        media = (nota1 + nota2 + nota3)/3;

        System.out.printf("Aluno: Bem você disse que minha nota em física era %d, em biologia era %d, enquanto em química era %d, então somando tudo e depois dividindo por 3 vai dar... Nossa minha média foi %d  ( -_- ). \n", nota1, nota2, nota3, media);

        
        inUser.close();
    }
}
