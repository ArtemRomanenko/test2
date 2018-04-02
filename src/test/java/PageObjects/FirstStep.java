package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FirstStep {

    WebDriver driver;

    public FirstStep(WebDriver driver) {
        this.driver = driver;
    }

    public void start(){
        driver.get("http://stage7shop.com.ua/");
    }

    public void searcLine() {
        driver.findElement(By.name("search")).sendKeys("Depo", Keys.ENTER);
    }

    public void resultPage(){
       driver.findElement(By.partialLinkText("ШПЛ")).click();
    }

    public void basket(){
        driver.findElement(By.id("button-cart")).click();
    }

    public void intoBasket(){
        Actions action = new Actions(driver);
        WebElement hover = driver.findElement(By.id("cart-total"));
        action.moveToElement(hover).moveToElement(driver.findElement(By.xpath("//*[@id=\"cart\"]/div/ul/li[2]/div/p/a[1]"))).click().build().perform();
    }

    public void checkItemName(){
        String itemName = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")).getText();
        //System.out.println(itemName);
        if (itemName.contentEquals("ШПЛ Depo Racing") ) {
            System.out.println("Test passed");
        }
            else{
                System.out.println("Test failed");
            }
        }





    }





