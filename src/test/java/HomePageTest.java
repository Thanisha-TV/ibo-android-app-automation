import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class HomePageTest extends base{
    HomePage homePage;
    public HomePageTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        LaunchApp();
        homePage=new HomePage();
    }
    @Test
    public void validateSearchFeature() throws InterruptedException {
        homePage.searchFeature();
    }
    /*@AfterMethod
    public void tearDown()
    {
        driver.closeApp();
    }*/

}
