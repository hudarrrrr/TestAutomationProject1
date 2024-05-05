package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import Pages.HomePage;

public class BaseTest
{
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(50,TimeUnit.MILLISECONDS);
        driver.get("https://www.levelset.com/");
        homePage = new HomePage(driver);
    }

}
