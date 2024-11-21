import java.io.File;
public class PlayWordle {
    private String secretWord = "ormes";
    public PlayWordle(){
        //File reader = new File("words1000.txt");
    }
    public String checkGuess(String userin){
        String output;
        output = "";
        for(int i = 0; i < 5; i++) {
            String letter_C = secretWord.substring(i,i+1);
            String letter_U = userin.substring(i,i+1);
            if (letter_U.equals(letter_C)){
                output = output + "🟩";
            }
            else if (secretWord.contains(letter_U)){
                output = output + "🟨";
            }
            else {
                output = output + "🟥";
            }
        }
        return"";
    }
}
