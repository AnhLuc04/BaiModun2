import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzResultTests {
    final int FIZZBUZZ = 1;
    final int FIZZ = 2;
    final int BUZZ = 3;
    final int OUTOFRANGE = -1;

    @Test
    public void resultTest1() {
        int inputNum = 6;
        int expected = FIZZ;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }

    @Test
    public void resultTest2() {
        int inputNum = 10;
        int expected = BUZZ;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }

    @Test
    public void resultTest3() {
        int inputNum = 32;
        int expected = FIZZ;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }

    @Test
    public void resultTest4() {
        int inputNum = 52;
        int expected = BUZZ;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }

    @Test
    public void resultTest5() {
        int inputNum = 35;
        int expected = FIZZBUZZ;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }
    @Test
    public void resultTest6() {
        int inputNum = 75;
        int expected = FIZZBUZZ;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }
    @Test
    public void resultTest7() {
        int inputNum = 53;
        int expected = FIZZBUZZ;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }
    @Test
    public void resultTest8() {
        int inputNum = 100;
        int expected = OUTOFRANGE;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }
    @Test
    public void resultTest9() {
        int inputNum = 0;
        int expected = OUTOFRANGE;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }
    @Test
    public void resultTest10() {
        int inputNum = 28;
        int expected = 28;
        assertEquals(expected, FizzBuzzResult.result(inputNum));
    }
}