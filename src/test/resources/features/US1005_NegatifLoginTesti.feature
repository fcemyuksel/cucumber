Feature: US1005 Kullanici yanlis bilgilerle sisteme giris yapamaz

  Scenario: TC10 Kullanici gecersiz kullanici adi ve gecerli password ile giris yapamamali

    Given kullanici testotomasyonu anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecerliPassword" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir

  Scenario: TC11 Kullanici gecerli kullanici adi ve gecersiz password ile giris yapamamali

    Given kullanici testotomasyonu anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir

  Scenario: TC12 Kullanici gecersiz kullanici adi ve gecersiz password ile giris yapamamali

    Given kullanici testotomasyonu anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir