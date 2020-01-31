Feature: Sourcecode verifications

@SourceCodeTest4
Scenario Outline: Verify the URL of PLP URL
Given User is on StoreFront homepage with <link>
Then URL contains <code>
Examples:						
| link 									| code 	 |
| https://uat.buy.hpe.com/ca/fr 		| /ca/fr |
| https://uat.buy.hpe.com/ca/en 		| /ca/en |
| https://uat.buy.hpe.com/tw/zh 		| /tw/zh |
| https://uat.buy.hpe.com/tw/en 		| /tw/en |
| https://uat.buy.hpe.com/ch/fr 		| /ch/fr |
| https://uat.buy.hpe.com/ch/de 		| /ch/de |
| https://uat.buy.hpe.com/fr/fr 		| /fr/fr |
| https://uat.buy.hpe.com/br/pt 		| /br/pt |
| https://uat.buy.hpe.com/it/it 		| /it/it |
| https://uat.buy.hpe.com/mx/es 		| /mx/es |
| https://uat.buy.hpe.com/kr/ko 		| /kr/ko |
| https://uat.buy.hpe.com/es/es 		| /es/es |
| https://uat.buy.hpe.com/at/de 		| /at/de |
| https://uat.buy.hpe.com/cn/zh 		| /cn/zh |
| https://uat.buy.hpe.com/ru/ru 		| /ru/ru |
| https://uat.buy.hpe.com/tr/tr 		| /tr/tr |
| https://uat.buy.hpe.com/tr/en 		| /tr/en |
| https://uat.buy.hpe.com/in/en 		| /in/en |
| https://uat.buy.hpe.com/us/en 		| /us/en |
| https://uat.buy.hpe.com/uk/en 		| /uk/en |
| https://uat.buy.hpe.com/hk/en 		| /hk/en |
| https://uat.buy.hpe.com/nl/en 		| /nl/en |
| https://uat.buy.hpe.com/sg/en 		| /sg/en |
| https://uat.buy.hpe.com/se/en 		| /se/en |
| https://uat.buy.hpe.com/cz/en 		| /cz/en |
| https://uat.buy.hpe.com/dk/en 		| /dk/en |
| https://uat.buy.hpe.com/fi/en 		| /fi/en |
| https://uat.buy.hpe.com/ie/en 		| /ie/en |
| https://uat.buy.hpe.com/il/en 		| /il/en |
| https://uat.buy.hpe.com/my/en 		| /my/en |
| https://uat.buy.hpe.com/no/en 		| /no/en |
| https://uat.buy.hpe.com/pl/en 		| /pl/en |
| https://uat.buy.hpe.com/pt/en 		| /pt/en |
| https://uat.buy.hpe.com/za/en 		| /za/en |
| https://uat.buy.hpe.com/emea_europe/en| /emea_europe/en |
| https://uat.buy.hpe.com/lamerica/es	| /lamerica/es	  |

