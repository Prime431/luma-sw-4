package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    By overNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    public void clickOnOverNightDuffle(){
        clickOnElement(overNightDuffle);
    }

}
