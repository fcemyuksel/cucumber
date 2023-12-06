package stepdefinitions;
import Pages.FacebookPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FacebookStepdefinitions {
    FacebookPage facebookPage = new FacebookPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    /*@Then("facebook cookies kabul eder")
    public void facebook_cookies_kabul_eder() {
        facebookPage.cookieKabulButonu.click();

    }*/

    @Then("facebook'da yeni hesap olustur butonuna basar")
    public void facebook_da_yeni_hesap_olustur_butonuna_basar() {
        facebookPage.kayitOlusturButonu.click();

    }
    @When("Faker class'indan bilgilerle facebook kayit formunu doldurur")
    public void faker_class_indan_bilgilerle_facebook_kayit_formunu_doldurur() {

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());

        String email = faker.internet().emailAddress();
        ReusableMethods.bekle(3);
        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).perform();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("26")
                .sendKeys(Keys.TAB)
                .sendKeys("Jul")
                .sendKeys(Keys.TAB)
                .sendKeys("1972")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .perform();

    }
    @When("facebook kayit ol tusuna basar")
    public void facebook_kayit_ol_tusuna_basar() {
        facebookPage.kaydolButonu.click();
    }
}