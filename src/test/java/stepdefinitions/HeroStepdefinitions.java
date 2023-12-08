package stepdefinitions;

import Pages.HeroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HeroStepdefinitions {

    HeroPage heroPage=new HeroPage();

    @When("kullanici Add Element butonuna basar")
    public void kullaniciAddElementButonunaBasar() {
    heroPage.addElementButonu.click();
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(heroPage.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void deleteButonunaBasar() {
        heroPage.deleteButonu.click();
    }

    @And("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void addRemoveElementsYazisininGorunurOldugunuTestEder() {
    Assert.assertTrue(heroPage.addRemoveYaziElementi.isDisplayed());

    }
}
