package po;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverSingleton;

import java.util.List;

public class AbstractPage {

    protected WebDriver driver;

    public AbstractPage() {
        this.driver = WebDriverSingleton.getWebDriverInstance();
        PageFactory.initElements(driver, this);
    }

    public void waitUntilElementsIsVisible(List<WebElement> element){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(element));
    }
    public void waitUntilElementIsVisible(WebElement element){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
    }    protected void highlightElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid green'", element);
    }

    protected void unHighlightElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='0px'", driver.findElement(locator));
    }

}
