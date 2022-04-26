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
    public void testFilteringByStyleCasual(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickCasualOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByStyleDressy(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickDressyOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByStyleGirly(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickGirlyOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterCategoryToTops(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickTopsFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterCategoryToDresses(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickDressesFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterBySizeS(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickSmallFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterBySizeM(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickMediumFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterBySizeL(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickLargeFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
}
