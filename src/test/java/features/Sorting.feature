Feature: Sorting options

@SortingTest
Scenario Outline: Verify if user is able to sort the results of a product search
Given User is on StoreFront homepage with <link>
When User goes to login page
And User logins with "isao.palacios.canadaen@yopmail.com" and "Moloko66"
And User searches for "DL380"
Then Relevance sorting is selected by default
And User selects sort by name ascending
Then Name ascending sorting is displayed
And User selects sort by name descending
Then Name descending sorting is displayed
Examples:
| link |
| https://uat.buy.hpe.com/fr/fr |