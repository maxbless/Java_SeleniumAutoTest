package testDemo;

import login.pmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class autoDemo {
    public static void main(String[] args) {
        pmsLogin login = new pmsLogin();
        login.pmsLogin();
    }
}
