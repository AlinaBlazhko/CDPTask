import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import po.HomePage;

import static utils.WebDriverSingleton.kill;

public class SimpleTest {
    HomePage homePage = new HomePage();

    @Test
    public void test(){
        homePage.open().writeQuery("google translate");
    }

    @AfterTest
    public void after(){
        kill();
    }
}
