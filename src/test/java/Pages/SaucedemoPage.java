package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {

   public SaucedemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


 @FindBy(id = "user-name")
 public WebElement usernameKutusu;

 @FindBy(id = "password")
 public WebElement passwordKutusu;

 @FindBy(id = "login-button")
 public  WebElement loginButonu;

 @FindBy(id ="item_4_title_link")
 public WebElement ilkUrunIsimElementi;

 @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
 public WebElement ilkUrunAddToCartButonu;

 @FindBy(className = "shopping_cart_link")
 public WebElement sepetElementi;

 @FindBy(className = "inventory_item_name")
 public WebElement sepettekiUrunIsimElementi;

}
