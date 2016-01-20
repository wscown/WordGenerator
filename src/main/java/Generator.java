import java.util.Random;
/**
 * Created by wscown and kbittner on 1/19/16.
 */
class Generator {

    public String generateWord(char first, int wordLength) {

        String word = "" + first;

        word = word.toUpperCase();

        //generates a random number to be the full length of this word, with a maximum of 10
        int t = (int) (Math.random() * wordLength);
        //each iteration selects a random letter, repeating until the length of word is reached
        for (int i = 0; i < t; i++) {
            word += generateRandomChar();
        }

        return word;
    }

    //called by generateWord to generate each random letter
    public String generateRandomChar() {

        Random rn = new Random();
        int letter = 97 + rn.nextInt(26);

        return (Character.toString((char) (letter)));
    }
}

