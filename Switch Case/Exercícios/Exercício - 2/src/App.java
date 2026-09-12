import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner CastleCrashers = new Scanner(System.in);
        
        
        System.out.println("""
            Seja Bem-vindo ao Arcade!
            
            Informe o número do Jogo(game):

            1 - Minecraft
            2 - FIFA
            3 - Fortnite
            4 - Call of Duty
            5 - The Sims
            6 - The Lego Movie: Videogame
            7 - The BattleBlock Theater
            8 - Goat Simulator
            9 - Epic Mickey 2
            10 - Hollow Knight
            11 - Halo
            12 - Genshin Impact
            13 - Persona 5
            14 - Undertale
            15 - Deltarune
            16 - Sonic
            17 - Final Fantasy
            18 - Resident Evil
            19 - Poppy Playtime
            20 - Five Nights at Freddy's


            """);

            int game = CastleCrashers.nextInt();

            switch (game) {
                case 1:
                    System.out.printf("Você escolheu %d. O jogo é Minecraft. \n", game);
                    break;
                case 2:
                    System.out.printf("Você escolheu %d. O jogo é FIFA. \n", game);
                    break;
                case 3:
                    System.out.printf("Você escolheu %d. O jogo é Fortnite. \n", game);
                    break;
                case 4:
                    System.out.printf("Você escolheu %d. O jogo é Call of Duty. \n", game);
                    break;
                case 5:
                    System.out.printf("Você escolheu %d. O jogo é The Sims. \n", game);
                    break;
                case 6:
                    System.out.printf("Você escolheu %d. O jogo é The Lego Movie: Videogame. \n", game);
                    break;
                case 7:
                    System.out.printf("Você escolheu %d. O jogo é The BattleBlock Theater. \n", game);
                    break;
                case 8:
                    System.out.printf("Você escolheu %d. O jogo é Goat Simulator. \n", game);
                    break;
                case 9:
                    System.out.printf("Você escolheu %d. O jogo é Epic Mickey 2. \n", game);
                    break;
                case 10:
                    System.out.printf("Você escolheu %d. O jogo é Hollow Knight. \n", game);
                    break;
                case 11:
                    System.out.printf("Você escolheu %d. O jogo é Halo. \n", game);
                    break;
                case 12:
                    System.out.printf("Você escolheu %d. O jogo é Genshin Impact. \n", game);
                    break;
                case 13:
                    System.out.printf("Você escolheu %d. O jogo é Persona 5. \n", game);
                    break;
                case 14:
                    System.out.printf("Você escolheu %d. O jogo é Undertale. \n", game);
                    break;
                case 15:
                    System.out.printf("Você escolheu %d. O jogo é Deltarune. \n", game);
                    break;
                case 16:
                    System.out.printf("Você escolheu %d. O jogo é Sonic. \n", game);
                    break;
                case 17:
                    System.out.printf("Você escolheu %d. O jogo é Final Fantasy. \n", game);
                    break;
                case 18:
                    System.out.printf("Você escolheu %d. O jogo é Resident Evil. \n", game);
                    break;    
                case 19:
                    System.out.printf("Você escolheu %d. O jogo é Poppy Playtime. \n", game);
                    break;  
                case 20:
                    System.out.printf("Você escolheu %d. O jogo é Five Nights at Freddy's. \n", game);
                    break;      

                default:
                    System.out.println("Jogo não encontrado. \n");
                    break;
            }


        CastleCrashers.close();
    }
}
