package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaukariLocators {
	
	public WebDriver driver;
	public NaukariLocators(WebDriver driver) {
		this.driver=driver;
	}
	
	private By login= By.xpath("//div[text()='Login']");
	//public WebElement loginlayer= driver.findElement(By.xpath("//div[@class='login-layer']"));
	private By username=By.xpath("//input[contains(@placeholder,'Username')]");
	private By password=By.xpath("//input[contains(@placeholder,'password')]");
	private By loginButton=By.xpath("//button[text()='Login']");
	private By laterButton=By.id("block");
	private By chtaBotCrossBar= By.xpath("//*[@id='_b2qrz85svNavbar']/div");
	private By updateProfile=By.xpath("//*[text()='UPDATE PROFILE']");
	private By deleteResume=By.xpath("//*[text()='DELETE RESUME']");
	private By deleteButton=By.xpath("(//button[text()='DELETE'])[1]");
	private By updateButton=By.id("attachCV");
	private By resumeUploadSuccessMeaage=By.xpath("//*[contains(text(),'successfully uploaded')]");
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	/*public WebElement getLoginLayer() {
		 return driver.findElement(loginlayer);
	}*/
	public WebElement getUserName() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	public List<WebElement> getLaterButton() {
		return driver.findElements(laterButton);
	}
	public List<WebElement> getchatBotcrossButton() {
		return driver.findElements(chtaBotCrossBar);
	}
	public WebElement getUpadteprofileButton() {
		return driver.findElement(updateProfile);
	}
	public WebElement getDeleteResume() {
		return driver.findElement(deleteResume);
	}
	public WebElement getDeleteButton() {
		return driver.findElement(deleteButton);
	}
	public WebElement getUpdateResumeButton() {
		return driver.findElement(updateButton);
	}
	public WebElement resUpSusMeg() {
		return driver.findElement(resumeUploadSuccessMeaage);
	}
}
