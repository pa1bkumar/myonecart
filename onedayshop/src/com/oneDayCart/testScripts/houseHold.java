package com.oneDayCart.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HouseHold;

public class houseHold extends Base
{
   @Test
   public void household()
   {
	   HouseHold house = PageFactory.initElements(driver, HouseHold.class);
	   house.Shoe();
	   Reporter.log("shoes is added to cart",true);
   }
	
}
