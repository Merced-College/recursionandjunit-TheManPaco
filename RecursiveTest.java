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
    
    @Test
    public void testCountHi2() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
        assertEquals(0, RecursionProblems.countHi2("xhixhi"));
        assertEquals(1, RecursionProblems.countHi2("xhixhibhi"));
        assertEquals(1, RecursionProblems.countHi2("hi"));
    }

    @Test
    public void testStrCount() {
        assertEquals(2,Main.strCount("catcowcat","cat"));
        assertEquals(1,Main.strCount("catcowcat","cow"));
        assertEquals(0,Main.strCount("catcowcat","dog"));
        assertEquals(1,Main.strCount("aaa","aa"));
        assertEquals(1,Main.strCount("abc", "abc"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza",Main.stringClean("yyzzza"));
        assertEquals("abcd",Main.stringClean("abbbcdd"));
        assertEquals("Helo",Main.stringClean("Hello"));
        assertEquals("a",Main.stringClean("aaaaa"));
        assertEquals("abc",Main.stringClean("abc"));
    }
}