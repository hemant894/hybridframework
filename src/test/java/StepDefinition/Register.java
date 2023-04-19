package StepDefinition;

import ResultVerification.ResultVerificationForRegisterPage;
import WebEliments.Registerpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {

    ResultVerificationForRegisterPage resultVerificationForRegisterPage =new ResultVerificationForRegisterPage();
    Registerpage registerpage =new Registerpage();

    @Given("^User Enter on Register Link$")
    public void user_Enter_on_Register_Link()
    {resultVerificationForRegisterPage.registerPageTitle();
    }

    @Then("^User Click on Gender$")
    public void user_Click_on_Gender() {
        registerpage.doRegisterGender();
    }
        @Then("^User Enter First Name$")
        public void user_Enter_First_Name() {
        registerpage.doRegisterFirstName();

        }

        @Then("^User Enter Last Name$")
        public void user_Enter_Last_Name() {
        registerpage.doRegisterLastname();

        }

        @Then("^User Enter DateOfBirth$")
        public void user_Enter_DateOfBirth() {
        registerpage.doRegisterDOBday();
        registerpage.doRegisterDOBMonth();
        registerpage.doRegisterDOBYear();
        }
        @Then("^User Enter Email$")
        public void user_Enter_Email() {
        registerpage.doRegisterEmail();
        }

        @Then("^User Enter CompanyName$")
        public void user_Enter_CompanyName() {
        registerpage.doRegisterCompany();
        }

        @Then("^User Enter Select Newsletter$")
        public void user_Enter_Select_Newsletter() {
        registerpage.doRegisterNewsletters();
        }
        @Then("^User Enter Password$")
        public void user_Enter_Password() {
        registerpage.doRegisterpagepassword();
        }
        @Then("^User Confirm Password$")
        public void user_Confirm_Password() {
        registerpage.doRegisterConfirmpassword();
        }

        @Then("^User Click on Register Button$")
        public void user_Click_on_Register_Button() {
        registerpage.doRegisterbutton();
        }

        @Then("^User close the browser$")
        public void user_close_the_browser() {


        }
}
