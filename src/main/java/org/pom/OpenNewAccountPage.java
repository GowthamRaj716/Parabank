package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.By;

public class OpenNewAccountPage extends BaseClass {

    public By openNewAccLink = By.xpath("//a[text()='Open New Account']");

    public By selectAccountType = By.xpath("//select[@id='type']");

    public By selectAccountNumber = By.xpath("//select[@id='fromAccountId']");

    public By openNewAccButton = By.xpath("//input[@type='submit']");
}

