import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
    }

    @Test
    public void copyright_text(){
        String text = driver.findElement(By.id("admin_options")).getText();
        System.out.println(text);
        Assert.assertEquals("© Supercharged by SuiteCRM",text);
    }
    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }
}
