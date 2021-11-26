import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void testFirst() throws InterruptedException {
        //Arrange data
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\dmitr\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        //Step 1. Open browser
        WebDriver driver = new ChromeDriver();

        //Step 2. Go to URL
        driver.get(url);
        Thread.sleep(3000); //Sleep for 3 seconds. Throws InterruptedException is added.

        //Step 3. Actual result = Get the web-page URL
        String actualResult = driver.getCurrentUrl();

        //Step 4. Verify
        Assert.assertEquals(actualResult, expectedResult);

        driver.close();
        driver.quit();
    }
}
