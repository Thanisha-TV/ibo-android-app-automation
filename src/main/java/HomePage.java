import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends base{
    @FindBy(id = "com.ebo.b2b.android:id/editTextSearch")
    WebElement searchTextBox;
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    public void searchFeature() throws InterruptedException {
        searchTextBox.sendKeys("Floor");
        Thread.sleep(10000);
        //Actions act=new Actions(driver);
        //act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        //Thread.sleep(10000);
        //driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        //Thread.sleep(10000);
        //Thread.sleep(10000);
        //Keyboard board=driver.getKeyboard();
        //board.pressKey(Keys.ENTER);
        //driver.getKeyboard().sendKeys(Keys.ENTER);
        //Actions act=new Actions(driver);
        //act.keyDown(searchTextBox,Keys.ENTER).sendKeys("Floor").keyDown(searchTextBox,Keys.ENTER).build().perform();

        Thread.sleep(10000);
    }
}
