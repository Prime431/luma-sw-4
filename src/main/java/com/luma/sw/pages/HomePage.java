package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By men = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(men);
    }

    public void mouseHoverOnBottomsMenu() {
        mouseHoverToElement(bottoms);
    }

    public void mouseHoverOnPantsAndClick() {
        mouseHoverToElementAndClick(pants);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverOnBagsAndClick() {
        mouseHoverToElementAndClick(bags);
    }

}
