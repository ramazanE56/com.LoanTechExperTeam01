Feature: US01: Bir ziyaretci olarak siteyi kullanabilmek icin web sitesine erisebilmek istiyorum.
@wip
  Scenario: TC01: Ziyaretci verilen Url ile siteye ulaşabilmeli
    Given Ziyaretci verilen "Url" ile siteye giris yapar
    Then Ziyaretcinin siteye eristigi dogrulanir
    And Ziyaretci sayfayi kapatir