Feature: Various Regression Tests

@RegTest
Scenario Outline: Verify if user able to sign out of the site
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with <user> and <password>
When User clicks logout button
Then Home page <link> is loaded and Logout message is displayed
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