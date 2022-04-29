package app.shared;

import app.pom.Homepage;
import app.pom.Login;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

//    @FindBy(xpath = "//a[@title='Contact Us']")
//    public WebElement contactButton;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[@class='account']")
    public WebElement accountButton;

    @FindBy(xpath = "//i[@class='icon-ok']")
    public WebElement addedToCartConfirmation;

    @FindBy(xpath = "//span[@class='cat-name']")
    public WebElement filterConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading  product-listing']")
    public WebElement searchConfirmation;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement messageSentConfirmation;

    @FindBy(xpath = "//p[@class='dark']")
    public WebElement orderRef;

    @FindBy(xpath = "//div[@class='fancybox-inner']")
    public WebElement locatorConfirmation;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement newsletterRegistrationConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading product-listing']")
    public WebElement specialsConfirmation;



    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']")
    public WebElement tShirtsButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public Login clickLoginButton() {
        safeClickOnElement(loginButton);

        return new Login();
    }

    public Homepage clickLogoutButton() {
        safeClickOnElement(logoutButton);

        return new Homepage();
    }

//    public ContactUs clickContactButton() {
//        safeClickOnElement(contactButton);
//
//        return new ContactUs();
//    }


    public boolean isSignedIn() {
        boolean isSignedIn = false;

        if (isElementVisible(accountButton)) {
            isSignedIn = true;
        }

        return isSignedIn;
    }

}
