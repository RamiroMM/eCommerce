Feature: Sourcecode verifications

@SourceCodeTest1
Scenario Outline: Verify the head tag of the app
Given User is on StoreFront homepage with <link>
Then Head tag has not "B2C" abbreviations
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
| https://uat.buy.hpe.com/tr/en |

@SourceCodeTest
Scenario Outline: Verify the h1 tag in all pages
Given User is on StoreFront homepage with <link>
Then H1 tag is present
When User goes to login page
And User logins with <user> and <password>
Then H1 tag is present
When User goes to Servers Catalog
Then H1 tag is present
And User searches for "DL380"
Then H1 tag is present
And User searches and opens "DL380"
Then H1 tag is present
And User clicks on get quote button
Then H1 tag is present
When User completes the quote request form
Then H1 tag is present
Examples:
| link 							| user 						| password 		|
| https://uat.buy.hpe.com/in/en | 							|				|
| https://uat.buy.hpe.com/uk/en | 							|				|
| https://uat.buy.hpe.com/ca/fr | cnfrfer11@yopmail.com 	| cnfrfer11 	|
| https://uat.buy.hpe.com/ca/en | cnenfer11@yopmail.com 	| cnenfer11 	|
| https://uat.buy.hpe.com/tw/zh | taijuantc11@yopmail.com	| taijuantc11	|
| https://uat.buy.hpe.com/tw/en | taijuan11@yopmail.com 	| taijuan11 	|
| https://uat.buy.hpe.com/ch/fr | swfrfer11@yopmail.com 	| swfrfer11 	|
| https://uat.buy.hpe.com/ch/de | swgrfer11@yopmail.com 	| swgrfer11 	|
| https://uat.buy.hpe.com/fr/fr | frfer11@yopmail.com		| frfer11		|
| https://uat.buy.hpe.com/it/it | itfer11@yopmail.com		| itfer11		|
| https://uat.buy.hpe.com/br/pt | brfer11@yopmail.com		| brfer11		|
| https://uat.buy.hpe.com/mx/es | mxnewfer11@yopmail.com	| mxnewfer11	|
| https://uat.buy.hpe.com/kr/ko | korean11@yopmail.com		| korean11		|
| https://uat.buy.hpe.com/es/es | spaniard11@yopmail.com	| spaniard11	|
| https://uat.buy.hpe.com/at/de | aufer11@yopmail.com		| aufer11		|
| https://uat.buy.hpe.com/cn/zh | chfer11@yopmail.com		| chfer11		|
| https://uat.buy.hpe.com/ru/ru | russiafer11@yopmail.com	| russiafer11	|
| https://uat.buy.hpe.com/tr/tr | turkeyfer11@yopmail.com	| turkeyfer11	|
| https://uat.buy.hpe.com/us/en | usfer11@yopmail.com		| usfer11		|
| https://uat.buy.hpe.com/hk/en | hkfer11@yopmail.com		| hkfer11		|
| https://uat.buy.hpe.com/nl/en | nlfernew11@yopmail.com	| nlfernew11	|
| https://uat.buy.hpe.com/sg/en | sgnewfer11@yopmail.com	| sgnewfer11	|
| https://uat.buy.hpe.com/se/en | swedish11@yopmail.com		| swedish11		| 
| https://uat.buy.hpe.com/cz/en | czfer11@yopmail.com		| czfer11		|
| https://uat.buy.hpe.com/dk/en | dnfer11@yopmail.com		| dnfer11		|
| https://uat.buy.hpe.com/fi/en | flfer11@yopmail.com		| flfer11		|
| https://uat.buy.hpe.com/ie/en | irfer11@yopmail.com		| irfer11		|
| https://uat.buy.hpe.com/il/en | isfer11@yopmail.com		| isfer11		|
| https://uat.buy.hpe.com/my/en | reallybro11@yopmail.com	| reallybro11	|
| https://uat.buy.hpe.com/no/en | nofernew11@yopmail.com	| nofernew11	|
| https://uat.buy.hpe.com/pl/en | plnewfer11@yopmail.com	| plnewfer11	|
| https://uat.buy.hpe.com/pt/en | prennewfer11@yopmail.com	| prennewfer11	|
| https://uat.buy.hpe.com/za/en | newsanewfer11@yopmail.com	| newsanewfer11	|
| https://uat.buy.hpe.com/tr/en | turkeyfer11@yopmail.com	| turkeyfer11	|