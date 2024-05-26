import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity8 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
    }

    @Test
    public void contents_of_the_accounts_table(){
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.id("grouptab_0")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='notCurrentTab']/ul[1]/li[2]")));
        driver.findElement(By.xpath("//span[@class='notCurrentTab']/ul[1]/li[2]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='list view table-responsive']/tbody/tr")));
        String var_xapth = "//table[@class='list view table-responsive']/tbody/";
        for (int i =1; i<=9; i+=2){
            String name = driver.findElement(By.xpath(var_xapth + "tr["+i+"]/td[3]/b")).getText();
            System.out.println(name);
        }

    }
    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }
}
