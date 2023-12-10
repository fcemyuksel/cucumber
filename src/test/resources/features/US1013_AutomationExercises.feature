Feature: US1013 Automation Exercise kullanici olusturma testi

  @exercise
  Scenario: TC19 Kullanici bilgileri girerek kayit olabilmeli

    Given kullanici "exerciseUrl" anasayfasina gider
    And user sign up linkine tiklar
    Then 1 saniye bekler
    And user Create an account bölümüne email adresi girer
    And signUp butonuna basar
    Then 1 saniye bekler
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then 1 saniye bekler
    Then hesap olustugunu test eder
    And sayfayi kapatir