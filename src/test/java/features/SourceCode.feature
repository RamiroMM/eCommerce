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
| link 							| user 					| password 	|
| https://uat.buy.hpe.com/ca/fr | cnfrfer11@yopmail.com | cnfrfer11 |
