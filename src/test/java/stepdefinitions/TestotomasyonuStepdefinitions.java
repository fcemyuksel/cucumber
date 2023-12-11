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
import utilities.ReusableMethods;

import java.util.Locale;

public class TestotomasyonuStepdefinitions {

    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
        ReusableMethods.bekle(5);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        int sonucSayisi = testOtomasyonuPage.bulunanUrunlerListesi.size();
        Assert.assertTrue(sonucSayisi>0);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
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
    public void ilk_urune_click_yapar() {
        testOtomasyonuPage.bulunanUrunlerListesi.get(0).click();
    }
    @Then("urun isminin shoes icerdigini test eder")
    public void urun_isminin_shoes_icerdigini_test_eder() {

        String expectedUrunIsimIcerigi = "shoes";
        String actualUrunIsmi = testOtomasyonuPage.seciliUrunIsimElementi.getText().toLowerCase();
        Assert.assertTrue(actualUrunIsmi.contains(expectedUrunIsimIcerigi));
    }

    @When("arama kutusuna {string} yazip aratir")
    public void arama_kutusuna_yazip_aratir(String aratilacakKelime) {
        testOtomasyonuPage.aramaKutusu.sendKeys(aratilacakKelime + Keys.ENTER);
    }
    @Then("urun isminin {string} icerdigini test eder")
    public void urun_isminin_icerdigini_test_eder(String urunIsimIcerigi) {

        String actualUrunIsmi = testOtomasyonuPage.seciliUrunIsimElementi.getText().toLowerCase();
        Assert.assertTrue(actualUrunIsmi.contains(urunIsimIcerigi));

    }

    @Then("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye*1000);
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
    @Then("signIn butonuna basar")
    public void sign_in_butonuna_basar() {
        testOtomasyonuPage.signInFormuSubmitButonu.click();

    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        Assert.assertTrue(testOtomasyonuPage.logoutButonu.isDisplayed());
    }

    @And("sisteme giris yapamadigini test eder")
    public void sistemeGirisYapamadiginiTestEder() {

        Assert.assertTrue(testOtomasyonuPage.signInEmailKutusu.isDisplayed());
    }
}