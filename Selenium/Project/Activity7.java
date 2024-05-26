import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
    }

    @Test
    public void additional_information(){
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.id("grouptab_0")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='notCurrentTab'][1]/ul[1]/li[5]")));
        driver.findElement(By.xpath("//span[@class='notCurrentTab']/ul[1]/li[5]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@title='Additional Details'][1]")));
        driver.findElement(By.xpath("//span[@title='Additional Details'][1]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']/span")));
        String phone_num = driver.findElement(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']/span")).getText();
        System.out.println(phone_num);
    }
    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }
}