@SourceCodeTest
Scenario Outline: Verify the capital letter in URL
Given User is on StoreFront homepage with <link>
Then URL does not contain capital letters or underscores
When User goes to login page
Then URL does not contain capital letters or underscores
When User goes to registration page
Then URL does not contain capital letters or underscores
When User completes registration <address> <city> <zip>
Then URL does not contain capital letters or underscores
When User goes to Servers Catalog
Then URL does not contain capital letters or underscores
And User searches for "dl380"
Then URL does not contain capital letters or underscores
And User searches and opens "dl380"
Then URL does not contain capital letters or underscores
And User clicks on get quote button
Then URL does not contain capital letters or underscores
When User fills up the form
When User clicks on get quote
Then URL does not contain capital letters or underscores
Examples:
|link									| address 					  | city 		| zip 	 |				
| https://uat.buy.hpe.com/ca/fr 		| 5150 SPECTRUM WAY SUITE 400 | MISSISSAUGA | L4W5G2 |
| https://uat.buy.hpe.com/ca/en 		| 5150 SPECTRUM WAY SUITE 400 | MISSISSAUGA | L4W5G2 |
| https://uat.buy.hpe.com/tw/zh 		| NO. 66 JĪNGMÀOÈRLÙ 		  | TÁI BĚISHÌ  | 11568  |
| https://uat.buy.hpe.com/tw/en 		| NO. 66 JĪNGMÀOÈRLÙ 		  | TÁI BĚISHÌ  | 11568  |
| https://uat.buy.hpe.com/ch/fr 		| Ueberlandstrasse 1		  | Duebendorf  | 8600	 |
| https://uat.buy.hpe.com/ch/de 		| Ueberlandstrasse 1		  | Duebendorf  | 8600	 |
| https://uat.buy.hpe.com/fr/fr 		| 5 AVENUE RAYMOND CHANAS	  | GRENOBLE CEDEX 9 | 38053 |
| https://uat.buy.hpe.com/br/pt 		| RUA GENERAL FERNANDO BATALHA 13 - CAMPINHO | RIO DE JANEIRO | 21330760 |
| https://uat.buy.hpe.com/it/it 		| VIA GIUSEPPE DI VITTORIO 9 | CERNUSCO SUL NAVIGLIO | 20063 |
| https://uat.buy.hpe.com/mx/es 		| castellanos y tapia 117 | Guadalajara | 44730 |
| https://uat.buy.hpe.com/kr/ko 		| 31 Gukjegeumyungro8-Gil | YEONGDEUNGPO-GU | 07332 |
| https://uat.buy.hpe.com/es/es 		| Calle Tanger 66 | BARCELONA | 08018 |
| https://uat.buy.hpe.com/at/de 		| Paracelsusstrasse 13/11 | Salzburg | 5020 |
| https://uat.buy.hpe.com/cn/zh 		| HǍIYÉLÙ | SHÀNGHǍISHÌ | 201203 |
| https://uat.buy.hpe.com/ru/ru 		| ul. Lermontova 45 | Novosibirsk | 630005 |
| https://uat.buy.hpe.com/tr/tr 		| SARAY MAH. | UEMRANIYE | 34768 |
| https://uat.buy.hpe.com/tr/en 		| SARAY MAH. | UEMRANIYE | 34768 |
| https://uat.buy.hpe.com/in/en 		| 91 South End Road | Bengaluru | 560004 |
| https://uat.buy.hpe.com/us/en 		| |||
| https://uat.buy.hpe.com/uk/en 		| 3M Cain Rd | Bracknell | RG12 8HT |
| https://uat.buy.hpe.com/hk/en 		|  油麻地加士居道30 號 | HongKong | |
| https://uat.buy.hpe.com/nl/en 		| Stroombaan 16 | AMSTELVEEN | 1181VX |
| https://uat.buy.hpe.com/sg/en 		| 452 ALEXANDRA ROAD | SINGAPORE | 119961 |
| https://uat.buy.hpe.com/se/en 		| GUSTAV IIIS BOULEVARD 36 | STOCKHOLM | 16985 |
| https://uat.buy.hpe.com/cz/en 		| Za Brumlovkou 1559/5 | Praha 4 | 140 00 |
| https://uat.buy.hpe.com/dk/en 		| Engholm Parkvej 8 | Alleroed | 3450 |
| https://uat.buy.hpe.com/fi/en 		| Piispankalliontie 17 | Espoo | 02200 |
| https://uat.buy.hpe.com/ie/en 		| 2 STONEYHURST | LIMERICK | V94 N56R |
| https://uat.buy.hpe.com/il/en 		| 9, Dafna | Ra'anana | 4366223 |
| https://uat.buy.hpe.com/my/en 		| 9, Jalan 18/27b | Kuala Lumpur | 53300 |
| https://uat.buy.hpe.com/no/en 		| Rolfsbuktveien 4B | FORNEBU | 1364 |
| https://uat.buy.hpe.com/pl/en 		| Ul. Szturmowa 2A | Warszawa | 02-678 |
| https://uat.buy.hpe.com/pt/en 		| Estrada da Pontinha | Lisboa | 1600-584 |
| https://uat.buy.hpe.com/za/en 		| 12 Autumn Street | Sandton | 2191 |
| https://uat.buy.hpe.com/emea_europe/en| Nr.8 Rruga Vaso Pasha | Tirana | 1001 |
| https://uat.buy.hpe.com/lamerica/es	| 44 Coronation Ave | The Valley | 2640 |