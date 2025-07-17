//Francisco Vazquez
//7.17.25
//Recursive and JUnit assignment

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTest {
    @Test
    public void testCount8(){
        assertEquals(1,Main.count8(8));
        assertEquals(4,Main.count8(8818));
        assertEquals(0,Main.count8(1234567));
        assertEquals(5,Main.count8(888));
        assertEquals(3,Main.count8(80808));
    }

    @Test
    public void testCountHi(){
        assertEquals(1, RecursionProblems.countHi("xxhixx"));
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
        assertEquals(1, RecursionProblems.countHi("hi"));
        assertEquals(0, RecursionProblems.countHi("hello"));
        assertEquals(2, RecursionProblems.countHi("hihi"));
    }
    
    

}