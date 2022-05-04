package stepsAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DupLeadSingleFlow extends BaseClass {
	
	//getting the first lead id as gloabl variable
	
	

	@When("click on Duplicate")
	public void clickOnDuplicate() {
		// click on Duplicate
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	@Given("Dupcompany name as {string}")
	public void DupCompanyName(String UpdateCom) {

		// company name element in an variable
		WebElement compnayName = driver.findElement(By.id("createLeadForm_companyName"));

		// clear existing company name
		compnayName.clear();

		// update company name to new name
		compnayName.sendKeys(UpdateCom);
	}

	@Given("Dupfirst Name as {string}")
	public void DupFirstName(String UpdatedName) {
		// update First name variable
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));

		// clear existing first name
		firstName.clear();

		// update with a new name
		firstName.sendKeys("UpdatedName");
	}

	@Then("click on Dupsubmit button")
	public void DupsSbmitButton() {
		// click on submit button
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("compare titles")
	public void compareTitles() {
		// get page title
		String titleupdated = driver.getTitle();// get title

		// Print duplicate page title
		System.out.println("The page after creating duplicate details title:  " + titleupdated);

		// compare titles
		if (driver.getTitle().equals("View Lead | opentaps CRM")) {

			// both are equal print test pass
			System.out.println("Test Passed");
		} else {
			// else print test fail
			System.out.println("Test Failed");
		}

	}
	
	
}
