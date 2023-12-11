
Feature: US1003 Kullanici aradigi urunu bulabilmeli


  Scenario: TC07 shoes arama testi
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna shoes yazip aratir
    Then ilk urune click yapar
    And urun isminin shoes icerdigini test eder
    And sayfayi kapatir

  @P1
  Scenario: TC08 Men dress arama testi
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "men dress" yazip aratir
    Then ilk urune click yapar
    And urun isminin "men" icerdigini test eder
    Then 5 saniye bekler
    And sayfayi kapatir