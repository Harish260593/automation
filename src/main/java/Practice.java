import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{
    public static void main (String [] args)
    {
        String baseurl = "https://demo.guru99.com/test/facebook.html";

        WebDriver driver = new ChromeDriver();

        driver.get(baseurl);
        // Find By Id Example
       driver.findElement(By.id("email")).sendKeys("test");
       driver.findElement(By.id("pass")).sendKeys("P@ssw0rd");
      driver.findElement(By.id("u_0_b")).click();

     //find by name
      //  driver.findElement(By.id("email")).sendKeys("testing");
      // driver.findElement(By.id("pass")).sendKeys("P@ssw0rd123");

        // driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("Open the browser");
        // Task
        //Odd/Even program
        // Operator Concept

        // What is Maven
        // Why maven is used
        // What is build tool.
        //Can we run selinium without maven - Yes
        // Inheritance, Class, Object

    }
}