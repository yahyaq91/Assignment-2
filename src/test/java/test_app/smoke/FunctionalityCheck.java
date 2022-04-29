package test_app.smoke;

import app.pom.Homepage;
import app.pom.Style;
import config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class FunctionalityCheck extends TestBasePage {
   @Test
    public void testCasualOption(){
        Homepage homepage = new Homepage();

       Style style = homepage.selectWomenOption();
        style.selectCasualOption();

        Assert.assertTrue(isElementVisible(style.bannerEnabled));
    }
    @Test
    public void testDressyOption(){
        Homepage homepage = new Homepage();

        Style style = homepage.selectWomenOption();
        style.selectDressyOption();

        Assert.assertTrue(isElementVisible(style.bannerEnabled) );
    }
    @Test
    public void testGirlyOption(){
        Homepage homepage = new Homepage();

        Style style = homepage.selectWomenOption();
        style.selectGirlyOption();

        Assert.assertTrue(isElementVisible(style.bannerEnabled) );
    }


}
