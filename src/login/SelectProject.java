package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProject {
    private WebDriver driver;
    public void selectExistProject(){
        WebElement selectPrj = driver.findElement(By.cssSelector("[value=31]"));
        selectPrj.click();
    }
}
