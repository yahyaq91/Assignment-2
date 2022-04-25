package test_app.smoke.transactions;

import app.pom.Catalog;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class AddingItemsToCart extends TestBasePage {
    @Test
    public void testIncreasingQuantityWithIcon(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.clickPlusIcon();
        catalog.selectSize(0);
        catalog.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(catalog.addedToCartConfirmation));
    }
    @Test
    public void testIncreasingQuantityWithInputtingQuantity(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.setProductQuantity(2);
        catalog.selectSize(0);
        catalog.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(catalog.addedToCartConfirmation));
    }
    @Test
    public void testSelectingColorOption(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.selectBlueOption();
        catalog.selectSize(0);
        catalog.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(catalog.addedToCartConfirmation));
    }
    @Test
    public void testFilteringByColor(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectBlackOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByStyle(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.checkCasualOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testSearchWithSearchBar(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.searchBar("dresses");
        catalog.clickSubmitSearchButton();

        Assert.assertTrue(isElementVisible(catalog.searchConfirmation));
    }
}
