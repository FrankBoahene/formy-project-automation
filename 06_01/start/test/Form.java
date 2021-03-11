import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/Users/frank/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("job-title")).sendKeys("Tester");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.id("select-menu")).click();

        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]")).click();

        driver.findElement(By.id("datepicker")).sendKeys("03/13/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        //driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

        driver.quit();
    }
}
