
 Feature: As a OSA consulting tech user, I should be able to login their forum.

 Scenario Outline: As a OSA consulting tech student, 
  I should be able to login their osa by using valid 
  username and password
 	Given I navigate to OSA forum page
    And I enter username <user> and password <pass>
    When I click on login button
    Then I verify that the forum student page is displayed
    Examples:
    |user |	 pass|
    |"nur.alamin@osaconsultingtech.com" |"7469Nur1989"|
    |"md.mostofa@osaconsultingtech.com"  |"5300Md1987"|
    |"md.hossain@osaconsultingtech.com"|"9166Md1991"|
    |"sheikh.imon@osaconsultiogtech.com"|"2917Sheikh1987"|
      
