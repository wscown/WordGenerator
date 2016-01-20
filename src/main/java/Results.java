import java.util.Arrays;

/**
 * Created by wscown and kbittner on 1/19/16.
 */
class Results {
    String[] userResults;

    //prints the results
    public void print() {

        for(int i = 0; i < userResults.length; i++) {
            System.out.println(userResults[i]);
        }
    }

    //alphabetize
    public void sort() {
        Arrays.sort(userResults);
    }

    //populate the string array userResults. calls Generator
    public void populate(Command c) {

        Generator g = new Generator();

        userResults = new String[c.getNumberOfWords()];

        for(int i = 0; i < c.getNumberOfWords(); i += c.getUserSequence().length){

            for(int j = 0; j < c.getUserSequence().length && i+j < c.getNumberOfWords(); j++) {
                userResults[i+j] = g.generateWord(c.getUserSequence()[j], c.getMaxWordLength());
            }
        }

        if(c.getOutputChoice() == 'a'){
            sort();
        }
    }

    //Used in testing to populate our String array with a stub to allow testing of the sort command.
    public void addTestData(String[] testdata) {
        userResults = testdata;
    }

    public String[] getUserResults() {
        return userResults;
    }
}
