 @e2e @smoke

Feature: US1002 TestOtomasyunu Arama Testi

  Background:  //BeforeTest benzeri  bir uygulama
    Given kullanici testotomasyonu anasayfaya gider

    @smoke
  Scenario: TC04 Kullanici testotomasyonu sayfasinda arama yapabilmeli


    When arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC05 Kullanici testotomasyonu sayfasinda arama yapabilmeli

    When arama kutusuna shoes yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC06 Kullanici testotomasyonu sayfasinda dress aratabilmeli

    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir