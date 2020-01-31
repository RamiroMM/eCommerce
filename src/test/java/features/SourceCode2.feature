Feature: Sourcecode verifications

@SourceCodeTest2
Scenario Outline: Verify the alt tag for Logo link in the header
Given User is on StoreFront homepage with <link>
Then Logo alt tag has "Hewlett Packard Enterprise"
Then Logo link points to <link>
Examples:						
| link 									|
| https://uat.buy.hpe.com/ca/fr 		| 
| https://uat.buy.hpe.com/ca/en 		|
| https://uat.buy.hpe.com/tw/zh 		|
| https://uat.buy.hpe.com/tw/en 		|
| https://uat.buy.hpe.com/ch/fr 		|
| https://uat.buy.hpe.com/ch/de 		|
| https://uat.buy.hpe.com/fr/fr 		|
| https://uat.buy.hpe.com/br/pt 		|
| https://uat.buy.hpe.com/it/it 		|
| https://uat.buy.hpe.com/mx/es 		|
| https://uat.buy.hpe.com/kr/ko 		|
| https://uat.buy.hpe.com/es/es 		|
| https://uat.buy.hpe.com/at/de 		|
| https://uat.buy.hpe.com/cn/zh 		|
| https://uat.buy.hpe.com/ru/ru 		|
| https://uat.buy.hpe.com/tr/tr 		|
| https://uat.buy.hpe.com/tr/en 		|
| https://uat.buy.hpe.com/in/en 		|
| https://uat.buy.hpe.com/us/en 		|
| https://uat.buy.hpe.com/uk/en 		|
| https://uat.buy.hpe.com/hk/en 		|
| https://uat.buy.hpe.com/nl/en 		|
| https://uat.buy.hpe.com/sg/en 		|
| https://uat.buy.hpe.com/se/en 		|
| https://uat.buy.hpe.com/cz/en 		|
| https://uat.buy.hpe.com/dk/en 		|
| https://uat.buy.hpe.com/fi/en 		|
| https://uat.buy.hpe.com/ie/en 		|
| https://uat.buy.hpe.com/il/en 		|
| https://uat.buy.hpe.com/my/en 		|
| https://uat.buy.hpe.com/no/en 		|
| https://uat.buy.hpe.com/pl/en 		|
| https://uat.buy.hpe.com/pt/en 		|
| https://uat.buy.hpe.com/za/en 		|
| https://uat.buy.hpe.com/emea_europe/en|
| https://uat.buy.hpe.com/lamerica/es	|

@SourceCodeTest2
Scenario Outline: Verify the URL of PLP and SRP after sorting
Given User is on StoreFront homepage with <link>
When User goes to Servers Catalog
And User selects sort by name ascending
Then Basic canonical <link> is displayed in source
And User selects sort by name descending
Then Basic canonical <link> is displayed in source
And User searches for "DL380"
And User selects sort by name ascending
Then Basic canonical <link> is displayed in source
And User selects sort by name descending
Then Basic canonical <link> is displayed in source
Examples:						
| link 									|
| https://uat.buy.hpe.com/ca/fr 		| 
| https://uat.buy.hpe.com/ca/en 		|
| https://uat.buy.hpe.com/tw/zh 		|
| https://uat.buy.hpe.com/tw/en 		|
| https://uat.buy.hpe.com/ch/fr 		|
| https://uat.buy.hpe.com/ch/de 		|
| https://uat.buy.hpe.com/fr/fr 		|
| https://uat.buy.hpe.com/br/pt 		|
| https://uat.buy.hpe.com/it/it 		|
| https://uat.buy.hpe.com/mx/es 		|
| https://uat.buy.hpe.com/kr/ko 		|
| https://uat.buy.hpe.com/es/es 		|
| https://uat.buy.hpe.com/at/de 		|
| https://uat.buy.hpe.com/cn/zh 		|
| https://uat.buy.hpe.com/ru/ru 		|
| https://uat.buy.hpe.com/tr/tr 		|
| https://uat.buy.hpe.com/tr/en 		|
| https://uat.buy.hpe.com/in/en 		|
| https://uat.buy.hpe.com/us/en 		|
| https://uat.buy.hpe.com/uk/en 		|
| https://uat.buy.hpe.com/hk/en 		|
| https://uat.buy.hpe.com/nl/en 		|
| https://uat.buy.hpe.com/sg/en 		|
| https://uat.buy.hpe.com/se/en 		|
| https://uat.buy.hpe.com/cz/en 		|
| https://uat.buy.hpe.com/dk/en 		|
| https://uat.buy.hpe.com/fi/en 		|
| https://uat.buy.hpe.com/ie/en 		|
| https://uat.buy.hpe.com/il/en 		|
| https://uat.buy.hpe.com/my/en 		|
| https://uat.buy.hpe.com/no/en 		|
| https://uat.buy.hpe.com/pl/en 		|
| https://uat.buy.hpe.com/pt/en 		|
| https://uat.buy.hpe.com/za/en 		|
| https://uat.buy.hpe.com/emea_europe/en|
| https://uat.buy.hpe.com/lamerica/es	|

@SourceCodeTest2
Scenario Outline: Verify the URL of PLP URL
Given User is on StoreFront homepage with <link>
When User goes to Servers Catalog
Then PLP URL matches the right format <link>
Examples:						
| link 									|
| https://uat.buy.hpe.com/ca/fr 		| 
| https://uat.buy.hpe.com/ca/en 		|
| https://uat.buy.hpe.com/tw/zh 		|
| https://uat.buy.hpe.com/tw/en 		|
| https://uat.buy.hpe.com/ch/fr 		|
| https://uat.buy.hpe.com/ch/de 		|
| https://uat.buy.hpe.com/fr/fr 		|
| https://uat.buy.hpe.com/br/pt 		|
| https://uat.buy.hpe.com/it/it 		|
| https://uat.buy.hpe.com/mx/es 		|
| https://uat.buy.hpe.com/kr/ko 		|
| https://uat.buy.hpe.com/es/es 		|
| https://uat.buy.hpe.com/at/de 		|
| https://uat.buy.hpe.com/cn/zh 		|
| https://uat.buy.hpe.com/ru/ru 		|
| https://uat.buy.hpe.com/tr/tr 		|
| https://uat.buy.hpe.com/tr/en 		|
| https://uat.buy.hpe.com/in/en 		|
| https://uat.buy.hpe.com/us/en 		|
| https://uat.buy.hpe.com/uk/en 		|
| https://uat.buy.hpe.com/hk/en 		|
| https://uat.buy.hpe.com/nl/en 		|
| https://uat.buy.hpe.com/sg/en 		|
| https://uat.buy.hpe.com/se/en 		|
| https://uat.buy.hpe.com/cz/en 		|
| https://uat.buy.hpe.com/dk/en 		|
| https://uat.buy.hpe.com/fi/en 		|
| https://uat.buy.hpe.com/ie/en 		|
| https://uat.buy.hpe.com/il/en 		|
| https://uat.buy.hpe.com/my/en 		|
| https://uat.buy.hpe.com/no/en 		|
| https://uat.buy.hpe.com/pl/en 		|
| https://uat.buy.hpe.com/pt/en 		|
| https://uat.buy.hpe.com/za/en 		|
| https://uat.buy.hpe.com/emea_europe/en|
| https://uat.buy.hpe.com/lamerica/es	|