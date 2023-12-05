
Feature: US1003 Kullanici aradigi urunu bulabilmeli

  @smoke
  Scenario: TC07 shoes arama testi
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna shoes yazip aratir
    Then ilk urune click yapar
    And urun isminin shoes icerdigini test eder
    And sayfayi kapatir


  Scenario: TC08 Men dress arama testi
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "Men dress" yazip aratir
    Then ilk urune click yapar
    And urun isminin "Men" icerdigini test eder
    Then 5 saniye bekler
    And sayfayi kapatir