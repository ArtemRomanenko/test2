package Action;

import DriverSettings.DriverSettings;
import PageObjects.FirstStep;
import PageObjects.SecondStep;
import org.junit.Before;
import org.junit.Test;


public class Action extends DriverSettings {

    FirstStep page;
    SecondStep pages;

    @Before
    public void Start() {
        page = new FirstStep(driver);
        pages = new SecondStep(driver);

    }

    @Test //Add to basket
    public void stage7Shop() {
        page.start();
        page.searcLine();
        page.resultPage();
        page.basket();
        page.intoBasket();
        page.checkItemName();

    }

    @Test //Login
    public void comeBack() {
        pages.login();

    }

}







