import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void helloTest() {

        assertEquals("B", "B");
    }

    @Test
    public void addSuccess()
    {
        assertEquals(7, HelloWorld.add(3,4));
    }

}
