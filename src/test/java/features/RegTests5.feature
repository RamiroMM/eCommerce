Feature: Various Regression Tests

@RegTest1
Scenario Outline: Verify by clicking on configure and quote  button from the carousel in the PDP page
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with <user> and <password>
And User searches and opens "DL380"
When User clicks on Carousel Config and Quote button
Then Channel central config is displayed
Then List Price and <currency> are displayed in carousel for countries <withprice>
Examples:
| link 									| user 	 				 | password 	 | withprice | currency |
| https://uat.buy.hpe.com/ca/fr 		| LX66BkEL6q@yopmail.com | securepass123 | no 	 	 | N/A		|
| https://uat.buy.hpe.com/ca/en 		| Twf2WEKyPZ@yopmail.com | securepass123 | no 	 	 | N/A		|
| https://uat.buy.hpe.com/tw/zh 		| 24bjxd0Q4Q@yopmail.com | securepass123 | no 		 | N/A		|
| https://uat.buy.hpe.com/tw/en 		| RuKU6Zw5Rf@yopmail.com | securepass123 | no 	 	 | N/A		|
| https://uat.buy.hpe.com/ch/fr 		| fbBtZCS26j@yopmail.com | securepass123 | yes 		 | CHF		|
| https://uat.buy.hpe.com/ch/de 		| yHLsxRGToc@yopmail.com | securepass123 | yes 		 | CHF		|
| https://uat.buy.hpe.com/fr/fr 		| 2bOHvAyJSK@yopmail.com | securepass123 | yes		 | €		|
| https://uat.buy.hpe.com/br/pt 		| JkiuB008yp@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/it/it 		| XaSUaXJ6j4@yopmail.com | securepass123 | yes		 | €		|
| https://uat.buy.hpe.com/mx/es 		| SsPAnSYmvB@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/kr/ko 		| GPl7UN5cMM@yopmail.com | securepass123 | no 		 | N/A		|
| https://uat.buy.hpe.com/es/es 		| 1Zzwas3O2T@yopmail.com | securepass123 | yes		 | €		|
| https://uat.buy.hpe.com/at/de 		| uFvFQYuTEu@yopmail.com | securepass123 | yes	 	 | €		|
| https://uat.buy.hpe.com/cn/zh 		| ajBUSnIzdz@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/ru/ru 		| I1ReuZN7ha@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/tr/tr 		| 2Zxg8kJgxg@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/tr/en 		| g5wCboFEFo@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/in/en 		| 4jJDeFivYP@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/us/en 		| bozefillu-0398@yopmail.com | A121212 	 | yes		 | $		|
| https://uat.buy.hpe.com/uk/en 		| MVa98nzRdC@yopmail.com | securepass123 | yes 		 | £	    |
| https://uat.buy.hpe.com/hk/en 		| N9nAVdHfsr@yopmail.com | securepass123 | no	 	 | N/A		|
| https://uat.buy.hpe.com/nl/en 		| eo7zxafRdf@yopmail.com | securepass123 | yes 		 | €		|
| https://uat.buy.hpe.com/sg/en 		| n5pRceJ3MC@yopmail.com | securepass123 | no	 	 | N/A		|
| https://uat.buy.hpe.com/se/en 		| lfCAMvrv6h@yopmail.com | securepass123 | yes		 | kr		|
| https://uat.buy.hpe.com/cz/en 		| NBjgmaazCa@yopmail.com | securepass123 | yes 		 | Kč	    |
| https://uat.buy.hpe.com/dk/en 		| CcCVNmy1BR@yopmail.com | securepass123 | yes	 	 | kr		|
| https://uat.buy.hpe.com/fi/en 		| UEOVd7IFY8@yopmail.com | securepass123 | yes	 	 | €		|
| https://uat.buy.hpe.com/ie/en 		| 33M79NnWqn@yopmail.com | securepass123 | yes	 	 | €		|
| https://uat.buy.hpe.com/il/en 		| QSupsH47Wi@yopmail.com | securepass123 | yes		 | $		|
| https://uat.buy.hpe.com/my/en 		| 2vPD0zRszg@yopmail.com | securepass123 | no	 	 | N/A		|
| https://uat.buy.hpe.com/no/en 		| eRg8de2tgk@yopmail.com | securepass123 | yes		 | kr		|
| https://uat.buy.hpe.com/pl/en 		| 0nnmiQqZOg@yopmail.com | securepass123 | yes		 | zł		|
| https://uat.buy.hpe.com/pt/en 		| p91WLvKzWB@yopmail.com | securepass123 | yes	 	 | €		|
| https://uat.buy.hpe.com/za/en 		| F3zPOu8CRH@yopmail.com | securepass123 | no		 | N/A		|
| https://uat.buy.hpe.com/emea_europe/en| zQCTtvnhGK@yopmail.com | securepass123 | no		 | N/A 		|
| https://uat.buy.hpe.com/lamerica/es	| 4L5zUhlG13@yopmail.com | securepass123 | no		 | N/A	    |

@RegTest1
Scenario Outline: Verify the action of Configure and quote button for the products in the models tab in PDP page
Given User is on StoreFront homepage with <link>
And User searches and opens "DL380"
When User clicks on Config and Quote button
Then Channel central config is displayed
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

@RegTest
Scenario Outline: Verify that config and quote products are not available in option and services tab in PDP
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with <user> and <password>
And User searches and opens "DL380"
When User clicks Options button
Then Config and Quote button is not displayed
When User clicks on services tab
Then Config and Quote button is not displayed
Examples:
| link 									| user 	 				 | password 	 |
| https://uat.buy.hpe.com/ca/fr 		| LX66BkEL6q@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/ca/en 		| Twf2WEKyPZ@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/tw/zh 		| 24bjxd0Q4Q@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/tw/en 		| RuKU6Zw5Rf@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/ch/fr 		| fbBtZCS26j@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/ch/de 		| yHLsxRGToc@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/fr/fr 		| 2bOHvAyJSK@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/br/pt 		| JkiuB008yp@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/it/it 		| XaSUaXJ6j4@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/mx/es 		| SsPAnSYmvB@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/kr/ko 		| GPl7UN5cMM@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/es/es 		| 1Zzwas3O2T@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/at/de 		| uFvFQYuTEu@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/cn/zh 		| ajBUSnIzdz@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/ru/ru 		| I1ReuZN7ha@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/tr/tr 		| 2Zxg8kJgxg@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/tr/en 		| g5wCboFEFo@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/in/en 		| 4jJDeFivYP@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/us/en 		| bozefillu-0398@yopmail.com | A121212 	 |
| https://uat.buy.hpe.com/uk/en 		| MVa98nzRdC@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/hk/en 		| N9nAVdHfsr@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/nl/en 		| eo7zxafRdf@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/sg/en 		| n5pRceJ3MC@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/se/en 		| lfCAMvrv6h@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/cz/en 		| NBjgmaazCa@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/dk/en 		| CcCVNmy1BR@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/fi/en 		| UEOVd7IFY8@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/ie/en 		| 33M79NnWqn@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/il/en 		| QSupsH47Wi@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/my/en 		| 2vPD0zRszg@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/no/en 		| eRg8de2tgk@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/pl/en 		| 0nnmiQqZOg@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/pt/en 		| p91WLvKzWB@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/za/en 		| F3zPOu8CRH@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/emea_europe/en| zQCTtvnhGK@yopmail.com | securepass123 |
| https://uat.buy.hpe.com/lamerica/es	| 4L5zUhlG13@yopmail.com | securepass123 |