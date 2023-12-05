package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestOtomasyonuPage {

    public TestOtomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//li[@class='has-sub'])[1]")
    public WebElement electronicsLinki;

    @FindBy(xpath = "//li[@class='acc_head']")
    public List<WebElement> kategoriElementList;


    @FindBy(xpath = "//div[@class='product-box my-2  py-1']")
    public List<WebElement> bulunanUrunlerListesi;

    @FindBy(xpath = "(//span[text()='Account'])[1]")
    public WebElement accountLinki;

    @FindBy(xpath = "//a[text()=' Sign Up']")
    public WebElement signUpLinki;

    @FindBy(id="firstName")
    public WebElement signUpFirstnameKutusu;

    @FindBy(id = "btn-submit-form")
    public WebElement signUpFormuSubmit;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement signInEmailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPasswordKutusu;

    @FindBy(xpath = "//*[@id='submitlogin']")
    public WebElement signInFormuSubmitButonu;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logoutButonu;

    @FindBy(xpath = "(//div[@class='product-box mb-2 pb-1'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement seciliUrunIsimElementi;

    @FindBy(xpath = "//button[@class='add-to-cart']")
    public WebElement addToCartButonu;

    @FindBy(xpath = "(//span[text()='Your Cart'])[1]")
    public WebElement yourCartLinki;

    @FindBy(xpath = "//*[@*='product-title text-center']")
    public WebElement sepettekiUrunIsimElementi;

    @FindBy(xpath = "//*[@*='button-block button-place']")
    public WebElement checkoutButonu;

    @FindBy(xpath = "//button[@class='btn-add-address']")
    public WebElement adresEkleButonu;

    @FindBy(xpath = "//input[@id='name']") //
    public WebElement adresEkleFormuIsimKutusu;

    @FindBy(xpath = "(//*[text()='Add Address'])[2]")
    public WebElement adresEkleFormuSubmitButonu;

    @FindBy(xpath = "//div[@class='address-box']")
    public List<WebElement> kullaniciAdresiElementi;

    @FindBy(xpath = "(//span[@class='checkmark'])[1]")
    public WebElement billingAdressCheckBox;

    @FindBy(xpath = "(//span[@class='checkmark'])[2]")
    public WebElement deliveryAdressSameCheckBox;

    @FindBy(xpath = "(//input[@value=\"1\"])[2]")
    public WebElement shippingMethodCheckBox;

    @FindBy(xpath = "//*[@name='accept_terms']")
    public WebElement acceptTermsCheckBox;

    @FindBy(xpath = "//*[@*='button-block button-place mt-3']")
    public WebElement placeOrderNowButonu;

    @FindBy(xpath = "//h2[@class='notfoundtxt mt-3 mb-3 text-black']")
    public WebElement alisverisBasariliYaziElementi;


}

//1- https://www.testotomasyonu.com/ anasayfasina gidin
//2- account linkine basin
//3- gecerli kullanici adi ve sifre ile giris yapin
//4- electronics linkine tiklayin
//5- ilk urunu secip add to cart butonuna tiklayin
// 7. adimda urunun sepete eklendigini test etmek icin bu adimda urun ismini kaydedin
//6- your Cart linkini tiklayin
//7- urunun sepete eklendigini test edin
//8- checkout butonuna basin
//9- ilgili alanlari doldurup place order now butonuna basin
// - adres yoksa adress ekleyin
//gereken checkbox'lari click yapin
//10. Your order is successfully done! yazisinin ciktigini test edin

