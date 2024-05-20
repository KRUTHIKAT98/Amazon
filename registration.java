package amazonpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {
	
	WebDriver driver = new ChromeDriver();
	

	public void Registration() {
		  //signin click
		  WebElement signinhello=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
		        signinhello.click();
		        //regist
		        WebElement regis=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/span/span/a"));
		        regis.click();
		        WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[1]/input"));
		        name.sendKeys("Krutika");
		        WebElement mobile=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[2]/div/div/div/div[2]/input"));
		        mobile.sendKeys("7768944778");
		        WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div/input"));
		       password.sendKeys("krutika@123");
		        WebElement verify=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/input"));
		        verify.click();
	  }
	  
	  
	
	  
	  public void login(String username, String Password) {
		  
		 
		
	  //userid 
		  WebElement user= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/input[1]"));
	               // send
		  user.sendKeys(username);  
		  // continue
		  WebElement continueb= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[2]/span/span/input"));
	      // send
		  continueb.click();
		  //pass 
		  WebElement pass= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/form/div/div[1]/input"));
	      // send
	pass.sendKeys(Password);


	 driver.navigate().back();
	 driver.navigate().refresh();
	 driver.navigate().back();
	  
	  
	  }
	  
	  

	
	  
	  
	  
	  
	  
	  
	
}
