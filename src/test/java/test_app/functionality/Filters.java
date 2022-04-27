package test_app.functionality;

import app.pom.Catalog;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class Filters extends TestBasePage {
    @Test
    public void testFilteringByColorBlack(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectBlackOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByColorBeige(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectBeigeOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByColorBlue(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectBlueOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByColorYellow(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectYellowOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByColorWhite(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectWhiteOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByColorOrange(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectOrangeOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByColorGreen(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectGreenOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilteringByColorPink(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.selectPinkOption();

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
    @Test
    public void testFilterByPropertyColorfulDress(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickColorfulDressFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByPropertyMaxiDress(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickMaxiDressFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByPropertyMidiDress(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickMidiDressFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByPropertyShortDress(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickShortDressFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByPropertyShortSleeve(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickShortSleeveFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByCompositionCotton(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickCottonFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByCompositionPolyester(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickPolyesterFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByCompositionViscose(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickViscoseFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByAvailability(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickInStockFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByManufacturer(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickFashionManufacturerFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
    @Test
    public void testFilterByCondition(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.selectWomenOption();
        catalog.clickNewConditionFilter();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
    }
}
