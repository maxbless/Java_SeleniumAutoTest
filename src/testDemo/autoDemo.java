package testDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoDemo {
    public static void main(String[] args) {
        //设置chromedriver地址
        System.setProperty ( "webdriver.chrome.driver" , "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.8.0.195:9598/pms");//访问pms
        System.out.println("Page title is: " + driver.getTitle());
    }
}
