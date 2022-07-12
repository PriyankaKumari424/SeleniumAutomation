package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Gmail {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();


        WebElement passwordButton = driver.findElement(By.xpath("//input[@name='password']"));
        passwordButton.sendKeys("abc");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();

        driver.findElement(By.xpath("//div[text()='Compose']")).click();

        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("xyz@gmail.com");

        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium script");
        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Hello, This is demo for composing email in gmail");


    }

}
