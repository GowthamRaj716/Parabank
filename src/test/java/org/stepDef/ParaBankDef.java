package org.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.*;

import java.io.IOException;

public class ParaBankDef extends BaseClass {

    RegisterPage registrationDetail = new RegisterPage();

    @Given("user enter parabank url")
    public void user_enter_parabank_url() {
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @When("user click register link")
    public void user_click_register_link() {
        driver.findElement(registrationDetail.registerlink).click();

    }
    @When("user enter all the required details")
    public void user_enter_all_the_required_details() {
        driver.findElement(registrationDetail.firstName).sendKeys("Gowtham");
        driver.findElement(registrationDetail.lastName).sendKeys("J");
        driver.findElement(registrationDetail.address).sendKeys("Alagiri Nagar");
        driver.findElement(registrationDetail.city).sendKeys("Dubai");
        driver.findElement(registrationDetail.state).sendKeys("UAE");
        driver.findElement(registrationDetail.zipCode).sendKeys("345671");
        driver.findElement(registrationDetail.phoneNo).sendKeys("+971 6572784");
        driver.findElement(registrationDetail.SSNnumber).sendKeys("952168345");


    }
    @When("user giver username and set password")
    public void user_giver_username_and_set_password() {
        driver.findElement(registrationDetail.userName).sendKeys("gowthamj716");
        driver.findElement(registrationDetail.password).sendKeys("harry12345");
        driver.findElement(registrationDetail.confirmPassword).sendKeys("harry12345");

    }
    @Then("user click register button")
    public void user_click_register_button() throws IOException {

        snap(driver,"registerDetails.png");
        driver.findElement(registrationDetail.registerButton).click();
        snap(driver,"registerResult.png");

    }

    CustomerLoginPage loginDetails = new CustomerLoginPage();

    @Given("To launch parabank url to login")
    public void toLaunchParabankUrlToLogin() {
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("user enter customer login username")
    public void user_enter_customer_login_username() {
        impWait(driver);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(loginDetails.enterCustomerUsername).sendKeys("gowthamj716");


    }
    @When("user enter customer login password")
    public void user_enter_customer_login_password() {
        driver.findElement(loginDetails.enterCustomerPassword).sendKeys("harry12345");

    }
    @Then("user click customer login button")
    public void user_click_customer_login_button() throws IOException {
        driver.findElement(loginDetails.clickLogin).click();
        snap(driver,"loginDetail.png");
    }

    OpenNewAccountPage newAccount = new OpenNewAccountPage();
    @When("user click open new account")
    public void user_click_open_new_account() {
        driver.findElement(newAccount.openNewAccLink).click();

    }
    @When("user select account type")
    public void user_select_account_type() {
        WebElement accType = driver.findElement(newAccount.selectAccountType);
        selectText(accType,"SAVINGS");

    }
    @When("user select account to transfer")
    public void user_select_account_to_transfer() {
        impWait(driver);
        WebElement accNumber = driver.findElement(newAccount.selectAccountNumber);
        selectIndex(accNumber,0);

    }
    @Then("user click create new account button")
    public void user_click_create_new_account_button() throws IOException {
        snap(driver,"newAccount.png");
        driver.findElement(newAccount.openNewAccButton).click();

    }

    FundTransferPage transferFund = new FundTransferPage();

    @When("user click transfer fund link")
    public void user_click_transfer_fund_link() {
        driver.findElement(transferFund.transferFundLink).click();

    }
    @When("user enter the amount to transfer")
    public void user_enter_the_amount_to_transfer() {
        driver.findElement(transferFund.amountToTransfer).sendKeys("5000");

    }

    @Then("user click transfer button")
    public void user_click_transfer_button() throws IOException {
        snap(driver,"transferFund.png");
        driver.findElement(transferFund.transferButton).click();

    }

    BillPayPage billPay = new BillPayPage();
    @When("user click Bill pay link")
    public void user_click_bill_pay_link() {
        driver.findElement(billPay.billPayLink).click();
    }
    @When("user enter details of payee")
    public void user_enter_details_of_payee() {
        driver.findElement(billPay.payeeName).sendKeys("rajesh");
        driver.findElement(billPay.payeeAddress).sendKeys("norwich");
        driver.findElement(billPay.payeeCity).sendKeys("London");
        driver.findElement(billPay.payeeState).sendKeys("UnitedKingdom");
        driver.findElement(billPay.payeeZipCode).sendKeys("278");
        driver.findElement(billPay.payeePhoneNo).sendKeys("+682 5683845");

    }
    @When("user enter account number and enter amount")
    public void user_enter_account_number_and_enter_amount() {
        driver.findElement(billPay.payeeAccount).sendKeys("635271");
        driver.findElement(billPay.verifyAccount).sendKeys("635271");
        driver.findElement(billPay.amountToTransfer).sendKeys("5000");

    }
    @When("user select from account")
    public void user_select_from_account() {
        WebElement selectAccount = driver.findElement(billPay.selectAccountToTransfer);
        selectIndex(selectAccount,1);


    }
    @Then("user click send payment button")
    public void user_click_send_payment_button() throws IOException {
        snap(driver,"payeeDetails.png");
        driver.findElement(billPay.sendPaymentButton).click();
        snap(driver,"paymentResult.png");

    }

    RequestLoanPage loanRequest = new RequestLoanPage();

    @When("user click request loan link")
    public void user_click_request_loan_link() {
        driver.findElement(loanRequest.openRequestLoanLink).click();

    }
    @When("user enter required loan amount and give down payment")
    public void user_enter_required_loan_amount_and_give_down_payment() {
        driver.findElement(loanRequest.enterLoanAmount).sendKeys("20000");
        driver.findElement(loanRequest.enterDownPayement).sendKeys("5000");

    }
    @When("user select account for loan")
    public void user_select_account_for_loan() {
        WebElement loanAccount = driver.findElement(loanRequest.selectLoanAccount);
        selectIndex(loanAccount,1);


    }
    @Then("user click apply now button")
    public void user_click_apply_now_button() throws IOException {
        driver.findElement(loanRequest.clickApplyNow).click();
        snap(driver,"loanResult.png");

    }

    LogoutPage logout = new LogoutPage();

    @When("user click logout link")
    public void userClickLogoutLink() {
        driver.findElement(logout.logoutParabank).click();
    }
}

