import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by wscown and kbittner on 1/19/16.
 */

public class CommandSpec {
    @Test
    public void testExpectedCommandInitialValues(){

        Command command = new Command(new char[] {'t', 'e', 's', 't'}, -1, 4, 'c');

        assertArrayEquals("Return value of getUserSequence should be equal to {'t', 'e', 's', 't'}" , new char[] {'t', 'e', 's', 't'}, command.getUserSequence());
        assertEquals("Return value of getNumberOfWords should be equal to -1" , -1, command.getNumberOfWords());
        assertEquals("Return value of getOutputChoice should be equal to 'c'" , 'c', command.getOutputChoice());
        assertEquals("Return value of getMaxWordLength should be equal to 4" , 4, command.getMaxWordLength());
    }
}
