Feature: US1008Kullanici element gorununceye kadar bekler

  Scenario: TC15 Kullanici elementler gorunur oluncaya kadar bekleyebilmeli

    Given kullanici "heroUrl" anasayfasina gider
    When kullanici Add Element butonuna basar
    And Delete butonunun gorunur oldugunu test eder
    And 2 saniye bekler
    Then Delete butonuna basar
    And Add Remove Elements yazisinin gorunur oldugunu test eder
    And 2 saniye bekler
    And sayfayi kapatir