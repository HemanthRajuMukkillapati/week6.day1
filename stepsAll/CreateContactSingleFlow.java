package stepsAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactSingleFlow extends BaseClass  {
	
	
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
	
	@Given("Load url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

	@Given("Enter username as {string}")
	public void enterUsername(String Uname) {
		driver.findElement(By.id("username")).sendKeys(Uname);
	}

	@Given("Enter Password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on the Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
	@Given("click on the  CRMCSF link")
	public void click_on_cRMCSFlink() {
		//click on CRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@Given("Click on contacts")
	public void clickContacts() {
		//click on contacts
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}
	
	@Given("click on create contact")
	public void clickCreate_contact1() {
		//click on contacts
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
	}

	@Given("enter first name as {string}")
	public void enterFirst_name(String fstName ) {
		//enter first name
				driver.findElement(By.id("firstNameField")).sendKeys(fstName);
	}

	@Given("enter last name as {string}")
	public void enterLast_name(String lstName ) {
		//enter last name
				driver.findElement(By.id("lastNameField")).sendKeys(lstName);
	}
	
	
	@Given("enter first name local as {string}")
	public void enterFirstname_local(String fstLName) {
		//enter first name local
				driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys(fstLName);
	}

	@Given("enter lastname local as {string}")
	public void enterLastname_local(String lstLName ) {
		//enter lastname local
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys(lstLName);
	}

	@Given("enter department name as {string}")
	public void enterDept_name(String deptName ) {
		//enter department name
				driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys(deptName);
	
	}

	@Given("enter contact desc as {string}")
	public void enterContact_desc(String ctDesc) {
		//enter contact desc
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys(ctDesc);
	}

	@Given("enter prim email as {string}")
	public void enterPrim_email(String pEmail ) {
		//enter prim email
				driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"))
						.sendKeys(pEmail);
	}

	@Given("Select State Province as {string}")
	public void selectState_province(String sProv ) {
		//create a variable for web element for stateProvince
				WebElement stateprovdd = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
				//create a object for select class
				Select stPvDd = new Select(stateprovdd);
				//select newyork
				stPvDd.selectByVisibleText(sProv);
	}

	@When("click create contact")
	public void clickCreate_contact() {
		//click create contact
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
	}

	@Then("View contacts page is displayed")
	public void view_con_page_is_displayed() {
		//get the title of page
				String titleOfPage = driver.getTitle();
				//print the page
				System.out.println("the Title of the page is:  " + titleOfPage);
	}
	
}
