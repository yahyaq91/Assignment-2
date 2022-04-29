package app.shared;

import app.pom.Login;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//a[@class='login']")
    public WebElement loginButton;

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

    @FindBy(xpath = "//div[@class='fancybox-inner']")
    public WebElement locatorConfirmation;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement newsletterRegistrationConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading product-listing']")
    public WebElement specialsConfirmation;


    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public Login clickLoginButton() {
        safeClickOnElement(loginButton);

        return new Login();
    }

}
