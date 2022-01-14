package testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMethod {
    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        System.out.println("Start");
        assertEquals(1, 1);
        System.out.println("End");
    }
}
