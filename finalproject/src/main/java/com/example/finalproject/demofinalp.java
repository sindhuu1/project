package com.example.finalproject;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class demofinalp {
public static void main(String[] args) {
	FirefoxDriver dr =new FirefoxDriver();
       dr.get("http://www.google.com");
       dr.manage().window().maximize();
       dr.findElement(By.id("APjFqb")).sendKeys("shaadi.com"); 
       dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
       dr.findElement(By.xpath("/html/body/div[5]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
       dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div")).click();
       dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/form/div/div[5]/button")).click();
       dr.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div")).click();
       dr.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/form/div/div/div/div/div[1]/div/div[2]/div[2]/div[2]")).click();
       
}
}
