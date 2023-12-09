package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniPage {

    public WebUniPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[text()='LOGIN PORTAL']")
    public WebElement loginPortalElementi;


    @FindBy(xpath = "//*[@id='text']")
    public WebElement userNameKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButonu;


}
