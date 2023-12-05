package stepdefinitions;

import Pages.TestOtomasyonuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Locale;

public class testotomasyonuStepdefinitions {

    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        int sonucSayisi = testOtomasyonuPage.bulunanUrunlerListesi.size();
        Assert.assertTrue(sonucSayisi > 0);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusuna shoes yazip aratir")
    public void aramaKutusunaShoesYazipAratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("shoes" + Keys.ENTER);
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @Then("ilk urune click yapar")
    public void ilkUruneClickYapar() {
        testOtomasyonuPage.bulunanUrunlerListesi.get(0).click();

    }

    @And("urun isminin shoes icerdigini test eder")
    public void urunIsmininShoesIcerdiginiTestEder() {
        String expectedUrunIsimIcerigi = "shoes";
        String actualUrunIsmi = testOtomasyonuPage.seciliUrunIsimElementi.getText().toLowerCase();
        Assert.assertTrue(actualUrunIsmi.contains(expectedUrunIsimIcerigi));
    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String aratilacakKelime) {
        testOtomasyonuPage.aramaKutusu.sendKeys(aratilacakKelime + Keys.ENTER);
    }

    @And("urun isminin {string} icerdigini test eder")
    public void urunIsmininIcerdiginiTestEder(String urunIsımIcerigi) {

        String actualUrunIsmi = testOtomasyonuPage.seciliUrunIsimElementi.getText().toLowerCase();
        Assert.assertTrue(actualUrunIsmi.contains(urunIsımIcerigi));
    }

    @Then("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("account butonuna basar")
    public void account_butonuna_basar() {
        testOtomasyonuPage.accountLinki.click();
    }

    @Then("email olarak {string} girer")
    public void email_olarak_girer(String email) { // toGecerliEmail

        testOtomasyonuPage.signInEmailKutusu.sendKeys(ConfigReader.getProperty(email));
    }

    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {


        testOtomasyonuPage.signInPasswordKutusu.sendKeys(ConfigReader.getProperty(password));
    }

    @Then("pagedown yapar")
    public void pagedownYapar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }


    @Then("signIn butonuna basar")
    public void sign_in_butonuna_basar() {
        testOtomasyonuPage.signInFormuSubmitButonu.click();
    }

    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        Assert.assertTrue(testOtomasyonuPage.logoutButonu.isDisplayed());
    }

}
