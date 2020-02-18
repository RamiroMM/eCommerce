Feature: Login options

@eCommTest1
Scenario Outline: Verify metatags for country code and language
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with <user> and <password>
Then Head tag has <title>
Then <countrycode> and <lang> are displayed in sourcecode
When User goes to Servers Catalog
Then Head tag has <title>
Then <countrycode> and <lang> are displayed in sourcecode
And User searches and opens "DL380"
Then Head tag has <title>
Then <countrycode> and <lang> are displayed in sourcecode
Examples:
| link 									| user 	 				 | password 	 | title 				 | countrycode | lang |
| https://uat.buy.hpe.com/ca/fr 		| LX66BkEL6q@yopmail.com | securepass123 | HPE Store Canada 	 | ca		   | fr	  |
| https://uat.buy.hpe.com/ca/en 		| Twf2WEKyPZ@yopmail.com | securepass123 | HPE Store Canada 	 | ca		   | en	  |
| https://uat.buy.hpe.com/tw/zh 		| 24bjxd0Q4Q@yopmail.com | securepass123 | HPE Store Taiwan 	 | tw		   | zh	  |
| https://uat.buy.hpe.com/tw/en 		| RuKU6Zw5Rf@yopmail.com | securepass123 | HPE Store Taiwan 	 | tw		   | en	  |
| https://uat.buy.hpe.com/ch/fr 		| fbBtZCS26j@yopmail.com | securepass123 | HPE Store Switzerland | ch		   | fr	  |
| https://uat.buy.hpe.com/ch/de 		| yHLsxRGToc@yopmail.com | securepass123 | HPE Store Switzerland | ch		   | de	  |
| https://uat.buy.hpe.com/fr/fr 		| 2bOHvAyJSK@yopmail.com | securepass123 | HPE Store France		 | fr		   | fr	  |
| https://uat.buy.hpe.com/br/pt 		| JkiuB008yp@yopmail.com | securepass123 | HPE Store Brazil		 | br		   | pt	  |
| https://uat.buy.hpe.com/it/it 		| XaSUaXJ6j4@yopmail.com | securepass123 | HPE Store Italy		 | it		   | it	  |
| https://uat.buy.hpe.com/mx/es 		| SsPAnSYmvB@yopmail.com | securepass123 | HPE Store Mexico		 | mx		   | es	  |
| https://uat.buy.hpe.com/kr/ko 		| GPl7UN5cMM@yopmail.com | securepass123 | HPE Store South Korea | kr		   | ko	  |
| https://uat.buy.hpe.com/es/es 		| 1Zzwas3O2T@yopmail.com | securepass123 | HPE Store Spain		 | es		   | es	  |
| https://uat.buy.hpe.com/at/de 		| uFvFQYuTEu@yopmail.com | securepass123 | HPE Store Austria	 | at		   | de	  |
| https://uat.buy.hpe.com/cn/zh 		| ajBUSnIzdz@yopmail.com | securepass123 | HPE Store China		 | cn		   | zh	  |
| https://uat.buy.hpe.com/ru/ru 		| I1ReuZN7ha@yopmail.com | securepass123 | HPE Store Russia		 | ru		   | ru	  |
| https://uat.buy.hpe.com/tr/tr 		| 2Zxg8kJgxg@yopmail.com | securepass123 | HPE Store Turkey		 | tr		   | tr	  |
| https://uat.buy.hpe.com/tr/en 		| g5wCboFEFo@yopmail.com | securepass123 | HPE Store Turkey		 | tr		   | en	  |
| https://uat.buy.hpe.com/in/en 		| 4jJDeFivYP@yopmail.com | securepass123 | HPE Store India		 | in		   | en	  |
| https://uat.buy.hpe.com/us/en 		| bozefillu-0398@yopmail.com | A121212 	 | HPE Store US			 | us		   | en	  |
| https://uat.buy.hpe.com/uk/en 		| MVa98nzRdC@yopmail.com | securepass123 | HPE Store United Kingdom | uk	   | en	  |
| https://uat.buy.hpe.com/hk/en 		| N9nAVdHfsr@yopmail.com | securepass123 | HPE Store Hong Kong	 | hk		   | en	  |
| https://uat.buy.hpe.com/nl/en 		| eo7zxafRdf@yopmail.com | securepass123 | HPE Store Netherlands | nl		   | en	  |
| https://uat.buy.hpe.com/sg/en 		| n5pRceJ3MC@yopmail.com | securepass123 | HPE Store Singapore	 | sg		   | en	  |
| https://uat.buy.hpe.com/se/en 		| lfCAMvrv6h@yopmail.com | securepass123 | HPE Store Sweden		 | se		   | en	  |
| https://uat.buy.hpe.com/cz/en 		| NBjgmaazCa@yopmail.com | securepass123 | HPE Store Czech Republic | cz	   | en	  |
| https://uat.buy.hpe.com/dk/en 		| CcCVNmy1BR@yopmail.com | securepass123 | HPE Store Denmark	 | dk		   | en	  |
| https://uat.buy.hpe.com/fi/en 		| UEOVd7IFY8@yopmail.com | securepass123 | HPE Store Finland	 | fi		   | en	  |
| https://uat.buy.hpe.com/ie/en 		| 33M79NnWqn@yopmail.com | securepass123 | HPE Store Ireland	 | ie		   | en	  |
| https://uat.buy.hpe.com/il/en 		| QSupsH47Wi@yopmail.com | securepass123 | HPE Store Israel		 | il		   | en	  |
| https://uat.buy.hpe.com/my/en 		| 2vPD0zRszg@yopmail.com | securepass123 | HPE Store Malaysia	 | my		   | en	  |
| https://uat.buy.hpe.com/no/en 		| eRg8de2tgk@yopmail.com | securepass123 | HPE Store Norway		 | no		   | en	  |
| https://uat.buy.hpe.com/pl/en 		| 0nnmiQqZOg@yopmail.com | securepass123 | HPE Store Poland		 | pl		   | en	  |
| https://uat.buy.hpe.com/pt/en 		| p91WLvKzWB@yopmail.com | securepass123 | HPE Store Portugal	 | pt		   | en	  |
| https://uat.buy.hpe.com/za/en 		| F3zPOu8CRH@yopmail.com | securepass123 | HPE Store South Africa| za		   | en	  |
| https://uat.buy.hpe.com/emea_europe/en| zQCTtvnhGK@yopmail.com | securepass123 | HPE Store EMEA		 | emea_europe | en	  |
| https://uat.buy.hpe.com/lamerica/es	| 4L5zUhlG13@yopmail.com | securepass123 | HPE Store LAR		 | lamerica	   | es	  |