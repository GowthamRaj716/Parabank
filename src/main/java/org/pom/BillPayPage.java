package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.By;

public class BillPayPage extends BaseClass {

    public By billPayLink = By.xpath("//a[text()='Bill Pay']");

    public By payeeName = By.xpath("//input[@name=\"payee.name\"]");

    public By payeeAddress = By.xpath("//input[@name=\"payee.address.street\"]");

    public By payeeCity = By.xpath("//input[@name=\"payee.address.city\"]");

    public By payeeState = By.xpath("//input[@name=\"payee.address.state\"]");

    public By payeeZipCode = By.xpath("//input[@name=\"payee.address.zipCode\"]");

    public By payeePhoneNo = By.xpath("//input[@name=\"payee.phoneNumber\"]");

    public By payeeAccount = By.xpath("//input[@name=\"payee.accountNumber\"]");

    public By verifyAccount = By.xpath("//input[@name=\"verifyAccount\"]");

    public By amountToTransfer = By.xpath("//input[@name=\"amount\"]");

    public By selectAccountToTransfer = By.xpath("//select[@name=\"fromAccountId\"]");

    public By sendPaymentButton = By.xpath("//input[@type=\"submit\"]");


}
