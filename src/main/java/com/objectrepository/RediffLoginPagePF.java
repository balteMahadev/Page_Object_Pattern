package com.objectrepository;/* Mahadev
   01-02-2022
   RediffLoginPage
  */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
    WebDriver driver;

    public RediffLoginPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='login1']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//input[@name='proceed']")
    WebElement signIn;

    public WebElement EmailId() {
        return username;
    }

    public WebElement Password() {
        return password;
    }

    public WebElement Submit() {
        return signIn;
    }


}
