import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWorking {

    @Test
    public void testHelloWorld(){
        SampleTest test = new SampleTest();
        assertEquals("Hello World", test.printHelloWorld());
    }
}
