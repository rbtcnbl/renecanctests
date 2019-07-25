package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.MainSteps;

public class FirstPage extends MainPage {


    //вклад
    @FindBy(xpath = "//div[contains(@class, 'service__title')]//a[contains(@href, '/contributions/')]")
    public WebElement contrBtn;
}
