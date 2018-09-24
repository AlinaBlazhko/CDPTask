import org.testng.annotations.Test;
import po.HomePage;

public class SimpleTest {
    HomePage homePage = new HomePage();

    @Test
    public void test(){
        homePage.open().writeQuery("google translate");
    }
}
