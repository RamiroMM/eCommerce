Feature: Login options

@eCommTest1
Scenario Outline: Verify user is able to navigate to PLP by selecting Catalog Category
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with <user> and <password>
When User goes to Servers Catalog
Then List Price is displayed for countries <withprice>
Then <currency> is displayed according to country
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

@eCommTest1
Scenario Outline: Verify the display of price
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with <user> and <password>
When User goes to Servers Catalog
Then List Price is displayed for countries <withprice>
Then VAT is displayed in PLP for countries <withprice>
When User opens first result
Then VAT is displayed in PDP for countries <withprice>
# And User searches and opens "DL380"
# And User clicks on get quote button
# When User fills up the form
# When User clicks on get quote
# Then VAT is displayed in Summary Page for countries <withprice>
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

@eCommTest
Scenario Outline: Verify the number of products per page
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with <user> and <password>
And User searches and opens "DL380"
And User selects twenty articles per page
When User clicks on Config and Quote button
Then Channel central config is displayed
And Articles per page is "20"
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