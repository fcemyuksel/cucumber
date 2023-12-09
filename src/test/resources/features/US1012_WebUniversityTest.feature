Feature: Kullanici giris testi


  @wip @smoke
  Scenario:TC18 Yanlis bilgilerle giris yapilamamali

    Given kullanici "webUniUrl" anasayfasina gider
    Then login portal'a kadar asagi iner
    And login portal'a tiklar
    And 1 saniye bekler
    And diger window'a gecer
    When username ve password kutularina fake deger yazdirir
    And 1 saniye bekler
    Then login butonuna basar
    And Popup'ta cikan yazinin "validation failed" oldugunu test eder
    And 1 saniye bekler
    Then Ok diyerek Popup'i kapatir
    And Ilk sayfaya geri doner
    And 1 saniye bekler
    Then Ilk sayfaya donuldugunu test eder
    And sayfayi kapatir