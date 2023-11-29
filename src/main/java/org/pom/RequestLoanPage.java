package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.By;

public class RequestLoanPage extends BaseClass {

     public By openRequestLoanLink = By.xpath("//a[text()='Request Loan']");

     public By enterLoanAmount = By.id("amount");

     public By enterDownPayement = By.id("downPayment");

     public By selectLoanAccount = By.id("fromAccountId");

     public By clickApplyNow = By.xpath("//input[@type=\"submit\"]");
}
