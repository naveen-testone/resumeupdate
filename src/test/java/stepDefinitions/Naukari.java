package stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.NaukariLocators;
import resources.Base;

@RunWith(Cucumber.class)


public class Naukari extends Base{
	
	public WebDriver driver;

	 @Given("^Initilize the browser with chrome$")
	    public void initilize_the_browser_with_chrome()  {
	      driver=intilizeDriver();
	    }
	  @And("^User is on Naukari landing page \"([^\"]*)\"$")
	    public void user_is_on_naukari_landing_page_something(String url) throws Exception  {
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		  driver.get(url);
		  /*
		  Robot robot= new Robot();
		  Thread.sleep(5000);
		  robot.keyPress(KeyEvent.VK_ALT);
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_TAB);
		  //robot.keyRelease(KeyEvent.VK_TAB);
		  robot.keyPress(KeyEvent.VK_TAB);
		  //robot.keyRelease(KeyEvent.VK_TAB);
		  robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_ALT);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(5000);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		 //Thread.sleep(5000);
		  driver.manage().window().maximize();
		  */
		  NaukariLocators nl=new NaukariLocators(driver);
		 if(nl.getLaterButton().getText().equalsIgnoreCase("Later")) {
			  nl.getLaterButton().click();
		  }
		  else {
			  
		  }
	
	    }

	    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String username, String password)  {
	    	NaukariLocators nl=new NaukariLocators(driver);
	    	//nl.getLaterButton().click();
	    	System.out.println(username);
	    	System.out.println(password);
	    	nl.getLogin().click();
	    	driver.manage().window().maximize();
	    	nl.getUserName().sendKeys(username);
	    	nl.getPassword().sendKeys(password);
	    	nl.getLoginButton().click();;
	    	
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated()  {
	    	
	    	NaukariLocators nl=new NaukariLocators(driver);
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	if(nl.getchatBotcrossButton().size()!=0) {
	    	nl.getchatBotcrossButton().get(1).click();
	    	}
	    	else
	    	{
	    		
	    	}
	 
	    }

	    @And("^click on Update profile$")
	    public void click_on_update_profile()  {
	    	NaukariLocators nl=new NaukariLocators(driver);
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	nl.getUpadteprofileButton().click();
	    }

	    @And("^click on Delete resume$")
	    public void click_on_delete_resume()  {
	    	NaukariLocators nl=new NaukariLocators(driver);
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	nl.getDeleteResume().click();
	    	nl.getDeleteButton().click();
	    }
	    
	    @And("^click on Upload resume$")
	    public void click_on_upload_resume() throws Exception {
	    	NaukariLocators nl=new NaukariLocators(driver);
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	//WebDriverWait wait = new WebDriverWait(driver,30);
	    	//nl.getUpdateResumeButton().click();
	    	//driver.findElement(By.id("attachCV")).click();
	    	Actions a= new Actions(driver);
	    	a.moveToElement(nl.getUpdateResumeButton()).click().perform();
	    	Thread.sleep(5000);
	    	Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\fileupload.exe");
	    }

	    @And("^Check for success message$")
	    public void check_for_success_message()  {
	    	NaukariLocators nl=new NaukariLocators(driver);
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	System.out.println(nl.resUpSusMeg().getText());
	    }

	    @And("^click on logout$")
	    public void click_on_logout()  {
	       driver.quit();
	    }

}
