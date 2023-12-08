Feature: US1007 Kullanici Saucedemo sayfasindan urun satin alir

  Scenario: TC14 Saucedomeo sayfasinda urun sepete eklemeli
    
    Given kullanici "sauceUrl" anasayfasina gider
    Then saucedomo username kutusuna "standard_user" yazar
    And saucedemo password kutusuna "secret_sauce" yazar

    Then saucedemo login tusuna basar
    And ilk urununun ismini kaydeder ve bu urunun sayfasina gider
    When  saucedemo add to cart butonuna basar
    Then saucedemo alisveris sepetine tiklar
    And sectigi urunun basarili olarak sepete eklendigini test eder
    And sayfayi kapatir