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


public class ContributionsPage extends MainPage{
//вклад
    @FindBy(xpath = "//div[contains(@class, 'service__title')]//a[contains(@href, '/contributions/')]")
    public WebElement contrBtn;

//    @FindBy(xpath = "//span[contains(text(), 'Рубли')]")
//    public WebElement rubField;

//список месяцев
    @FindBy(xpath = "//div[contains(@class, 'jq-selectbox__dropdown')]")
    public WebElement dropdown;

    //открытие списка месяцев
    @FindBy(xpath = "//div[contains(@class, 'jq-selectbox__trigger')]")
    public WebElement selectBox;

    //выбор срока
    //"//li[contains(text(), '6 месяцев')]"
    @FindBy(xpath = "//li[contains(text(), '6 месяцев') and ./ancestor::div[1][not(contains(@style,'display: none'))]]")
    public WebElement selectMonths;

    //капитализация
    @FindBy(xpath = "//input[contains(@name, 'capitalization')]//ancestor::div[1]")
    public WebElement checkBox;

    //
    @FindBy(xpath = "//span[contains(@class, 'js-calc-rate')]")
    public  WebElement percentLine;

    @FindBy(xpath = "//span[contains(@class, 'js-calc-result')]")
    public WebElement resultSum;

    @FindBy(xpath = "//span[contains(@class, 'js-calc-replenish')]")
    public WebElement replenishLine;

    @FindBy(xpath = "//span[contains(@class, 'js-calc-earned')]")
    public WebElement earnedPercent;


    //@Step("Заполнение данных по вкладу")
    public ContributionsPage InputFrame(){

        contrBtn.click();
        //rubField.click();
        fillInputMoney("amount", "300000");
        selectBox.click();
        waitToDOwnload(selectMonths);
        selectMonths.click();
        fillInputMoney("replenish", "50000");
        checkBox.click();
        return new ContributionsPage();
    }


    public void fillInputMoney(String name, String numberToFill){
        String template = "//input[contains(@name, '%s')]";
        String fullxpath = String.format(template, name);
        driver.findElement(By.xpath(fullxpath)).sendKeys(numberToFill);
    }

//@Step("Ставка по проценту - {0} ")
    public void checkPercent(){
        Assert.assertEquals("6.75%", driver.findElement(By.xpath("//span[contains(@class, 'js-calc-rate')]")).getText());
    }
    public String getPercent(){
        return percentLine.getText().replaceAll("\u0025", "");

    }
//
//    public String getResultSum(){
//        return resultSum.getText().replaceAll("\u20BD", "");
//    }
//
//    public String getReplenish(){
//        return replenishLine.getText().replaceAll("\u20BD", "");
//    }
//
//    public String getEarned(){
//        return earnedPercent.getText().replaceAll("\u0025", "");
//    }


}
