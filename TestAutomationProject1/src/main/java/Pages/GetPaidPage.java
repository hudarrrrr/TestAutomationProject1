package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetPaidPage
{
    private WebDriver driver;
    public By price = By.xpath("//div[@class='left'][contains(.,'Release a Lien')]/following-sibling::div[@class='right panel-heading--price']/span[@class='price-amount']");

    public GetPaidPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public String getElementPrice()
    {
        new WebDriverWait(driver, Duration.ofSeconds(70)).until(ExpectedConditions.visibilityOfElementLocated(price));
        return driver.findElement(price).getText();
    }
}
