package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog extends SystemBar {

    @FindBy(xpath = "//div[@class='left-block']")
    public WebElement fadedShortSleeveTShirts;

    @FindBy(xpath = "//i[@class='icon-plus']")
    public WebElement plusIcon;

    @FindBy(xpath = "//select[@name='group_1']")
    public WebElement sizeSelection;

    @FindBy(id = "add_to_cart")
    public WebElement addToCartButton;

    @FindBy(xpath = "//input[@name='qty']")
    public WebElement inputQuantity;

    @FindBy(xpath = "//a[@title='Blue']")
    public WebElement colorOptionBlue;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#color-black']")
    public WebElement colorOptionBlack;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")
    public WebElement casualOption;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement submitSearch;


    public Catalog() {
        PageFactory.initElements(driver, this);
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
    public void pressAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public void setProductQuantity(int quantity) {
        clearSendKeysToElement(inputQuantity, String.valueOf(quantity));
    }
    public void selectBlueOption(){
        clickOnElement(colorOptionBlue);
    }
    public void selectBlackOption(){
        clickOnElement(colorOptionBlack);
    }
    public void checkCasualOption(){
        clickOnElement(casualOption);
    }
    public void clickSubmitSearchButton(){
        clickOnElement(submitSearch);
    }

}
