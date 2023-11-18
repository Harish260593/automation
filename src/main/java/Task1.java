import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static  void main(String []args) throws InterruptedException {
        String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(1000);
        String text = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        System.out.println(text);

           System.out.println("Open Browser");
    }
    }

