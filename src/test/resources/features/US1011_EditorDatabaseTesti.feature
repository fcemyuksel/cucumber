@wip

Feature: US1011 Kullanici kayit olusturabilmeli

  Scenario Outline: TC17 farkli kayitlar olusturulabilmeli

    When kullanici "editorUrl" anasayfasina gider
    Then new butonuna basar
    And 1 saniye bekler
    And "<isim>" "<soyisim>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>" bilgilerini girer
    And 1 saniye bekler
    And Create tusuna basar
    And 1 saniye bekler
    When kullanici "<isim>" ve "<soyisim>" ile arama yapar
    And 2 saniye bekler
    Then isim bolumunde "<isim>" oldugunu test eder
    And 1 saniye bekler
    And sayfayi kapatir

    Examples:
      |isim |soyisim|position|office  |extension |startDate|salary|
      |Ali  |Can    |Junior  |Ankara  |-         |2023-10-10|20000|
      |Veli |Cem    |Junior  |Ankara  |-         |2023-10-20|25000|
      |Arda |Han    |Senior  |Istanbul|teamLead  |2023-01-20|40000|
      |Ayse |san    |Junior  |Istanbul|manuel    |2023-05-20|19000|
      |Can  |Gun    |Senior  |Istanbul|manuel    |2023-01-20|30000|