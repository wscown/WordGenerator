/**
 * Created by wscown and kbittner on 1/19/16.
 */
class Command {
    private char[] userSequence;
    private int numberOfWords;
    private int maxWordLength;
    private char outputChoice;

    Command(char[] userSequence, int numberOfWords, int maxWordLength, char outputChoice) {
        this.userSequence = userSequence;
        this.numberOfWords = numberOfWords;
        this.maxWordLength = maxWordLength;
        this.outputChoice = outputChoice;
    }

    public char[] getUserSequence() {
        return userSequence;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public char getOutputChoice() {
        return outputChoice;
    }

    public int getMaxWordLength(){
        return maxWordLength;
    }
}
