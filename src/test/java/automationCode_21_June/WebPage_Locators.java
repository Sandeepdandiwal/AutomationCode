package automationCode_21_June;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage_Locators {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https:rediff.com");
     driver.findElement(By.className("signin"));
     driver.findElement(By.linkText("Sign in")); //Linktext -- exact text on webpage
     driver.findElement(By.partialLinkText("Sign i")); //Partial Link text -- take partial text from link text
     driver.findElement(By.id("login1")).sendKeys("sandeepdandiwal6@gmail.com"); // sendkeys to enter values in text
     driver.findElement(By.name("passwd")).sendKeys("Sandeep@123");
     driver.findElement(By.className("signinbtn")).click();
     
    WebElement profileName = driver.findElement(By.linkText("SeleniumPanda"));
    
    if (profileName.isDisplayed())	
    {
      driver.findElement(By.className("rd_logout")).click();
    }
    else
    {
    	System.out.println("My proflie is not existing");
    }
    	
    String acutualSuccessMessage = driver.findElement(By.xpath("//p[text()='You have successfully signed out of Rediffmail.']")).getText();
    String expectedSuccessMessage = "You have successfully signed out of Rediffmail.";
     
    if (acutualSuccessMessage.contains(expectedSuccessMessage))
    {
    	System.out.println("Logout successfully");
    }
    else
    {
    	System.out.println("Failed Logout");
    }
     driver.quit();
     
	}

}
