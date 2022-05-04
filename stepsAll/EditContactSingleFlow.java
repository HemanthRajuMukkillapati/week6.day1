package stepsAll;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditContactSingleFlow extends BaseClass {

	@When("Click on edit button")
	public void click_on_edit_button() {
		// Click on edit button
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Clear the Description Field")
	public void clear_the_description_field() {
		// Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
	}

	@Given("Fill ImportantNote Field with Any text")
	public void fill_important_note_field_with_any_text() {
		// Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Important Note Details");
	}

	@When("Click on update button")
	public void click_on_update_button() {
		// Click on update button
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("Get the Title of Resulting Page and compare")
	public void get_the_title_of_resulting_page_and_compare() {
		// Get the Title of Resulting Page
		String title = driver.getTitle();

		// print the page
		System.out.println(title);

		// compare titles
		if (driver.getTitle().equals("View Lead | opentaps CRM")) {
			// print test passed if titles are same
			System.out.println("Test Passed");
		} else {
			// else print test failed
			System.out.println("Test Failed");
		}

	}

}
