package EndToEnd;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;



public class Registration extends Constant{
	
	
	public static void main (String[] args) throws Exception, TimeoutException, NoSuchFrameException {
		
		try{	
			// ... Getting the browser ...//			
			
			FirefoxDriver driver = new FirefoxDriver();
			
					
			driver.manage().window().maximize();
			Thread.sleep(1000);
			 				
			// Getting the URL //
			driver.get("http://uk.rs-online.com/web/");
			Thread.sleep(3000);
			
			// Clicking on the registration button to register a new customer //
			driver.findElement(By.xpath(".//*[@id='pageHeader']/div[2]/div[2]/div/a[2]")).click();
			Thread.sleep(1000);
			
			// Register //
			
			// KEY IN USERNAME //
			USERNAME(driver).sendKeys(GenerateRandom.generateName("Us"));
			Thread.sleep(1000);
			
			// KEY IN PASSWORD //
			PASSWORD(driver).sendKeys(password);
			Thread.sleep(1000);
			
			// RETYPE PASSWORD //
			RE_PWORD(driver).sendKeys(password);
			Thread.sleep(1000);
				
			// SHOW PASSWORD //
			driver.findElement(By.xpath(".//*[@id='toggle-password']")).click();
			
			//Existing RS account customer?
			//We can link your new online details to your RS account. Simply add your ‘Ship to’ or ‘Sold to’ number and the first 15 characters of your company name.
		
			//Please leave blank if you do not have an RS account. //
			
			
			// SHIP TO SOLD TO OR CONTACT NUMBER //
			SOLD_NUMBER(driver).sendKeys();
			Thread.sleep(1000);
		    
		    //  COMPANY NAME //
		    COM_NAME(driver).sendKeys();
			Thread.sleep(1000);
			
			// TITLE //
			NAME_TITLE(driver).selectByVisibleText(MR);
			Thread.sleep(1000);
			
			// FIRST NAME //
			FIRST_NAME(driver).sendKeys(GenerateRandom.generateName("Fi"));
			Thread.sleep(1000);
			
			// SURNAME //
			SUR_NAME(driver).sendKeys(GenerateRandom.generateName("Su"));
			Thread.sleep(1000);
			
			// Contact telephone number (e.g 01536 123456) //
			CON_NUMBER(driver).sendKeys(GenerateRandom.generatePhoneNumber());
			Thread.sleep(1000);	
		    
			// EMAIL ADDRESS //
			EMAIL_ADD(driver).sendKeys(GenerateRandom.generatemailAddress(""));
			Thread.sleep(1000);	
			
			// JOB TITLE //
			JOB_TITLE(driver).sendKeys("IT MGR");
			Thread.sleep(1000);	
			
			// ROLE IN ORGANIZATION //
			ORG_ROLE(driver).selectByVisibleText("Other");
			Thread.sleep(1000);	

			// WHERE DID YOU HERE ABOUT US //
			ABOUT_US(driver).selectByVisibleText("Other");
			Thread.sleep(1000);	
			
			// email inclusion //
			driver.findElement(By.xpath(".//*[@id='marketingOptIn']")).click();
			
			// COMPANY NAME OR FULL NAME //
			COM_FULLNAME(driver).sendKeys(Companyname);
			Thread.sleep(1000);	
			
			// TRADING //
			TRADING(driver).sendKeys("Other");
			Thread.sleep(1000);	
			
			// ADDRESS LINE1 //
			ADDRESS_LN1(driver).sendKeys(ADDRESS1);
			Thread.sleep(1000);	
			
			// ADDRESS LINE2 //
			ADDRESS_LN2(driver).sendKeys(ADDRESS2);
			Thread.sleep(1000);	
			
			// CITY //
			CITY(driver).sendKeys(city);
			Thread.sleep(1000);	
			
			// REGION //
			REGION(driver).selectByVisibleText(region);
			Thread.sleep(1000);	
			
			// POST CODE //
			POST_CODE(driver).sendKeys(Postcode);
			Thread.sleep(1000);	
			
			// COUNTRY //
			COUNTRY(driver).sendKeys(Country);
			Thread.sleep(1000);	
			
			// ACCEPT //
			ACCEPT(driver).click();
			Thread.sleep(1000);	
			
			// REGISTER //
			 WebDriverWait waitd = new WebDriverWait(driver, 5);
             ((JavascriptExecutor) driver).executeScript("scroll(0, 1250);");
             if(REGISTER(driver).isDisplayed() && REGISTER(driver).isEnabled()) {
            	 REGISTER(driver).click();
                  Thread.sleep(3000);
             }else {
                  WebElement element2 = waitd.until(ExpectedConditions.elementToBeClickable(REGISTER(driver)));
                  element2.click();
                  Thread.sleep(3000);
             }             
             			
            ALLPROD(driver).click();
            Thread.sleep(1000);
 			
 			// BATTERIES //
 			BATTERIES(driver).click();
 			Thread.sleep(1000);
 			
 			// AUTOMOTIVE BATTERIES //
 			AUTO_BATTERIES(driver).click();
 			Thread.sleep(1000);
			
		} catch (InterruptedException | NoAlertPresentException e) {
			System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
		}
 
	
	}


}


