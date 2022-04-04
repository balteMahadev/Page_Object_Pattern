package com.objectrepository;/* Mahadev
   01-02-2022
   Red iff home page
  */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage
{
    WebDriver driver;
    public RediffHomePage(WebDriver driver)
    {
        this.driver= driver;
    }
    By  Search  = By.xpath("//input[@id='srchword']");
    public WebElement Search()
    {
        return driver.findElement(Search);
    }
}
