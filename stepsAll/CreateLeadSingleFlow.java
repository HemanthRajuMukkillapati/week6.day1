package stepsAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSingleFlow extends BaseClass {

	@Given("click on Leads")
	public void click_on_leads() {
		// click on Leads
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("click on Create Lead")
	public void click_on_create_lead() {
		// click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("enter Company name as {string}")
	public void enter_company_name(String cpyName) {
		// createLeadForm_companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cpyName);
	}

	@Given("enter the first name as {string}")
	public void enter_first_name(String fName) {
		// createLeadForm_companyName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Given("enter the last name as {string}")
	public void enter_last_name(String lName) {
		// createLeadForm_companyName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@Given("enter source drop down value as {string}")
	public void enter_source_drop_down_value_as(String sourceDD) {
		// click in source drop-down
		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// object for Select class
		Select sourcedd = new Select(elesource);

		// select by visible text 'Employee'
		sourcedd.selectByVisibleText(sourceDD);
	}

	@When("click on submit")
	public void click_on_submit() {
		// click on Create lead
		driver.findElement(By.className("smallSubmit")).click();

	}

	@Then("verify source drop down value and print")
	public void verify_source_drop_down_value_and_print() {
		// verify source drop down value
		String verifySourcevalue = driver.findElement(By.id("viewLead_dataSources_sp")).getText();

		// print source drop down value
		System.out.println(verifySourcevalue);

	}

	@Then("get the page title and print")
	public void get_the_page_title_and_print() {
		// get the page title and print
		System.out.println(driver.getTitle());
	}

}
