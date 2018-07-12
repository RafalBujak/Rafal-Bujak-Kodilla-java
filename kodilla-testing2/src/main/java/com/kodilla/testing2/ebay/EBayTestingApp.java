package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHFIELDEBAY = "gh-ac";
    public static void main (String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.ebay.de");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELDEBAY));
        searchField.sendKeys("laptop");
        searchField.submit();
    }
}
