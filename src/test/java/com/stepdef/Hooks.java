package com.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal {

	@Before
	public void before(Scenario sc) {
		System.out.println("Before");
		System.out.println(sc.getName());
		getDriver();
	}

	@After
	public void after(Scenario sc) {
		System.out.println("After");
		if (sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, "failed/png");
		}
		closeBrowser();
	}
}
