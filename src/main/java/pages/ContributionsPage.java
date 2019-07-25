package pages;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.qameta.allure.Step;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContributionsPage extends MainPage {


//    @FindBy(xpath = "//span[contains(text(), 'Рубли')]")
//    public WebElement rubField;


    //выбор срока
    @FindBy(xpath = "//div[contains(@class, 'range-scale range-scale_item_6')]/div[contains(@class, 'range-scale__item range-scale__item_1')]")
    public WebElement selectMonths;

    //капитализация
    @FindBy(xpath = "//input[contains(@name, 'capitalization')]//ancestor::div[1]")
    public WebElement checkBox;

    //
    @FindBy(xpath = "//span[contains(@class, 'js-calc-rate')]")
    public WebElement percentLine;

    @FindBy(xpath = "//span[contains(@class, 'js-calc-result')]")
    public WebElement resultSum;

    @FindBy(xpath = "//span[contains(@class, 'js-calc-replenish')]")
    public WebElement replenishLine;

    @FindBy(xpath = "//span[contains(@class, 'js-calc-earned')]")
    public WebElement earnedPercent;


//    public ContributionsPage InputFrame () {
//
//        contrBtn.click();
//        //rubField.click();
//        fillInputMoney("amount", "300000");
//        selectMonths.click();
//        fillInputMoney("replenish", "50000");
//        checkBox.click();
//        new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[contains(@class, 'js-calc-rate')]"), "6.75%"));
//        return new ContributionsPage();
//    }


    public void fillInputMoney(String name, String numberToFill) {
        String template = "//input[contains(@name, '%s')]";
        String fullxpath = String.format(template, name);
        driver.findElement(By.xpath(fullxpath)).sendKeys(numberToFill);
    }





}
