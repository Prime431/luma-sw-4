package com.luma.sw.testsuite;

import com.luma.sw.pages.BagsPage;
import com.luma.sw.pages.HomePage;
import com.luma.sw.pages.OverNightDufflePage;
import com.luma.sw.pages.ShoppingCartPage;
import com.luma.sw.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homepage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homepage.mouseHoverOnGearMenu();
        homepage.mouseHoverOnBagsAndClick();
        bagsPage.clickOnOverNightDuffle();
        Assert.assertEquals(overNightDufflePage.getText(),"Overnightg Duffle ");
        overNightDufflePage.changeTheQuantity("3");
        overNightDufflePage.clickOnAddToCart();
        Assert.assertEquals(overNightDufflePage.getActualText(),"You added Overnight Duffle to your shopping cart.","Text is not displayed");
        overNightDufflePage.clickOnShoppingCartLink();
        Assert.assertEquals(shoppingCartPage.getName(),"\"Overnight Duffle","Name is not displayed");
        Assert.assertEquals(shoppingCartPage.getQuantity(),3,"Quantity is not displayed");
        Assert.assertEquals(shoppingCartPage.getPrice(),"$135.00","Price is not displayed");
        shoppingCartPage.changeQuantityTo5("5");
        shoppingCartPage.updateShoppingCart();
        Assert.assertEquals(shoppingCartPage.verifyProductPrice(),"$225.00","Price is not displayed");
    }
}