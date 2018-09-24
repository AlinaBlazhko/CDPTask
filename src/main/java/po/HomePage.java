package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class HomePage extends AbstractPage {
    @FindBy(id = "lst-ib")
    WebElement searchBar;

    public HomePage open(){
        driver.get("https://www.google.com/");
        return this;
    }

    public void writeQuery(String query){
        searchBar.sendKeys(query);
        searchBar.sendKeys(DOWN);
        searchBar.sendKeys(ENTER);
    }
}
