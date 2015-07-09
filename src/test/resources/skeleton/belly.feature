Feature: Belly

  Scenario: a few cukes
    Given У меня 42 огурцов в животе
    When I wait 1 hour
    Then my belly should growl
