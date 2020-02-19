$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/Users/Lipika/Desktop/Selenium/Work/VerivoxTestAutomationTask/src/main/java/Features/DSL.feature");
formatter.feature({
  "name": "Verivox DSL feature Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify DSL Result List",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Verivox main page",
  "keyword": "Given "
});
formatter.step({
  "name": "he is on DSL vergleich",
  "keyword": "When "
});
formatter.step({
  "name": "he enters \"\u003cIhreVorwahl\u003e\" and \"\u003cBandwidth\u003e\" and clicks on JETZT VERGLEICHEN",
  "keyword": "And "
});
formatter.step({
  "name": "he is able to see all the available tariffs in the Tariffs page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "IhreVorwahl",
        "Bandwidth"
      ]
    },
    {
      "cells": [
        "030",
        "16"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify DSL Result List",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Verivox main page",
  "keyword": "Given "
});
formatter.match({
  "location": "DSLVergleich.user_on_Verivox_main_page()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: VERIVOX | Tarife vergleichen \u0026 stressfrei sparen! expected:\u003c[VERIVOX | Tarife vergleichen \u0026 stressfrei sparen]!\u003e but was:\u003c[Title doesn\u0027t match!]!\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat stepDefinitions.DSLVergleich.user_on_Verivox_main_page(DSLVergleich.java:88)\n\tat ✽.User is on Verivox main page(file:/Users/Lipika/Desktop/Selenium/Work/VerivoxTestAutomationTask/src/main/java/Features/DSL.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "he is on DSL vergleich",
  "keyword": "When "
});
formatter.match({
  "location": "DSLVergleich.he_is_on_DSL_vergleich()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he enters \"030\" and \"16\" and clicks on JETZT VERGLEICHEN",
  "keyword": "And "
});
formatter.match({
  "location": "DSLVergleich.he_enters_Ihre_Vorwahl_and_bandwidth(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he is able to see all the available tariffs in the Tariffs page",
  "keyword": "Then "
});
formatter.match({
  "location": "DSLVergleich.view_available_tariffs_Tariffs_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Offer Detail Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the DSL Result List page",
  "keyword": "Given "
});
formatter.match({
  "location": "DSLVergleich.user_is_on_the_DSL_Result_List_page()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: VERIVOX | Tarife vergleichen \u0026 stressfrei sparen! expected:\u003c[DSL-Preisvergleich aller DSL-Anbieter in Deutschland]\u003e but was:\u003c[Title doesn\u0027t match!!]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat stepDefinitions.DSLVergleich.user_is_on_the_DSL_Result_List_page(DSLVergleich.java:140)\n\tat ✽.User is on the DSL Result List page(file:/Users/Lipika/Desktop/Selenium/Work/VerivoxTestAutomationTask/src/main/java/Features/DSL.feature:18)\n",
  "status": "failed"
});
formatter.step({
  "name": "he selects one of the listed Tariffs and clicks on mehr zum Tarif button",
  "keyword": "When "
});
formatter.match({
  "location": "DSLVergleich.selects_one_of_the_listed_Tariffs()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he should be able see the details of the selected Tariff",
  "keyword": "Then "
});
formatter.match({
  "location": "DSLVergleich.see_the_details_of_the_selected_Tariff()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he should also see a button labeled as In five Minuten online wechseln",
  "keyword": "And "
});
formatter.match({
  "location": "DSLVergleich.In_Five_Minuten_online_wechseln()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Offer Detail Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the DSL Result List",
  "keyword": "Given "
});
formatter.match({
  "location": "DSLVergleich.user_is_on_the_DSL_Result_List()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: VERIVOX | Tarife vergleichen \u0026 stressfrei sparen! expected:\u003c[DSL-Preisvergleich aller DSL-Anbieter in Deutschland]\u003e but was:\u003c[Title doesn\u0027t match!!]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat stepDefinitions.DSLVergleich.user_is_on_the_DSL_Result_List(DSLVergleich.java:174)\n\tat ✽.User is on the DSL Result List(file:/Users/Lipika/Desktop/Selenium/Work/VerivoxTestAutomationTask/src/main/java/Features/DSL.feature:26)\n",
  "status": "failed"
});
formatter.step({
  "name": "there are more than twenty tariffs available",
  "keyword": "When "
});
formatter.match({
  "location": "DSLVergleich.user_should_click_on_the_tariff_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on this link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the list should be appended with next twenty tariffs and so on until all Tariffs are loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "DSLVergleich.click_until_all_Tariffs_are_loaded()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});