package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    private IntStack stack;

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
        stack.push(1);
        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue(int tala){
        stack.push(tala);
        int poppedTala = stack.pop();
        assertEquals(tala, poppedTala);
    }

}
