package com.stepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pojo.FacebookPagePojo;
import com.utils.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookPageSteps extends LibGlobal {

	@Given("User launch the browser")
	public void user_launch_the_browser() {
	}

	@Given("User enters the url")
	public void user_enters_the_url() {
		getUrl("https://www.facebook.com/");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password(DataTable table) throws IOException {
		FacebookPagePojo f = new FacebookPagePojo();
		// 2D with Header
		List<Map<String, String>> mp = table.asMaps();
		System.out.println(mp.get(0).get("UserName"));
		System.out.println(mp.get(2).get("Password"));
		insertType(f.getTxtUserName(), mp.get(0).get("UserName"));
		insertType(f.getTxtPass(), mp.get(2).get("Password"));
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		FacebookPagePojo f = new FacebookPagePojo();
		click(f.getBtnLogIn());
	}

	@Then("User navigates to login failure page")
	public void user_navigates_to_login_failure_page() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue("Not navigated to login failure page", getCurrentUrl().contains("login"));
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_something_and_something(String username, String password) throws Throwable {
		FacebookPagePojo f = new FacebookPagePojo();

		insertType(f.getTxtUserName(), username);
		insertType(f.getTxtPass(), password);
	}

}
