package stepdefinitions;

import Pages.SaucedemoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ReusableMethods;

public class SaucedemoStepdefinitions {

    SaucedemoPage saucedemoPage = new SaucedemoPage();
    String ilkUrunIsmi;

    @Then("saucedomo username kutusuna {string} yazar")
    public void saucedomoUsernameKutusunaYazar(String username) {
        saucedemoPage.usernameKutusu.sendKeys(username);
    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String password) {
        saucedemoPage.passwordKutusu.sendKeys(password);

    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {

        saucedemoPage.loginButonu.click();
    }
    @And("ilk urununun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilkUrunununIsminiKaydederVeBuUrununSayfasinaGider() {

        ilkUrunIsmi = saucedemoPage.ilkUrunIsimElementi.getText();
    }
    @When("saucedemo add to cart butonuna basar")
    public void saucedemoAddToCartButonunaBasar() {
        saucedemoPage.ilkUrunAddToCartButonu.click();
    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
        saucedemoPage.sepetElementi.click();
    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {
        String sepettekiUrunIsmi = saucedemoPage.sepettekiUrunIsimElementi.getText();

        Assert.assertEquals(ilkUrunIsmi,sepettekiUrunIsmi);
    }



}