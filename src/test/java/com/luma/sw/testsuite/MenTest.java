package com.luma.sw.testsuite;

import com.luma.sw.pages.HomePage;
import com.luma.sw.pages.PantsPage;
import com.luma.sw.pages.ShoppingCartPage;
import com.luma.sw.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MenTest extends TestBase {
    HomePage homePage = new HomePage();
    PantsPage pants = new PantsPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        //Mouse Hover on Bottoms
        homePage.mouseHoverOnBottomsMenu();
        homePage.mouseHoverOnPantsAndClick();
        pants.mouseHoverOnCronusYogaPantAndClickOnSize32();
        pants.mouseHoverOnColourBlackAndClick();
        pants.clickOnCronusYogaPantAddToCartButton();
        Thread.sleep(2000);
        Assert.assertEquals(pants.getActualText(), "You added Cronus Yoga Pant to your shopping cart.", "Text is not displayed");
        pants.clickOnShoppingCartInMessage();
        Assert.assertEquals(shoppingCart.actualShoppingCartMessage(), "Shopping Cart", "Error message");
        Assert.assertEquals(shoppingCart.actualCronusYogaPantMessage(), "Cronus Yoga Pant", "Error message");
        Assert.assertEquals(shoppingCart.actualCronusYogaPantSizeActualMessage(), 32, "Size is not Displayed");
        Assert.assertEquals(shoppingCart.actualCronusYogaPantColourMessage(), "Black", "Colour is not displayed");
    }
}
