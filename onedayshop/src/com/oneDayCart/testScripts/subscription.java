package com.oneDayCart.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Myaccount;

public class subscription extends Base
{
	@Test
	public void subButton()
	{
		Myaccount mynew = PageFactory.initElements(driver, Myaccount.class);
		mynew.subButton();
	}
	

}
