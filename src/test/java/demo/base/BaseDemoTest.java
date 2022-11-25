package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void three_plus_one_is_four(){
        BaseDemo baseDemo = new BaseDemo();

        int expected = 4;

        assertEquals(expected, baseDemo.sum(3,1));
    }

    @Test
    public void four_plus_four_is_eight(){
        BaseDemo baseDemo = new BaseDemo();

        int expected = 8;

        assertEquals(expected, baseDemo.sum(4 ,4));
    }
}
