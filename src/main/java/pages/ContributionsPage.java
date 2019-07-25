package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.MainSteps;


public class ContributionsPage extends MainPage {
    WebDriverWait wait = new WebDriverWait(MainSteps.getDriver(), 10);
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

    public void enterInputSum(String name, String sum) {
        fillInputMoney(name, sum);
    }

    public void setToRange() {
        selectMonths.click();
    }

    public void enterReplenish(String name, String sum){
        fillInputMoney(name,sum);
    }


    public void checkBox(){
        checkBox.click();
    }

    public void checkPersent(String percent){
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", percentLine.getText(),
                percent),wait.until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  percentLine.getText();
            return actualResult.equalsIgnoreCase(percent);}));
    }
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
