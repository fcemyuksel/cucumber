package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExercisePage {

    public ExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement signUpIsimKutusu;


    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement signUpEmailKutusu;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpButonu;

    @FindBy(id = "id_gender1")
    public WebElement titleRadioButton;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement kayitOlusturulduYazisi;

}
