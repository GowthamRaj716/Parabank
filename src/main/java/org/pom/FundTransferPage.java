package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.By;

public class FundTransferPage extends BaseClass {

    public By transferFundLink = By.xpath("//a[text()='Transfer Funds']");

    public By amountToTransfer = By.id("amount");

    public By transferButton = By.xpath("//input[@class='button']");

}
