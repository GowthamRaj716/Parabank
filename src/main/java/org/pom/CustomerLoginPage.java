package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.By;

public class CustomerLoginPage extends BaseClass {

    public By enterCustomerUsername = By.xpath("//input[@name='username']");

    public By enterCustomerPassword = By.xpath("//input[@name='password']");

    public By clickLogin = By.xpath("//input[@value='Log In']");
}
