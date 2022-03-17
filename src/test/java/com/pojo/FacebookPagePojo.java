package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;
import com.utils.LibGlobal;

public class FacebookPagePojo extends LibGlobal {

	public FacebookPagePojo() {
		PageFactory.initElements(Hooks.driver, this);
	}
	// Pojo-->Plain old java object
	// 1.Declare all values in private
	// 2.Generate getters

	@FindBys({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@data-testid='royal_email']") })
	private WebElement txtUserName;

	@FindAll({ @FindBy(xpath = "//input[@id='pass11']"), @FindBy(xpath = "//input[@data-testid='royal_pass456789']") })
	private WebElement txtPass;

	@FindBy(name = "login")
	private WebElement btnLogIn;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

}
