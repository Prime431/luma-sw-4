package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {
    By cronusYogaPant = By.xpath("//img[@alt='Cronus Yoga Pant ']");
    By cronusYogaPantSize32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By cronusYogaPantColourBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By cronusYogaPantAddToCart = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addedMessageForShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartInMessage = By.xpath("//a[normalize-space()='shopping cart']");


    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(cronusYogaPant);
    }

    public void mouseHoverOnCronusYogaPantAndClickOnSize32() {
        mouseHoverToElementAndClick(cronusYogaPantSize32);
    }

    public void mouseHoverOnColourBlackAndClick() {
        mouseHoverToElementAndClick(cronusYogaPantColourBlack);
    }

    public void clickOnCronusYogaPantAddToCartButton() {
        clickOnElement(cronusYogaPantAddToCart);
    }

    public String getActualText() {
        return getTextFromElement(addedMessageForShoppingCart);
    }

    public void clickOnShoppingCartInMessage() {
        clickOnElement(shoppingCartInMessage);
    }


}