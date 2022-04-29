package test_app.smoke;

import app.pom.Homepage;
import app.pom.Style;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class AddToCartFunction extends TestBasePage {
    @Test

    public void testIncreasingQuantityWithInputtingQuantity()  {
        Homepage homepage = new Homepage();
        Style style = homepage.selectWomenOption();
        style.clickFadedShortSleeveOption();
        style.setProductQuantity(2);
 //       style.selectSize(0);

 //       style.clickOnAddToCartButton();

        //Assert.assertTrue(isElementVisible(style.addedToCartConfirmation));
    }
}
