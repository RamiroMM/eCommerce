Feature: Various Regression Tests

@RegTest1
Scenario Outline: Verify the URL after deselecting the facets in PLP
Given User is on StoreFront homepage with <link>
When User goes to Servers Catalog
When User selects first processor filter
And User removes filter
Then URL is not modified after deselecting the facets
Examples:						
| link |
| https://uat.buy.hpe.com/ca/fr |
| https://uat.buy.hpe.com/ca/en |
| https://uat.buy.hpe.com/tw/zh |
| https://uat.buy.hpe.com/tw/en |
| https://uat.buy.hpe.com/ch/fr |
| https://uat.buy.hpe.com/ch/de |
| https://uat.buy.hpe.com/fr/fr |
| https://uat.buy.hpe.com/br/pt |
| https://uat.buy.hpe.com/it/it |
| https://uat.buy.hpe.com/mx/es |
| https://uat.buy.hpe.com/kr/ko |
| https://uat.buy.hpe.com/es/es |
| https://uat.buy.hpe.com/at/de |
| https://uat.buy.hpe.com/cn/zh |
| https://uat.buy.hpe.com/ru/ru |
| https://uat.buy.hpe.com/tr/tr |
| https://uat.buy.hpe.com/tr/en |
| https://uat.buy.hpe.com/in/en |
| https://uat.buy.hpe.com/us/en |
| https://uat.buy.hpe.com/uk/en |
| https://uat.buy.hpe.com/hk/en |
| https://uat.buy.hpe.com/nl/en |
| https://uat.buy.hpe.com/sg/en |
| https://uat.buy.hpe.com/se/en |
| https://uat.buy.hpe.com/cz/en |
| https://uat.buy.hpe.com/dk/en |
| https://uat.buy.hpe.com/fi/en |
| https://uat.buy.hpe.com/ie/en |
| https://uat.buy.hpe.com/il/en |
| https://uat.buy.hpe.com/my/en |
| https://uat.buy.hpe.com/no/en |
| https://uat.buy.hpe.com/pl/en |
| https://uat.buy.hpe.com/pt/en |
| https://uat.buy.hpe.com/za/en |
| https://uat.buy.hpe.com/emea_europe/en|
| https://uat.buy.hpe.com/lamerica/es	|

@RegTest1
Scenario Outline: Verify the URL after deselecting the facets in SRP
Given User is on StoreFront homepage with <link>
And User searches for "DL380"
When User selects first filter
And User removes filter
Then SRP URL is not modified after removing facets
Examples:						
| link |
| https://uat.buy.hpe.com/ca/fr |
| https://uat.buy.hpe.com/ca/en |
| https://uat.buy.hpe.com/tw/zh |
| https://uat.buy.hpe.com/tw/en |
| https://uat.buy.hpe.com/ch/fr |
| https://uat.buy.hpe.com/ch/de |
| https://uat.buy.hpe.com/fr/fr |
| https://uat.buy.hpe.com/br/pt |
| https://uat.buy.hpe.com/it/it |
| https://uat.buy.hpe.com/mx/es |
| https://uat.buy.hpe.com/kr/ko |
| https://uat.buy.hpe.com/es/es |
| https://uat.buy.hpe.com/at/de |
| https://uat.buy.hpe.com/cn/zh |
| https://uat.buy.hpe.com/ru/ru |
| https://uat.buy.hpe.com/tr/tr |
| https://uat.buy.hpe.com/tr/en |
| https://uat.buy.hpe.com/in/en |
| https://uat.buy.hpe.com/us/en |
| https://uat.buy.hpe.com/uk/en |
| https://uat.buy.hpe.com/hk/en |
| https://uat.buy.hpe.com/nl/en |
| https://uat.buy.hpe.com/sg/en |
| https://uat.buy.hpe.com/se/en |
| https://uat.buy.hpe.com/cz/en |
| https://uat.buy.hpe.com/dk/en |
| https://uat.buy.hpe.com/fi/en |
| https://uat.buy.hpe.com/ie/en |
| https://uat.buy.hpe.com/il/en |
| https://uat.buy.hpe.com/my/en |
| https://uat.buy.hpe.com/no/en |
| https://uat.buy.hpe.com/pl/en |
| https://uat.buy.hpe.com/pt/en |
| https://uat.buy.hpe.com/za/en |
| https://uat.buy.hpe.com/emea_europe/en|
| https://uat.buy.hpe.com/lamerica/es	|

@RegTest2
Scenario Outline: Verify the URL after selecting the facets in PLP
Given User is on StoreFront homepage with <link>
When User goes to Servers Catalog
When User selects first processor filter
Then URL displays canonical link plus "?q=%3Arelevance%3Afacet_processorsmax%3A2&text=&textSearch=&pageSize=10"
Examples:						
| link |
| https://uat.buy.hpe.com/ca/fr |
| https://uat.buy.hpe.com/ca/en |
| https://uat.buy.hpe.com/tw/zh |
| https://uat.buy.hpe.com/tw/en |
| https://uat.buy.hpe.com/ch/fr |
| https://uat.buy.hpe.com/ch/de |
| https://uat.buy.hpe.com/fr/fr |
| https://uat.buy.hpe.com/br/pt |
| https://uat.buy.hpe.com/it/it |
| https://uat.buy.hpe.com/mx/es |
| https://uat.buy.hpe.com/kr/ko |
| https://uat.buy.hpe.com/es/es |
| https://uat.buy.hpe.com/at/de |
| https://uat.buy.hpe.com/cn/zh |
| https://uat.buy.hpe.com/ru/ru |
| https://uat.buy.hpe.com/tr/tr |
| https://uat.buy.hpe.com/tr/en |
| https://uat.buy.hpe.com/in/en |
| https://uat.buy.hpe.com/us/en |
| https://uat.buy.hpe.com/uk/en |
| https://uat.buy.hpe.com/hk/en |
| https://uat.buy.hpe.com/nl/en |
| https://uat.buy.hpe.com/sg/en |
| https://uat.buy.hpe.com/se/en |
| https://uat.buy.hpe.com/cz/en |
| https://uat.buy.hpe.com/dk/en |
| https://uat.buy.hpe.com/fi/en |
| https://uat.buy.hpe.com/ie/en |
| https://uat.buy.hpe.com/il/en |
| https://uat.buy.hpe.com/my/en |
| https://uat.buy.hpe.com/no/en |
| https://uat.buy.hpe.com/pl/en |
| https://uat.buy.hpe.com/pt/en |
| https://uat.buy.hpe.com/za/en |
| https://uat.buy.hpe.com/emea_europe/en|
| https://uat.buy.hpe.com/lamerica/es	|