@smoke
Feature: US1006 Feyk bilgilerle facebook'a kayit yaptirma
  @P2
  Scenario: TC13 Kullanici Faker class'indan bilgilerle facebook'da kayit olusturur

    Given kullanici "facebookUrl" anasayfasina gider

    And facebook'da yeni hesap olustur butonuna basar
    When Faker class'indan bilgilerle facebook kayit formunu doldurur
    Then 5 saniye bekler
    And facebook kayit ol tusuna basar
    Then 5 saniye bekler
    And sayfayi kapatir