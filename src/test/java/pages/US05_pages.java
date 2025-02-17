package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static pages.ObjectInitializer.*;

import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;


public class US05_pages
{
    public US05_pages()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//li[@class='dropdown nav-item']")
    public WebElement profileIcon;

    @FindBy (xpath = "//span[text()='Register']")
    public WebElement registerElementi;

    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement signInElementi;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameTextbox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordTextbox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButtonu;

    @FindBy (xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesButtonu;

    @FindBy (xpath = "//span[text()='My Appointments']")
    public WebElement loginPageMyAppointmentsButtonu;

    @FindBy (xpath = "//span[text()='Make an Appointment']")
    public WebElement loginPageMakeAnAppointmentButtonu;

    @FindBy (xpath = "//h2[text()='Make an Appointment']")
    public WebElement loginPageMakeAnAppointmentHeader;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement loginPageFirstnameTextBox;

    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement loginPageLastnameTextBox;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement loginPageSSNTextBox;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement loginPageEmailTextBox;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement loginPagePhoneTextBox;

    @FindBy (xpath = "//div[text()='Phone number is invalid']")
    public WebElement loginPagePhoneErrorLine1;

    @FindBy (xpath = "(//div[@class='text-danger form-group'])/div[@class='invalid-feedback']")
    public WebElement loginPagePhoneErrorLine2;

    @FindBy (xpath = "//input[@name='appoDate']")
    public WebElement loginPageDateTextBox;

    @FindBy (xpath = "//span[text()='Appointment date can not be past date!']")
    public WebElement loginPageDateErrorLine;

    @FindBy (xpath = "//span[text()='Send an Appointment Request']")
    public WebElement loginPageSendAnAppointmentRequestButton;

    @FindBy (xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
    public WebElement loginPageUserAccountButton;

    @FindBy (xpath = "//a[@href='/logout']")
    public WebElement loginPageSignOutButton;

    @FindBy (xpath = "(//div[@role='alert'])/span/strong")
    public WebElement alertText;
    // dynamic + static path ile alert textini alıyoruz

    //------------------------ana sayfadan
    @FindBy (xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement mainpageMakeAnAppointmentButtonu;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement mainpageFirstnameTextBox;

    @FindBy (xpath = "//div[text()='Your FirstName is required.']")
    public WebElement mainpageFirstnameErrorLine;

    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement mainpageLastnameTextBox;

    @FindBy (xpath = "//div[text()='Your LastName is required.']")
    public WebElement mainpageLastnameErrorLine;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement mainpageSSNTextBox;

    @FindBy (xpath = "//div[text()='Your SSN is required.']")
    public WebElement mainpageSSNErrorLine;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement mainpageEmailTextBox;

    @FindBy (xpath = "(//div[@class='text-danger form-group'])/div[@class='invalid-feedback']")
    public WebElement mainpageEmailErrorLine;
    // xpath/xpath kullandim

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement mainpagePhoneTextBox;

    @FindBy (xpath = "(//div[@class='text-danger form-group'])/div[@class='invalid-feedback']")
    public WebElement mainpagePhoneErrorLine;

    @FindBy (xpath = "//input[@name='appoDate']")
    public WebElement mainpageDateTextBox;

    @FindBy (xpath = "//span[text()='Send an Appointment Request']")
    public WebElement mainpageSendAnAppointmentRequestButton;

    @FindBy (xpath = "//span[text()='Registration']")
    public WebElement registrationHeader;
    //-----------

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement registrationPageFirstname;

    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement registrationPageLastname;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement registrationPageSSN;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement registrationPageUsername;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement registrationPageEmail;

    @FindBy (xpath = "//input[@name='firstPassword']")
    public WebElement registrationPageNewPassword;

    @FindBy (xpath = "//input[@name='secondPassword']")
    public WebElement registrationPageNewPasswordConfirmation;

    @FindBy (xpath = "//button[@id='register-submit']")
    public WebElement registrationPageRegisterButton;



    // methods
    public void login(String roleUsername,String rolePassword)
    {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        JSUtils.clickElementByJS(profileIcon);
        JSUtils.clickElementByJS(signInElementi);
       // profileIcon.click();
        //signInElementi.click();
       // siteden kaynaklanan sıkıntılar nedeni ile click islemlerini selenium ile degil js ile yapiyoruz

        usernameTextbox.sendKeys(ConfigReader.getProperty(roleUsername));
        passwordTextbox.sendKeys(ConfigReader.getProperty(rolePassword));

        signInButtonu.click();
    }

    public void logout()
    {
        JSUtils.clickElementByJS(loginPageUserAccountButton);
        JSUtils.clickElementByJS(loginPageSignOutButton);

    }
}
