package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//登录PMS
public class pmsLogin {
    private WebDriver driver;
    private WebDriver.Navigation navigation;
    private String pmsUrl="http://10.8.0.195:9598/pms/";
   public void pmsLogin(){
       //设置浏览器地址
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        navigation = driver.navigate();

        //加载到指定URL
       navigation.to(pmsUrl);

       //获取输入框的id，并在输入框中输入用户名
       WebElement userNameInput = driver.findElement(By.id("username"));
       userNameInput.sendKeys("021181");

       //获取输入框的id，并在输入框中输入密码
       WebElement pwdInput = driver.findElement(By.id("password"));
       pwdInput.sendKeys("123456");

       //获取登录按钮的className,并点击
       WebElement loginBtn = driver.findElement(By.className("button"));
       loginBtn.click();
   }
}
