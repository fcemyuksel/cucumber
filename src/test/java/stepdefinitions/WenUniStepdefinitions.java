package stepdefinitions;

import Pages.WebUniPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Driver;
import utilities.ReusableMethods;

public class WenUniStepdefinitions {

    WebUniPage webUniPage=new WebUniPage();

    @Then("login portal'a kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        //JavaScriptExecuter ile scroolIntoView ile

        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoViewIfNeeded()",webUniPage.loginPortalElementi);

    }
    @Then("login portal'a tiklar")
    public void login_portal_a_tiklar() {
        webUniPage.loginPortalElementi.click();

    }
    @Then("diger window'a gecer")
    public void diger_window_a_gecer() {
        /*
        click yapmadan once ilk sayfanin window handle degerini kaydet
         click yapinca acik olan 2 sayfa oluyor
         driver.getWindowHandles() ile 2 sayfanin whd lerini set olarak kaydederiz
         ilk sayfa whd==>A, elimizde set var (A,B)
         o zaman ikinci sayfa whd=B
         driver.switchTo(ikinci sayfa whd)
         */

        ReusableMethods.windowDegistir("WebDriver | Login Portal");


    }
    @When("username ve password kutularina fake deger yazdirir")
    public void username_ve_password_kutularina_fake_deger_yazdirir() {

        Faker faker=new Faker();
        webUniPage.userNameKutusu.sendKeys(faker.name().username());
        webUniPage.passwordKutusu.sendKeys(faker.internet().password());
     }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        webUniPage.loginButonu.click();
    }
    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String expectedPopUpYazisi) {
        String actualPopUpYazisi=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedPopUpYazisi,actualPopUpYazisi);
    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.windowDegistir("WebDriverUniversity.com");
    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        String expectedTitle="WebDriverUniversity.com";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
