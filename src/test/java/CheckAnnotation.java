import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckAnnotation {
    @BeforeClass
    public void classMethod(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void methodMethod(){
        System.out.println("Before Method");
    }
    @BeforeTest
    public void testMethod(){
        System.out.println("Before Test");
    }
    @Test
    public void testTest(){
        System.out.println("@Test");
    }
    @Test(description = "Sanity")
    public void testTest2(){
        System.out.println("@Test2");
    }
    @BeforeSuite
    public void suiteMethod(){
        System.out.println("Before Suite");
    }
}
