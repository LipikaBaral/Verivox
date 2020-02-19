package stepDefinitions;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;



public class DSLVergleich {
	
	public WebDriver driver;
	public FileInputStream fis;
	public JavascriptExecutor js;

	@Before
	public void setUp() {
		
        Properties prop = new Properties();
		
		try {
			fis = new FileInputStream("/Users/Lipika/Desktop/Selenium/Work/"
					+ "VerivoxTestAutomationTask/src/main/java/Config/config.properties");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (browserName.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		
	}
	
	@After
	public void tearDown() {
		driver.quit();	
	}
	
	
	@Given("^User is on Verivox main page$")
	public void user_on_Verivox_main_page() {
		
		String mainpageTitle = driver.getTitle();
        assertEquals(mainpageTitle, "VERIVOX | Tarife vergleichen & stressfrei sparen!","Title doesn't match!!");
		       
	}

	@When("^he is on DSL vergleich$")
	public void he_is_on_DSL_vergleich() {

	    Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@class='page-navigation-text i-a-angle-right'][contains(text(),'DSL')]"))).build().perform();;
		driver.findElement(By.xpath("//a[@class='page-navigation-link'][contains(text(),'DSL-Vergleich')]")).click();
		
		String DSLpageTitle = driver.getTitle();
        assertEquals(DSLpageTitle, "DSL vergleichen & sparen - Amazon Fire Tablet gratis | VERIVOX","Title doesn't match!!");
		
		
	}

	@When("^he enters \"(.*)\" and \"(.*)\" and clicks on JETZT VERGLEICHEN$")
	public void he_enters_Ihre_Vorwahl_and_bandwidth(String vorwahl,int bandwidth) {
		
		driver.findElement(By.name("Prefix")).sendKeys(vorwahl);
	    
        WebElement element = driver.findElement(By.xpath("//input[@value='16000']"));		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		driver.findElement(By.xpath("//button[contains(text(),'Jetzt vergleichen')]")).click();
		
	}


	@Then("^he is able to see all the available tariffs in the Tariffs page$")
	public void view_available_tariffs_Tariffs_page() {
		
		String tarifpage = driver.getTitle();
		assertEquals(tarifpage, "DSL-Preisvergleich aller DSL-Anbieter in Deutschland","Title doesn't match!!");
		
		WebElement element = driver.findElement(By.xpath("//h1[@class='mt-3 text-center text-xl-left']"));
		
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		boolean b = element.isDisplayed();
		assertTrue(b);
	
		
	}
	
	@Given("^User is on the DSL Result List page$")
	public void user_is_on_the_DSL_Result_List_page() {
		
		String tarifpage = driver.getTitle();
		assertEquals(tarifpage, "DSL-Preisvergleich aller DSL-Anbieter in Deutschland","Title doesn't match!!");		
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");		
		
	}

	@When("^he selects one of the listed Tariffs and clicks on mehr zum Tarif button$")
	public void selects_one_of_the_listed_Tariffs() {
		
		driver.findElement(By.xpath("(//a[contains(text(),'Zum Angebot')])[4]")).click();
		
	}

	@Then("^he should be able see the details of the selected Tariff$")
	public void see_the_details_of_the_selected_Tariff() {
			
		driver.findElement(By.xpath("//div[@class='img-centerer']")).isDisplayed();
	    
	}

	@Then("^he should also see a button labeled as In five Minuten online wechseln$")
	public void In_Five_Minuten_online_wechseln() {
		
		new WebDriverWait(driver, 30).
		until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='responsive-label-txt offer-page-cta'])[1]")));
		boolean wechselnLink = driver.findElement(By.xpath("(//a[@class='responsive-label-txt offer-page-cta'])[1]")).isDisplayed();
		assertTrue(wechselnLink);		
	    
	}
	
	@Given("^User is on the DSL Result List$")
	public void user_is_on_the_DSL_Result_List() {
		
		String tarifpage = driver.getTitle();
		assertEquals(tarifpage, "DSL-Preisvergleich aller DSL-Anbieter in Deutschland","Title doesn't match!!");	
		
	
		
	    
	}

	@When("^there are more than twenty tariffs available$")
	public void user_should_click_on_the_tariff_link() {
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		List<WebElement> list = driver.findElements(By.xpath("(//a[contains(text(),'Zum Angebot')])"));
		if(list.size()>=20)
			System.out.println("DSL Result List contains more than 20 tariffs");
	}

	@When("^user clicks on this button$")
	public void user_clicks_on_this_button() {
		

			
		while(driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).isDisplayed()) {
			driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).click();
			js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
	}

	@Then("^the list should be appended with next twenty tariffs and so on until all Tariffs are loaded$")
	public void click_until_all_Tariffs_are_loaded() throws Exception {
		

		if(driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).isDisplayed()) {
	
			
		  driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).click();
		  
		   js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		   Thread.sleep(3000);
		   
		   if(driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).isDisplayed()) {
				driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).click();
	   }
		}
		else {
		
			js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			
			if(driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).isDisplayed()) {
			driver.findElement(By.xpath("//button[contains(text(),'weitere tarife laden')]")).click();
			}
		}
			
	   
	}




}
