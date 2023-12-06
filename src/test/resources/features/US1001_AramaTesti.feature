

Feature: US1001 Testotomasyonu Arama Testi


  Scenario: TC01 Kullanici testotomasyonu sayfasinda arama yapabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC02 Kullanici test otomasyonu sayfasinda shoes aratabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna shoes yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC03 Kullanici test otomasyonu sayfasinda dress aratabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir