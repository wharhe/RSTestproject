package EndToEnd;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Constant {
	public static final String Username = "emmatest";
	public static final String password = "P@5555w0rd";
	public static final String Retypepassword = "P@5555w0rd";
	public static final String MR = "Mr.";
	public static final String FirstName = "RS";
	public static final String SurName = "Component";
	public static final String ContactNumber = "01536 123456";
	public static final String Companyname = "ITCO";
	public static final String ADDRESS1 = "40";
	public static final String ADDRESS2 = "newcome STREET";
	public static final String city = "Portsmouths";
	public static final String region = "Hampshire";
	public static final String Postcode = "Po1 5ds";
	public static final String Country = "United Kingdom";
	public static final String Allproduct = "product";
	public static final String Autoprod = "autobatteries";
	public static final String Battery = "batteries";
	private static WebElement element = null;
	private static Select select = null;
	
    public static final String URL = "http://uk.rs-online.com/web/";
	
	public static final String USERNAME = ".//*[@id='credential.username']";
	public static WebElement USERNAME (WebDriver driver){
		element = driver.findElement(By.xpath(USERNAME));
		return element;
	}
	public static final String PASSWORD = ".//*[@id='password']";
	public static WebElement PASSWORD (WebDriver driver){
			element = driver.findElement(By.xpath(PASSWORD));
			return element;
	}
			
	public static final String RE_PWORD = ".//*[@id='confirmPassword']";
	public static WebElement RE_PWORD (WebDriver driver){
			element = driver.findElement(By.xpath(RE_PWORD));
			return element;
	}
	
	// sold in sold out or contact number //
	public static final String SOLD_NUMBER = ".//*[@id='accountNumber']";
	public static final WebElement SOLD_NUMBER (WebDriver driver){
			element = driver.findElement(By.xpath(SOLD_NUMBER));
			return element;
	}	
	
	public static final String COM_NAME = ".//*[@id='accountValidation']";
	public static final WebElement COM_NAME (WebDriver driver){
			element = driver.findElement(By.xpath(COM_NAME));
			return element;
	}
			
	// NAME TITLE //
	public static Select NAME_TITLE(WebDriver driver){
		select = new Select (driver.findElement(By.xpath(".//*[@id='name.title']")));
		return select;
	}
	
	
		
	// FIRST NAME //
	public static final String FIRST_NAME = ".//*[@id='name.firstName']";
	public static final WebElement FIRST_NAME (WebDriver driver){
			element = driver.findElement(By.xpath(FIRST_NAME));
			return element;
		}
	
	// SURNAME //
		public static final String SUR_NAME = ".//*[@id='name.surname']";
		public static final WebElement SUR_NAME (WebDriver driver){
				element = driver.findElement(By.xpath(SUR_NAME));
				return element;
		}
	
		// Contact telephone number (e.g 01536 123456) //
		public static final String CON_NUMBER = ".//*[@id='telephone']";
		public static final WebElement CON_NUMBER (WebDriver driver){
				element = driver.findElement(By.xpath(CON_NUMBER));
				return element;
		}
				
		
		// EMMAIL ADDRES //
		public static final String EMAIL_ADD = ".//*[@id='email']";
		public static final WebElement EMAIL_ADD (WebDriver driver){
				element = driver.findElement(By.xpath(EMAIL_ADD));
				return element;
		}
		
		// JOB TITLE //
		public static final String JOB_TITLE = ".//*[@id='jobTitle']";
		public static final WebElement JOB_TITLE (WebDriver driver){
				element = driver.findElement(By.xpath(JOB_TITLE));
				return element;
		}
		
		// ROLE IN ORGANIZATION //
		public static Select ORG_ROLE(WebDriver driver){
			select = new Select (driver.findElement(By.xpath(".//*[@id='jobFunction']")));
			return select;
		}
		
		// WHERE DID YOU HEAR ABOUT US ? //
		public static Select ABOUT_US(WebDriver driver){
			select = new Select (driver.findElement(By.xpath(".//*[@id='hearAbout']")));
			return select;
		}
		
		// COMPANY NAME OR FULL NAME //
		public static final String COM_FULLNAME = ".//*[@id='company.name']";
		public static final WebElement COM_FULLNAME (WebDriver driver){
				element = driver.findElement(By.xpath(COM_FULLNAME));
				return element;
		}
		
		// TRADING IF APPLICABLE //
		public static final String TRADING = ".//*[@id='company.name2']";
		public static final WebElement TRADING (WebDriver driver){
				element = driver.findElement(By.xpath(TRADING));
				return element;
		}
		
		// ADDRESS LINE1 //
		public static final String ADDRESS_LN1 = ".//*[@id='address.contactAddress1']";
		public static final WebElement ADDRESS_LN1 (WebDriver driver){
				element = driver.findElement(By.xpath(ADDRESS_LN1));
				return element;
		}
		
		// ADDRESS LINE2 //
		public static final String ADDRESS_LN2 = ".//*[@id='address.contactAddress2']";
		public static final WebElement ADDRESS_LN2 (WebDriver driver){
				element = driver.findElement(By.xpath(ADDRESS_LN2));
				return element;
		}
		
		// CITY //
		public static final String CITY = ".//*[@id='address.contactAddress3']";
		public static final WebElement CITY (WebDriver driver){
				element = driver.findElement(By.xpath(CITY));
				return element;
		}
		
		// REGION //
		public static Select REGION(WebDriver driver){
			select = new Select (driver.findElement(By.xpath(".//*[@id='address.contactAddress4']")));
			return select;
		}
		
		
		
		// POST CODE //
		public static final String POST_CODE = ".//*[@id='address.contactPostcode']";
		public static final WebElement POST_CODE (WebDriver driver){
				element = driver.findElement(By.xpath(POST_CODE));
				return element;
		}
		
		// COUNTRY //
		public static final String COUNTRY = ".//*[@id='marketing-info']/div[8]/span[2]/label";
		public static final WebElement COUNTRY (WebDriver driver){
				element = driver.findElement(By.xpath(COUNTRY));
				return element;
		}
		
		// CLICK //
		public static final String ACCEPT = ".//*[@id='marketingOptIn']";
		public static final WebElement ACCEPT (WebDriver driver){
				element = driver.findElement(By.xpath(ACCEPT));
				return element;
		}
		
		
		
		//   REGISTER OR SUBMIT BUTTON //
		public static final String REGISTER = ".//*[@id='register-button']";
		public static final WebElement REGISTER (WebDriver driver){
				element = driver.findElement(By.xpath(REGISTER));
				return element;
	}

		// ALL PRODUCT //
		public static final String ALLPROD ="menu product-menu";
		public static final WebElement ALLPROD (WebDriver driver){
				element = driver.findElement(By.xpath(ALLPROD));
				return element;
	}

       // BATTERIES //
		public static final String BATTERIES = "html/body/div[4]/div/ul/li[1]/ul/li[2]/a";
		public static final WebElement BATTERIES (WebDriver driver){
				element = driver.findElement(By.xpath(BATTERIES));
				return element;
	}
      

      // AUTOMOTIVE BATTERIES //
		public static final String AUTO_BATTERIES = "html/body/div[4]/div/ul/li[1]/ul/li[2]/div/ul[1]/li[1]/a";
		public static final WebElement AUTO_BATTERIES (WebDriver driver){
				element = driver.findElement(By.xpath(AUTO_BATTERIES));
				return element;
	}
}







