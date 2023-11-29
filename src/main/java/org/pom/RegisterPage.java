package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.By;

public class RegisterPage extends BaseClass {

    public By registerlink = By.xpath("//a[text()='Register']");

    public  By firstName = By.id("customer.firstName");

    public  By lastName = By.id("customer.lastName");

    public  By address = By.id("customer.address.street");

    public  By city = By.id("customer.address.city");

    public  By state = By.id("customer.address.state");

    public  By zipCode = By.id("customer.address.zipCode");

    public  By phoneNo = By.id("customer.phoneNumber");

    public  By SSNnumber = By.id("customer.ssn");

    public  By userName = By.id("customer.username");

    public  By password = By.id("customer.password");

    public  By confirmPassword = By.id("repeatedPassword");

    public  By registerButton = By.xpath("//input[@value='Register']");






}
