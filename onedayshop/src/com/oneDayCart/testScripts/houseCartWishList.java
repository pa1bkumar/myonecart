package com.oneDayCart.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.fishMeat;

public class houseCartWishList extends Base
{
	@Test
	public void moveWish()
	{
		fishMeat fish = PageFactory.initElements(staticDriver, fishMeat.class);
		fish.fishMeat();
		HomePage hom = PageFactory.initElements(staticDriver, HomePage.class);
		hom.meatFish();
		fish.fishMeat();
		hom.meatFish();
	}

}
