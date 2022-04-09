import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class base {
    public static Properties prop;
    public static AndroidDriver driver;
    public base() {
        try{
            prop = new Properties();
            FileInputStream file = new FileInputStream("./src/main/java/config.properties");
            prop.load(file);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static AndroidDriver LaunchApp() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        //cap.setCapability("chromedriverExecutable", "/usr/local/bin/chromedriver");
        //cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("appPackage", "com.ebo.b2b.android");
        cap.setCapability("appActivity", "com.ebo.mart.ui.views.homepage.activity.HomeMainActivity");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
        cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        cap.setCapability(MobileCapabilityType.APP,"/Users/thanisha/Documents/340dc220-185f-4373-a109-c62a75d1b79c.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
        driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4724/wd/hub"),cap);
        driver.findElementById("com.ebo.b2b.android:id/editTextSearch").sendKeys("Floor");
        return driver;
    }

}


