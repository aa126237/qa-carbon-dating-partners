import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Carbon14DatingTest {
    //#1 Build a test for calculateAge();


    /*
        #2 Build a test for setRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */

   /*
        #3 Build a test for getRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */

    // #4 Build a test for the toString() method.

    // test of toString method - Colton S.
    @Test
    public void testToString(){
        Carbon14Dating e = new Carbon14Dating(12);
        String actual = e.toString();
        String expected = "The age of the sample is: 17,527.46 years";
        assertEquals(expected, actual);
    }
}
