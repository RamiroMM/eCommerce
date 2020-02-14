Feature: Verify Error message at account creation with same country existing mail ID 

@eCommTest
Scenario Outline: Verify Error message at account creation with same country existing mail ID
Given User is on StoreFront homepage with <link>
When User goes to login page
When User goes to registration page
When User completes the registration with same country existing <mail> ID <address> <city> <zip>
Then Error is displayed for existing user IDs
Examples:
|link									| address 					  | city 		| zip 	 | mail |				
| https://uat.buy.hpe.com/ca/fr 		| 5150 SPECTRUM WAY SUITE 400 | MISSISSAUGA | L4W5G2 | LX66BkEL6q@yopmail.com |
| https://uat.buy.hpe.com/ca/en 		| 5150 SPECTRUM WAY SUITE 400 | MISSISSAUGA | L4W5G2 | Twf2WEKyPZ@yopmail.com |
| https://uat.buy.hpe.com/tw/zh 		| NO. 66 JĪNGMÀOÈRLÙ 		  | TÁI BĚISHÌ  | 11568  | 24bjxd0Q4Q@yopmail.com |
| https://uat.buy.hpe.com/tw/en 		| NO. 66 JĪNGMÀOÈRLÙ 		  | TÁI BĚISHÌ  | 11568  | RuKU6Zw5Rf@yopmail.com |
| https://uat.buy.hpe.com/ch/fr 		| Ueberlandstrasse 1		  | Duebendorf  | 8600	 | fbBtZCS26j@yopmail.com |
| https://uat.buy.hpe.com/ch/de 		| Ueberlandstrasse 1		  | Duebendorf  | 8600	 | yHLsxRGToc@yopmail.com |
| https://uat.buy.hpe.com/fr/fr 		| 5 AVENUE RAYMOND CHANAS	  | GRENOBLE CEDEX 9 | 38053 | 2bOHvAyJSK@yopmail.com |
| https://uat.buy.hpe.com/br/pt 		| RUA GENERAL FERNANDO BATALHA 13 - CAMPINHO | RIO DE JANEIRO | 21330760 | JkiuB008yp@yopmail.com |
| https://uat.buy.hpe.com/it/it 		| VIA GIUSEPPE DI VITTORIO 9 | CERNUSCO SUL NAVIGLIO | 20063 | XaSUaXJ6j4@yopmail.com |
| https://uat.buy.hpe.com/mx/es 		| castellanos y tapia 117 | Guadalajara | 44730 | SsPAnSYmvB@yopmail.com |
| https://uat.buy.hpe.com/kr/ko 		| 31 Gukjegeumyungro8-Gil | YEONGDEUNGPO-GU | 07332 | GPl7UN5cMM@yopmail.com |
| https://uat.buy.hpe.com/es/es 		| Calle Tanger 66 | BARCELONA | 08018 | 1Zzwas3O2T@yopmail.com |
| https://uat.buy.hpe.com/at/de 		| Paracelsusstrasse 13/11 | Salzburg | 5020 | uFvFQYuTEu@yopmail.com |
| https://uat.buy.hpe.com/cn/zh 		| HǍIYÉLÙ | SHÀNGHǍISHÌ | 201203 | ajBUSnIzdz@yopmail.com |
| https://uat.buy.hpe.com/ru/ru 		| ul. Lermontova 45 | Novosibirsk | 630005 | I1ReuZN7ha@yopmail.com |
| https://uat.buy.hpe.com/tr/tr 		| SARAY MAH. | UEMRANIYE | 34768 | 2Zxg8kJgxg@yopmail.com |
| https://uat.buy.hpe.com/tr/en 		| SARAY MAH. | UEMRANIYE | 34768 | g5wCboFEFo@yopmail.com |
| https://uat.buy.hpe.com/in/en 		| 91 South End Road | Bengaluru | 560004 | 4jJDeFivYP@yopmail.com |
| https://uat.buy.hpe.com/us/en 		| ||||
| https://uat.buy.hpe.com/uk/en 		| 3M Cain Rd | Bracknell | RG12 8HT | MVa98nzRdC@yopmail.com |
| https://uat.buy.hpe.com/hk/en 		|  油麻地加士居道30 號 | HongKong | | N9nAVdHfsr@yopmail.com |
| https://uat.buy.hpe.com/nl/en 		| Stroombaan 16 | AMSTELVEEN | 1181VX | eo7zxafRdf@yopmail.com |
| https://uat.buy.hpe.com/sg/en 		| 452 ALEXANDRA ROAD | SINGAPORE | 119961 | n5pRceJ3MC@yopmail.com |
| https://uat.buy.hpe.com/se/en 		| GUSTAV IIIS BOULEVARD 36 | STOCKHOLM | 16985 | lfCAMvrv6h@yopmail.com |
| https://uat.buy.hpe.com/cz/en 		| Za Brumlovkou 1559/5 | Praha 4 | 140 00 | NBjgmaazCa@yopmail.com |
| https://uat.buy.hpe.com/dk/en 		| Engholm Parkvej 8 | Alleroed | 3450 | CcCVNmy1BR@yopmail.com |
| https://uat.buy.hpe.com/fi/en 		| Piispankalliontie 17 | Espoo | 02200 | UEOVd7IFY8@yopmail.com |
| https://uat.buy.hpe.com/ie/en 		| 2 STONEYHURST | LIMERICK | V94 N56R | 33M79NnWqn@yopmail.com |
| https://uat.buy.hpe.com/il/en 		| 9, Dafna | Ra'anana | 4366223 | QSupsH47Wi@yopmail.com |
| https://uat.buy.hpe.com/my/en 		| 9, Jalan 18/27b | Kuala Lumpur | 53300 | 2vPD0zRszg@yopmail.com |
| https://uat.buy.hpe.com/no/en 		| Rolfsbuktveien 4B | FORNEBU | 1364 | eRg8de2tgk@yopmail.com |
| https://uat.buy.hpe.com/pl/en 		| Ul. Szturmowa 2A | Warszawa | 02-678 | 0nnmiQqZOg@yopmail.com |
| https://uat.buy.hpe.com/pt/en 		| Estrada da Pontinha | Lisboa | 1600-584 | p91WLvKzWB@yopmail.com |
| https://uat.buy.hpe.com/za/en 		| 12 Autumn Street | Sandton | 2191 | F3zPOu8CRH@yopmail.com |
| https://uat.buy.hpe.com/emea_europe/en| Nr.8 Rruga Vaso Pasha | Tirana | 1001 | zQCTtvnhGK@yopmail.com |
| https://uat.buy.hpe.com/lamerica/es	| 44 Coronation Ave | The Valley | 2640 | 4L5zUhlG13@yopmail.com |