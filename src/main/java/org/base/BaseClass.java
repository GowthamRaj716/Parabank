package org.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BaseClass {
    public static WebDriver driver;
    public static Select s;
    public static Actions a;
    public static Robot r;
    public static Alert alt;
    public static JavascriptExecutor js;



    public static void selectIndex(WebElement element, int num){
        s = new Select(element);
        s.selectByIndex(num);
    }
    public static void selectValue(WebElement element,String value){
        s = new Select(element);
        s.selectByValue(value);
    }
    public static void selectText(WebElement element,String value){
        s = new Select(element);
        s.selectByVisibleText(value);
    }
    public static void getTxt(WebElement element){
        System.out.println(element.getText());
    }
    public static void moveToElement(WebDriver driver, WebElement element){
        a=new Actions(driver);
        a.moveToElement(element).perform();
    }
    public static void contextClick(WebElement element){
        a=new Actions(driver);
        a.contextClick(element).perform();
    }
    public static void dragAndDrop(WebElement drag, WebElement drop){
        a=new Actions(driver);
        a.dragAndDrop(drag,drop).perform();
    }
    public static void copy(){
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_C);

    }
    public static void paste(){
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
    }
    public static void enter(){
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void alertAccept(){
        alt= driver.switchTo().alert();
        alt.accept();
    }
    public static void alertDismiss(){
        alt= driver.switchTo().alert();
        alt.dismiss();
    }
    public static void getAlertTxt(){
        alt= driver.switchTo().alert();
        String text = alt.getText();
        System.out.println(text);
    }
    public static void alertSend(String name){
        alt= driver.switchTo().alert();
        alt.sendKeys(name);
    }
    public static void frameSwitch(WebElement element){
        driver.switchTo().frame(element);
    }
    public static void parentFrame(){
        driver.switchTo().parentFrame();
    }
    public static void mainFrame(){
        driver.switchTo().defaultContent();
    }
    public static void scrollDown(WebDriver driver,WebElement element){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",element);
    }
    public static void scrollUp(WebElement element){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",element);
    }

    public static void scrollBy(int a,int b){
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(a,b)");
    }
    public static void jsClick(WebDriver driver, WebElement element){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }
    public static void jsSendKey(WebDriver driver, WebElement element, String value){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].sendkeys(value)",element);
    }
    public static void snap(WebDriver driver,String name) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\hp\\IdeaProjects\\ParaBank\\ParaBankSnap\\"+name);
        FileUtils.copyFile(src,dest);
    }
    public static void impWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void parentWinHandle(WebDriver driver){
        String parent = driver.getWindowHandle();
        driver.switchTo().window(parent);
    }

    public static void allWindow(WebDriver driver){
        Set<String> allwin = driver.getWindowHandles();
        Iterator<String> iterator = allwin.iterator();
        String parent = iterator.next();//parent
        String child1 = iterator.next();//child
        driver.switchTo().window(child1);
    }
    public static void closeTab(WebDriver driver){
        driver.close();
    }
}


