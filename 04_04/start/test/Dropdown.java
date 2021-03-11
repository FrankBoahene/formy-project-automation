import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/Users/frank/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
        /*
        WebElement datepickerItem = driver.findElement(By.xpath("/html/body/div/div/div/a[4]"));
        datepickerItem.click();
        */

        driver.quit();

    }
}
