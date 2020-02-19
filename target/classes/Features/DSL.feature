Feature: Verivox DSL feature Test

Scenario Outline: Verify DSL Result List

Given User is on Verivox main page
When he is on DSL vergleich
And he enters "<IhreVorwahl>" and "<Bandwidth>" and clicks on JETZT VERGLEICHEN
Then he is able to see all the available tariffs in the Tariffs page

Examples:

   | IhreVorwahl | Bandwidth |
   |      030    |    16     |


Scenario: Verify Offer Detail Page

Given User is on the DSL Result List page
When he selects one of the listed Tariffs and clicks on mehr zum Tarif button
Then he should be able see the details of the selected Tariff
And he should also see a button labeled as In five Minuten online wechseln


Scenario: Verify Offer Detail Page

Given User is on the DSL Result List 
When there are more than twenty tariffs available 
And user clicks on this link
Then the list should be appended with next twenty tariffs and so on until all Tariffs are loaded
 


