package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement tShirtOption;

    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womenOption;

    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBar;

    @FindBy(xpath = "//a[@title='Contact Us']")
    public WebElement contactButton;

    @FindBy(xpath = "//input[@id='newsletter-input']")
    public WebElement newsletterRegistrationEmailInput;

    @FindBy(xpath = "//button[@name='submitNewsletter']")
    public WebElement newsletterSubmitButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public Style selectTShirtOption() {
        clickOnElement(tShirtOption);

        return new Style();
    }
    public Style selectWomenOption(){
        clickOnElement(womenOption);

        return new Style();
    }
    public Style searchBar(String keys){
        sendKeysToElement(searchBar, keys);

        return new Style();
    }
    public ContactUs clickContactButton() {
        safeClickOnElement(contactButton);

        return new ContactUs();
    }

}
