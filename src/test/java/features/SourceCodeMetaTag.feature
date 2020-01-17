# new feature
# Tags: optional

Feature: Search for a meta tag

  Scenario Outline: Verify the meta tag "Robots" is found
    Given User is on the homepage with <link>
    And Navigate to "PLP/PDP" page
    And Get the source code elements
    Then Search for the "robot meta tag" name
    And verify content is "follow, index"
    And Verify for checkout pages meta tag is "nofollow,noindex"

    Examples:
    / link /
    | https://uat.buy.hpe.com/ca/fr |