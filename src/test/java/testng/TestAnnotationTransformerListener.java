package testng;

import org.testng.IAnnotationTransformer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestNGMethod;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.TestNGMethod;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;


//public class TestAnnotationTransformerListener implements IAnnotationTransformer {
//
//    @Override
//    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//
//        TestMethodInfo anot = testMethod.getAnnotation(TestMethodInfo.class);
//
//        System.out.println(anot.priority() + " " + anot.author() + " " + anot.lastModified());
//    }
//}

public class TestAnnotationTransformerListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        List<ITestNGMethod> testNGMethods = suite.getAllMethods();
        for (ITestNGMethod m : testNGMethods) {
            TestMethodInfo anotationMethodInfo = m.getMethod().getAnnotation(TestMethodInfo.class);
            System.out.println(anotationMethodInfo.priority() + " " + anotationMethodInfo.author() + " " + anotationMethodInfo.lastModified());
        }

    }

    @Override
    public void onFinish(ISuite suite) {

    }
}