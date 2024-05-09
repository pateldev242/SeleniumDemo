import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestKonsbergGeospatial extends BaseUtils{
    @BeforeMethod
    public void initialize(){
        openBrowser("Chrome");
        openURL("https://www.facebook.com/");
    }
    @Test(dataProvider = "TestData")
    public void checkInquiryForm(String name1, String name2){

        typeOn("id", "email",name1);
        sleep();
        typeOn("id", "pass",name2);

    }

    @AfterMethod
    public void tearDown(){
        printScreen("Kongsberg");
        closeBrowser();
        closeAllBrowser();
    }
    @DataProvider(name = "TestData")
    public Object[][] testData() {
        return new Object[][]{
                {"Car", "Bike"},
                {"Bus","Train"},
                {"Bike", "Cycle"}
        };
    }
}