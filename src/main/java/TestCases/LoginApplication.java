package TestCases;/* Mahadev
   01-02-2022
   Login 
  */

import com.objectrepository.RediffLoginPage;
import com.objectrepository.RediffLoginPagePF;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication
{
    @Test
    public void Login()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPagePF rd = new RediffLoginPagePF(driver);
        rd.EmailId().sendKeys("hello");
        rd.Password().sendKeys("hhhhhhhhhhh");
        rd.Submit().click();
    }

}
