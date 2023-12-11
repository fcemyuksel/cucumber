package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@exercise"
)

public class Runner {
    /*
        Runner class'i bos bir class'dir
        Runner class'ini onemli kilan, class ile kullanilan notasyonlardir
        Bu notoasyonlar sayesinde,
            - features, glue : kod olmayan feature dosyalari ile
              kodlarimizi yazdigimiz stepdefinitions'i birbiriyle ilisiklendirir
            - tags : istenen feature ve/veya scenario'lari toplu olarak calistirir
            - dryRun = true : calistirilmasi istenen feature/scenario'lari gozden gecirip
                              stepdefinition'lari olmayan step'leri bize raporlar
                              ve kullanmamiz icin method'lari olusturur
                              ONEMLI : eger eksik adim yoksa, hic bir testi calistirmadan
                              Test PASSED der. Bundan dolayi testlerimizi calistirirken
                              dryRun = false oldugundan emin olmaliyiz
     */


}