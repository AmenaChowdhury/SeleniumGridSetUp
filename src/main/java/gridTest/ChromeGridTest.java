package gridTest;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeGridTest {
    public static void main(String[] args) throws MalformedURLException {

        // desired capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN10);

        // 2. chromeOptions
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        String hubURL = "http://10.202.80.241:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubURL),options);
        driver.get("https://www.verizon.com/home/verizonglobalhome/ghp_landing.aspx");
        System.out.println(driver.getTitle());
    }
}
