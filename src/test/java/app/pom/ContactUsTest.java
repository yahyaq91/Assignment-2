package app.pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

import static org.testng.Assert.*;

public class ContactUsTest extends TestBasePage {
    @Test
    public void testContactCustomerService(){
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactButton();
        contactUs.departmentSelection(1);
        String emailAddress = GenerateData.email();
        contactUs.inputEmailAddress(emailAddress);
        contactUs.inputMessage("This is a test");
        contactUs.clickSendButton();

        Assert.assertTrue(isElementVisible(contactUs.messageSentConfirmation));
    }
    @Test
    public void testContactWebmaster(){
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactButton();
        contactUs.departmentSelection(2);
        String emailAddress = GenerateData.email();
        contactUs.inputEmailAddress(emailAddress);
        contactUs.inputMessage("This is a test");
        contactUs.clickSendButton();

        Assert.assertTrue(isElementVisible(contactUs.messageSentConfirmation));
    }

}