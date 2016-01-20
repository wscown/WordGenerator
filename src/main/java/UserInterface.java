import java.util.Scanner;

/**
 * Created by wscown and kbittner on 1/19/16.
 */
class UserInterface {

    Results r = new Results();

    //Constructor initialises UserInterface behaviour
    UserInterface(){
        getUserInput();
    }

    //user prompt
    public void printUsage() {
        System.out.println("Program manual");
        System.out.println("1. Enter list of letters without whitespace and hit return.");
        System.out.println("2. Enter number of words you request (int) and hit return.");
        System.out.println("3. Enter the maximum length you want your words to be (int) and hit return");
        System.out.println("4. Enter output choice ('a' for alphabetized, 's' for sequential) and hit return.");
    }

    //converts input into variables
    public void getUserInput() {

        Scanner scanner = new Scanner(System.in);

        printUsage();

        String firstInput = scanner.next();
        int secondInput = scanner.nextInt();
        int thirdInput = scanner.nextInt();
        char fourthInput = scanner.next().toCharArray()[0];

        generateResults(new Command(firstInput.toCharArray(), secondInput, thirdInput, fourthInput));

        r.print();
    }

    //telling Results object to create results
    public void generateResults(Command c) {
        r.populate(c);
    }

    //printResults prints the contents of the Results array in its current form
    public void printResults() {
        r.print();
    }
}
