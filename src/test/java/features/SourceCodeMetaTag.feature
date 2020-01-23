Feature: Search for a meta tag

  @SourceMetaTag

  Scenario Outline: Verify the meta tag "Robots" is found
    Given User is on the homepage with <link> and login
    And Navigate to PLP-PDP page
    Then Search for the robot meta tag name


    Examples:
      | link |
    | https://uat.buy.hpe.com/ca/fr |