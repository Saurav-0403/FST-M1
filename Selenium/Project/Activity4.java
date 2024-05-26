import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
    }

    @Test
    public void Login(){
       driver.findElement(By.id("user_name")).sendKeys("admin");
       driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
       driver.findElement(By.name("Login")).click();
       String URL = driver.getCurrentUrl();
       System.out.println(URL);
       Assert.assertEquals("https://alchemy.hguy.co/crm/index.php?module=Home&action=index", URL);
    }
    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }
}
