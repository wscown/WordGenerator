import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by wscown and kbittner on 1/19/16.
 */
public class ResultsSpec {

    @Test
    public void testSortMethod(){

        Results results = new Results();

        String [] testData = {"test", "hat", "table", "about", "car", "building", "zebra"};
        String [] testDataSorted = {"about", "building", "car", "hat", "table", "test", "zebra"};


        //Given
        results.addTestData(testData);
        //Then
        assertArrayEquals("userResults String [] value of userData should be equal to test case data", testData, results.getUserResults());
        //When
        results.sort();
        //Then
        assertArrayEquals("userResults String [] value of userData should be equal to test case data sorted", testDataSorted, results.getUserResults());
    }

}