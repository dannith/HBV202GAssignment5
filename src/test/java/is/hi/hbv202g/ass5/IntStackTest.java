package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    private IntStack stack;
    private int number;

    @Before
    public void createTestStack(){
        stack = new IntStack();
    }
    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull(){
        for(int i = 0; i < stack.getCapacity(); i++)
            stack.push(i);
        assertTrue(stack.isFull());
    }

    @Test
    public void testAlmostFullStackIsNotFull(){
        for(int i = 0; i < stack.getCapacity() - 1; i++)
            stack.push(i);
        assertFalse(stack.isFull());
    }

    @Test
    public void testAlmostEmptyStackIsNotFull(){
        stack.push(number);
        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue(){
        stack.push(number);
        int poppedTala = stack.pop();
        assertEquals(number, poppedTala);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack(){
        stack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack(){
        for(int i = 0; i < stack.getCapacity() + 1; i++)
            stack.push(i);
    }

}
