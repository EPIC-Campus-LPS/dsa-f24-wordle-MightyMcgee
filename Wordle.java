import java.util.Scanner;
public class Wordle {
    public PlayWordle currentGame;
    public Wordle(){
        currentGame = new PlayWordle();
    }
    public void StepGame(){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
    }
}
