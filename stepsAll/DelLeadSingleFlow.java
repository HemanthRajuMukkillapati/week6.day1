package stepsAll;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DelLeadSingleFlow extends BaseClass {
	
	public String firstLeadID;
	
	@Given("click on find leads button")
	public void clickOnFindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
	}

	@Given("clear on phone")
	public void clear_on_phone() {
		// click on phone
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();

		// clear the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).clear();
	}

	@Given("clear country code")
	public void clear_country_code() {
		// clear country code
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();

	}

	@Given("click on find button")
	public void click_on_find_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
	}

	@Given("Get and Print First Lead")
	public void get_and_print_first_lead() {
		// get the first lead id in a variable
		firstLeadID = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a")).getText();

		// print the first Lead
		System.out.println("The First Lead ID is : " + firstLeadID);
	}

	@When("View and click on delete")
	public void click_on_delete() throws InterruptedException {
		// click on view Lead
		driver.findElement(By.xpath("//table//div[contains(@class,'Id')]/a[contains(@href,'viewLead')]")).click();
		Thread.sleep(3000);
		// click on delete
		driver.findElement(By.xpath("//div/a[text()='Delete']")).click();
		Thread.sleep(3000);
	}

	@Given("enter first lead id")
	public void enter_first_lead_id() {
		// enter first lead id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLeadID);
	}

	@Then("get no of records and compare")
	public void get_no_of_records_and_compare() throws InterruptedException {
		// sleep to avoid stale
		Thread.sleep(2000);

		// get the text of no records
		String noRecord = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();

		// print the displayed text
		System.out.println(noRecord);

		// compare it with expected text
		if (noRecord.equals("No records to display")) {
			// print test pass if comparison is true
			System.out.println("Test is passed");

		} else {
			// print test failed if comparison is false
			System.out.println("Test is failed");
		}
		
	
		
	}

}
