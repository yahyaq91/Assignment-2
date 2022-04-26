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

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-casual']")
    public WebElement casualOption;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-dressy']")
    public WebElement dressyOption;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-girly']")
    public WebElement girlyOption;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement submitSearch;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    public WebElement confirmShoppingCart;

    @FindBy(xpath = "//button[@name='processAddress']")
    public WebElement addressConfirmation;

    @FindBy(xpath = "//div[@id='uniform-cgv']")
    public WebElement checkTermsConditions;

    @FindBy(xpath = "//button[@name='processCarrier']")
    public WebElement deliveryOptionConfirmation;

    @FindBy(xpath = "//a[@class='bankwire']")
    public WebElement bankWireOption;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    public WebElement orderConfirmationButton;

    @FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
    public WebElement backToOrdersButton;

    @FindBy(xpath = "//a[@class='color-myaccount']")
    public WebElement orderRef;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#categories-tops']")
    public WebElement topsFilter;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#categories-dresses']")
    public WebElement dressesFilter;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#size-s']")
    public WebElement smallFilter;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#size-m']")
    public WebElement mediumFilter;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#size-l']")
    public WebElement largeFilter;


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
    public void clickCasualOption(){
        clickOnElement(casualOption);
    }
    public void clickDressyOption(){
        clickOnElement(dressyOption);
    }
    public void clickGirlyOption(){
        clickOnElement(girlyOption);
    }
    public void clickSubmitSearchButton(){
        clickOnElement(submitSearch);
    }
    public void clickCheckoutButton(){
        clickOnElement(checkoutButton);
    }
    public void clickConfirmShoppingCart(){
        clickOnElement(confirmShoppingCart);
    }
    public void clickAddressConfirmation(){
        clickOnElement(addressConfirmation);
    }
    public void checkToAgreeTermsConditions(){
        clickOnElement(checkTermsConditions);
    }
    public void clickDeliveryOptionConfirmation(){
        clickOnElement(deliveryOptionConfirmation);
    }
    public void clickBankWireOption(){
        clickOnElement(bankWireOption);
    }
    public void clickOrderConfirmationButton(){
        clickOnElement(orderConfirmationButton);
    }
    public void clickBackToOrdersButton(){
        clickOnElement(backToOrdersButton);
    }
    public void clickOrderRef(){
        clickOnElement(orderRef);
    }
    public void clickTopsFilter(){clickOnElement(topsFilter);}
    public void clickDressesFilter(){clickOnElement(dressesFilter);}
    public void clickSmallFilter(){clickOnElement(smallFilter);}
    public void clickMediumFilter(){clickOnElement(mediumFilter);}
    public void clickLargeFilter(){clickOnElement(largeFilter);}

}
