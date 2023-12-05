package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartMessage = By.xpath("//span[@class='base']");
    By cronusYogaPantMessage = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By cronusYogaPantSizeActualMessage = By.xpath("//dd[contains(text(),'32')]");
    By cronusYogaPantColourActualMessage = By.xpath("//dd[contains(text(),'Black')]");
    By name = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By price = By.xpath("(//span[@class='cart-price']//span)[2]");
    By quantity = By.xpath("//input[@title='Qty']");
    By changeQuantity = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By updatePrice = By.xpath("(//span[@class='cart-price']//span)[2]");

    public String actualShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }

    public String actualCronusYogaPantMessage() {
        return getTextFromElement(cronusYogaPantMessage);
    }
    public String actualCronusYogaPantSizeActualMessage() {
       return getTextFromElement(cronusYogaPantSizeActualMessage);
    }
    public String actualCronusYogaPantColourMessage() {
        return getTextFromElement(cronusYogaPantColourActualMessage);
    }
    public String getName(){
        return getTextFromElement(name);
    }
    public int getQuantity(){
        return getNumberFromElement(quantity);
    }
    public String getPrice(){
        return getTextFromElement(price);
    }
    public void changeQuantityTo5(String quantity){
        sendTextToElement(changeQuantity,quantity);
    }
    public void updateShoppingCart(){
        clickOnElement(updateCart);
    }
    public String verifyProductPrice(){
        return getTextFromElement(updatePrice);
    }

}
