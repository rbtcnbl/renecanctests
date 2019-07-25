package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.MainSteps;


public class MainPage {

    WebDriver driver = MainSteps.getDriver();

    public MainPage() {
        this.driver = driver;
        new WebDriverWait(driver, 5, 200);
        PageFactory.initElements(driver, this);

    }

    public void waitToDOwnload(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5000, 200);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
