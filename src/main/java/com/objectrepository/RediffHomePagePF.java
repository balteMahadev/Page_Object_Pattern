package com.objectrepository;/* Mahadev
   01-02-2022
   Red iff home page
  */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF
{
    WebDriver driver;
    public RediffHomePagePF(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='srchword']")
    WebElement Search;
    public WebElement Search()
    {
        return Search;
    }
}
