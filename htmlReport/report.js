$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Nopcommerce Login Test",
  "description": "",
  "id": "nopcommerce-login;nopcommerce-login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on login page and verify the Login page Title",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter Username and Password and click on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Homepage of User",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});