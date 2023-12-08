Feature: 1009 Kullanici testotomasyonu sayfasinda farkli urunler aratabilir

Scenario Outline: TC16 Farkli urunler icin arama testi yapilabilmeli

  Given kullanici "toUrl" anasayfasina gider
  When arama kutusuna "<aranacakUrun>" yazip aratir
  Then arama sonucunda urun bulunabildigini test eder
  And sayfayi kapatir

  Examples:
  |aranacakUrun|
  |phone            |
  |dress            |
  |baby             |
  |nutella          |
  |shoes            |