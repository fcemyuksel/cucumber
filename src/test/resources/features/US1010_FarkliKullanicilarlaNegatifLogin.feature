@smoke
Feature: US1010 Verilen fakli gecersiz kullanici bilgileri ile giris yapilamaz

  Scenario Outline: TC16 Kullanici gecersiz kullanici adi ve gecerli password ile giris yapamamali

    Given kullanici testotomasyonu anasayfaya gider
    Then account butonuna basar
    And email olarak "<email>" girer
    And password olarak "<password>" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir

  Examples:
    |email|password|
    |toGecersizEmail2|toGecersizPassword2|
    |toGecersizEmail3|toGecersizPassword3|
    |toGecersizEmail4|toGecersizPassword4|
    |toGecersizEmail5|toGecersizPassword5|
