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
        assertEquals(8, HelloWorld.add(3,4));
    }

}
