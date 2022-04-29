package test_app.functionality;

import app.pom.Catalog;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class SearchFunction extends TestBasePage {
    @Test
    public void testSearchWithSearchBar(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.searchBar("dresses");
        catalog.clickSubmitSearchButton();

        Assert.assertTrue(isElementVisible(catalog.searchConfirmation));
    }
    @Test
    public void testSearchForLocalStore(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickDiscoverStoreButton();
        catalog.enterSearchData("10029");
        catalog.selectRadius(2);
        catalog.clickSearchButton();

       Assert.assertTrue(isElementVisible(catalog.locatorConfirmation));
    }
    @Test
    public void testSearchForSpecials(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickSpecialsButton();

        Assert.assertTrue(isElementVisible(catalog.specialsConfirmation));
    }

}
