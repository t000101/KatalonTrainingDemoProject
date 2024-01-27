import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println("I am inside Given")
		WebUI.openBrowser('')		
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {
		println("I am inside When")
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_password'), password)
	}
	
	@And("clicks on login button")
	public void click_on_login_button() {
		println("I am inside And")
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
	} 

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_home_page() {
		println("I am inside Then")
		WebUI.verifyTextPresent('Dashboard', false)
		WebUI.closeBrowser()
	}
}