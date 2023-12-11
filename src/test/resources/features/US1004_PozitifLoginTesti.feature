Feature: US1004 Kullanici dogru bilgilerle sisteme giris yapar
  @P1
  Scenario: TC09 Kullanici gecerli kullanici adi ve password ile giris yapabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    And basarili giris yapilabildigini test eder
    And 3 saniye bekler
    And sayfayi kapatir
