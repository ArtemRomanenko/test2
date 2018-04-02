package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SecondStep {

    WebDriver driver;

    public SecondStep(WebDriver driver) {
        this.driver = driver;
    }

    public void login(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/a[1]/span")).click();
    }



}
