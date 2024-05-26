import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
    }
    @Test
    public void verify_website_title(){
        String Title = driver.getTitle();
        Assert.assertEquals("SuiteCRM", Title);
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }

}
