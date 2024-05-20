package amazonpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class log {
	
	static WebDriver driver;//chromedriver
	
	
	log(WebDriver driver){
		
		this.driver= driver;
	}
	
	
	  public void check_title() {
	     String expected_title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" ; 
		String actual_title = driver.getTitle();
	  System.out.println(actual_title);
	  if(expected_title.equals(actual_title)) {
	  
	System.out.println("title matched");
	  
	  }
	  else {
		  System.out.println("title doesnt match");
	  }
	  } 
	 
	  public void langcheck() {
		  
		 //Actions act=new Actions(driver);
		  WebElement langbutton=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]/span/span[2]/span[2]"));
		  langbutton.click();
		  //  act.moveToElement(langbutton);
		  WebElement hindibutton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/div[1]/div[3]/div/label/i"));
	                  hindibutton.click();
	  
	      String exp_p=   "हम आपकी ब्राउज़िंग, खरीदारी और कम्युनिकेशन के लिए सबसे ज़रूरी जानकारी का अनुवाद करेंगे. हमारे अनुवाद आपकी सहूलियत के लिए प्रदान किए जाते हैं. हमारी उपयोग की शर्तों सहित "  ;       
	        WebElement check_p=driver.findElement(By.xpath("//*[@id=\"icp-language-translation-text\"]"));
	      String check=check_p.getCssValue(exp_p) ;
	      System.out.println("lang identified");
	     driver.navigate().back();
	                  
	  }
	 
	  

	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		log classs=new log(driver);
		 
		  driver.get("https://www.amazon.in/");
		  classs.check_title();
		  classs.langcheck();
		  
		  registration r=new registration();//object
		  // 
		  r.Registration();
		  
		  
		  String [][] datapro=new String[2][2];//declare
		String  username=datapro[0][0];
			datapro[0][0]="ritu";
		String	Password=datapro[0][1];
			datapro[0][1]="rity123";
			 username=datapro[1][0];
			datapro[1][0]="jhani";
			Password=datapro[1][1];
			datapro[1][1]="jhanvixoxo";
		  r. login( username,Password);
		  
		  
		  
		  product pro=new product();
		  pro.select_product();
		  
	}

}
