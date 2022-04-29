package test_app.smoke.transactions;

import app.pom.Catalog;
import app.pom.Homepage;
import config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class AddingItemsToCart extends TestBasePage {
    @Test
    public void testIncreasingQuantityWithIcon(){
        Homepage homepage = new Homepage();
        String username = appConfig.get(Config.AppProperties.USER);
        String password = appConfig.get(Config.AppProperties.PASSWORD);

        homepage.clickLoginButton().login(username, password);
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
        String username = appConfig.get(Config.AppProperties.USER);
        String password = appConfig.get(Config.AppProperties.PASSWORD);

        homepage.clickLoginButton().login(username, password);
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
        String username = appConfig.get(Config.AppProperties.USER);
        String password = appConfig.get(Config.AppProperties.PASSWORD);

        homepage.clickLoginButton().login(username, password);
        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.selectTShirtBlueOption();
        catalog.selectSize(0);
        catalog.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(catalog.addedToCartConfirmation));
    }

}