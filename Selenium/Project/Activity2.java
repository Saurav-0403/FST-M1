import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
    }

    @Test
    public void url_of_header_image(){
        WebElement img_ele = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        String link_img = img_ele.getAttribute("src");
        System.out.println(link_img);
        Assert.assertEquals("https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g",link_img);
    }
    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }

}
