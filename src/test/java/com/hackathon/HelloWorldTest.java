package com.hackathon;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

        @Test
        public void getName() throws Exception {
            HelloWorld vanitha = new HelloWorld("Vanitha");
            assertEquals("Vanitha",vanitha.getName());




    }
}
