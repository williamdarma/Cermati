package Utility;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    public BrowserDriver browserDriver;

    @Before
    public void Setup()
    {
        browserDriver = new BrowserDriver(Constant.BROWSER);
    }

    @After
    public void TearDown() {
        browserDriver.Close();
    }
}
