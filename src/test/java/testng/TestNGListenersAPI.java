package testng;

import org.testng.TestNG;

public class TestNGListenersAPI {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.setTestClasses(new Class[] { TestMethod.class });
        testNG.addListener(new TestAnnotationTransformerListener());
        testNG.run();
    }
}
