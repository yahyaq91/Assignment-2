package test_app.smoke;

import app.pom.Homepage;
import app.pom.Style;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class SearchFunction extends TestBasePage {
    @Test
    public void testSearchWithSearchBar(){
        Homepage homepage = new Homepage();
        Style style = homepage.searchBar("Summer Dress");
        style.clickSearchButton();

        Assert.assertTrue(isElementVisible(style.searchConfirmation));
    }

}
