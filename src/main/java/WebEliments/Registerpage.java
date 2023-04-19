package WebEliments;

import Comonpages.LoadProperty;
import Comonpages.Utils;
import org.openqa.selenium.By;

public class Registerpage extends Utils {

    LoadProperty loadProperty =new LoadProperty();


    private By _Gender =By.id("gender-male");
    private By _Firstname = By.id("FirstName");
    private By _Lastname = By.id("LastName");
    private By _DOBDay =By.className("valid");
    private By _DOBMonth = By.className("valid");
    private By _DOBYear =By.className("valid");
    private By _Email =By.id("Email");
    private By _Company =By.id(("Company"));
    private By _NewsLetters = By.id("Newsletter");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _RegisterButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[5]/button");

    public void doRegisterGender() {
        enterText(_Gender, loadProperty.getProperty("Gender"));
    }
    public void doRegisterFirstName(){
        enterText(_Firstname,loadProperty.getProperty("FirstName"));}

    public void doRegisterLastname(){
        enterText(_Lastname,loadProperty.getProperty("LastName"));}
    public void doRegisterDOBday(){
        enterText(_DOBDay,loadProperty.getProperty("DateofBirthDay"));}
    public void doRegisterDOBMonth(){
        enterText(_DOBMonth,loadProperty.getProperty("DateOfBirthMonth"));}
    public void doRegisterDOBYear(){
        enterText(_DOBYear,loadProperty.getProperty("DateOfBirthYea"));}
    public void doRegisterEmail(){
        enterText(_Email,loadProperty.getProperty("Email"));}
    public void doRegisterCompany(){
        enterText(_Company,loadProperty.getProperty("CompanyName"));}
    public void doRegisterNewsletters(){
        clickOnElement(_NewsLetters);}
    public void doRegisterpagepassword (){
        enterText(_Password,loadProperty.getProperty("Password"));}
    public void doRegisterConfirmpassword(){
        enterText(_ConfirmPassword,loadProperty.getProperty("ConfirmPassword"));}
    public void doRegisterbutton(){
        clickOnElement(_RegisterButton);

    }

}
