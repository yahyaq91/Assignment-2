package test_app.functionality;

import app.pom.Catalog;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class Filters extends TestBasePage {
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
}
