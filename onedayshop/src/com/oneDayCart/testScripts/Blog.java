package com.oneDayCart.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;

public class Blog extends Base
{
	@Test
	public void blog()
	{
		HomePage blg = PageFactory.initElements(driver, HomePage.class);
		blg.blog();
		Reporter.log("Blog page is opened",true);
	}

}
