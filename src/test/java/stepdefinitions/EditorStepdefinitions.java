package stepdefinitions;

import Pages.EditorPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class EditorStepdefinitions {

    EditorPage editorPage=new EditorPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
    editorPage.newButonu.click();

    }
    @Then("{string} {string} {string} {string} {string} {string} {string} bilgilerini girer")
    public void bilgilerini_girer(String isim, String soyisim, String position, String office, String extencion, String startDate, String salary) {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(editorPage.kayitGirisIsimKutusu)
                .sendKeys(isim)
                .sendKeys(Keys.TAB)
                .sendKeys(soyisim)
                .sendKeys(Keys.TAB)
                .sendKeys(position)
                .sendKeys(Keys.TAB)
                .sendKeys(office)
                .sendKeys(Keys.TAB)
                .sendKeys(extencion)
                .sendKeys(Keys.TAB)
                .sendKeys(startDate)
                .sendKeys(Keys.TAB)
                .sendKeys(salary)
                .sendKeys(Keys.TAB)
                .perform();
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButonu.click();
    }
    @When("kullanici {string} ve {string} ile arama yapar")
    public void kullanici_ve_ile_arama_yapar(String isim, String soyisim) {
        editorPage.aramaKutusu.sendKeys(isim+" "+soyisim);
    }
    @Then("isim bolumunde {string} oldugunu test eder")
    public void isim_bolumunde_oldugunu_test_eder(String isim) {
        String actualIsim=editorPage.aramaSonucuIsimKutusu.getText();
        Assert.assertTrue(actualIsim.contains(isim));
    }

}
