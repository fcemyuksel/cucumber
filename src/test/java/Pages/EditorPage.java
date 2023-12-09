package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {
    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement kayitGirisIsimKutusu;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButonu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement aramaSonucuIsimKutusu;
}
