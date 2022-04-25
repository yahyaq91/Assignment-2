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
}
