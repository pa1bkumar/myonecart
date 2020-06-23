package com.oneDayCart.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.fishMeat;

public class fishnMeat extends Base
{
	@Test
	public void fishnmeat()
	{
	 fishMeat fismea = PageFactory.initElements(staticDriver, fishMeat.class);
	 fismea.fishMeat();
	 Reporter.log("fish and meat is added to cart");
	}

}
