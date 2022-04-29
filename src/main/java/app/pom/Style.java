package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Style extends SystemBar {

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    public WebElement fadedShortSleeveTShirts;
    @FindBy(xpath = "//i[@class='icon-plus']")
    public WebElement plusIcon;
    @FindBy(xpath = "//select[@name='group_1']")
    public WebElement sizeSelection;
    @FindBy(id = "add_to_cart")
    public WebElement addToCartButton;
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-casual']")
    public WebElement casualOption;

    @FindBy(id = "enabled_filters")
    public WebElement bannerEnabled;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-dressy']")
    public WebElement dressyOption;
    @FindBy(id = "//div[@id='enabled_filters']//li")
    public WebElement bannerEnabledWithWordDressy;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-girly']")
    public WebElement girlyOption;

    @FindBy(className = "lighter")
    public WebElement searchConfirmation;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement enterSearchButton;
    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    public WebElement inputQuantity;





    public Style() {
        PageFactory.initElements(driver, this);
    }
    public void selectCasualOption() {
        clickOnElement(casualOption);
    }
    public void selectDressyOption() {
        clickOnElement(dressyOption);
    }
    public void selectGirlyOption() {
        clickOnElement(girlyOption);
    }

    public void clickSearchButton() {
        clickOnElement(enterSearchButton);
    }
    public void clickFadedShortSleeveOption(){
        clickOnElement(fadedShortSleeveTShirts);
    }
    public void clickPlusIcon(){
        clickOnElement(plusIcon);
    }

    public void selectSize(int index){
        selectFromDropdownByIndex(sizeSelection, index);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public void setProductQuantity(int quantity) {
        clearSendKeysToElement(inputQuantity, String.valueOf(quantity));
    }
}
