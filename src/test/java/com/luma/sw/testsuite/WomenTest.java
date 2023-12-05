package com.luma.sw.testsuite;

import com.luma.sw.pages.JacketsPage;
import com.luma.sw.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {

    JacketsPage jackets = new JacketsPage();


    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        jackets.mouseHoverOnWomenMenu();
        Thread.sleep(5000);
        jackets.mouseHoverOnTop();
        Thread.sleep(5000);
        jackets.clickOnJackets();
        jackets.selectProductNameFilter("Product Name");
        Assert.assertEquals(jackets.getProductList1(), jackets.getProductList2());
    }
    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        jackets.mouseHoverOnWomenMenu();
        jackets.mouseHoverOnTop();
        Thread.sleep(5000);
        jackets.clickOnJackets();
        jackets.selectProductNameFilter("Price");
        Assert.assertEquals(jackets.getPriceList1(), jackets.getPriceList2());

    }

}
