package StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefGApps {
	WebDriver driver;
	
	@Given("Given User Launch Chrome Browser")
	public void given_user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	    
	}
	@Given("User open URL {string}")
	public void user_open_url(String string) {
		driver.get("https://www.google.com/");
		
	}
	@Given("Sign in into Google")
	public void sign_in_into_google() throws InterruptedException {
		Thread.sleep(2000);
		WebElement GoogleSy=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a"));
	    GoogleSy.click();
	    
	    WebElement Email=driver.findElement(By.xpath("//input[@id='identifierId']"));
	    Email.sendKeys("saiprasadsubhashpatil@gmail.com");
	    
	    WebElement nextBt=driver.findElement(By.xpath("//span[text()='Next']"));
	    nextBt.click();
	    
	    WebElement Pass=driver.findElement(By.name("password"));
	    Actions action=new Actions(driver);
	    action.moveToElement(Pass).click().perform();
	    Pass.sendKeys("S@ip1010");
	    
	    WebElement ShowPass=driver.findElement(By.xpath("//input[@type='checkbox']"));
	    ShowPass.click();
	    
	    WebElement NextBt=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
	    NextBt.click();
	}
	@When("Click on Google apps symbole")
	public void click_on_google_apps_symbole() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame((WebElement) By.xpath("/html/body/div[1]/div[1]/style/text()"));
		WebElement GApps=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/a/svg"));
		GApps.click();
	    
	}
	@Then("Verify that all google apps are availabe in dialog box")
	public void verify_that_all_google_apps_are_availabe_in_dialog_box() throws InterruptedException {
		Thread.sleep(2000);
		WebElement GApps=driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div[5]/span"));
		GApps.isDisplayed();
	}

}
