

Feature: US1001 TestOtomasyunu Arama Testi


  @smoke
  Scenario: TC01 Kullanici testotomasyonu sayfasinda arama yapabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

  @smoke
    Scenario: TC02 Kullanici testotomasyonu sayfasinda arama yapabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna shoes yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

      @smoke
  Scenario: TC03 Kullanici testotomasyonu sayfasinda dress aratabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir