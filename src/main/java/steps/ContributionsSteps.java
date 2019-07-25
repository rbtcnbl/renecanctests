package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContributionsPage;

public class ContributionsSteps {

    ContributionsPage contributionsPage = new ContributionsPage();
    WebDriverWait wait = new WebDriverWait(MainSteps.getDriver(), 10);


    @Step("Сумма вклада равна - {sum}")
    public void stepEnetInputSum(String name, String sum){
        contributionsPage.fillInputMoney(name, sum);
    }

    @Step("Выбран срок")
    public void stepSetToRange(){
        contributionsPage.selectMonths.click();
    }

    @Step("Сумма ежемесячного пополнения - {sum}")
    public void stepEnetReplenish(String name, String sum){
        contributionsPage.fillInputMoney(name, sum);
    }

    @Step("Выбрана ежемесячная капитализация")
    public void stepCheckBox(){
        contributionsPage.checkBox.click();
    }

    @Step("Ставка по проценту расчитана - {0} ")
    public void stepCheckPercent(String percent){

        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", contributionsPage.percentLine.getText(),
                percent),wait.until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  contributionsPage.percentLine.getText();
            return actualResult.equalsIgnoreCase(percent);}));
    }

    @Step("Проверено, что автоматически заполнилось поле Начислено - {0}")
    public void stepCheckAccuredField(String accured) {
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", contributionsPage.earnedPercent.getText(),
                accured), wait.until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  contributionsPage.earnedPercent.getText();
            return actualResult.equalsIgnoreCase(accured);}));
    }

    @Step("Проверено, что автоматически заполнилось поле Пополнение за 6 месяцев - {0}")
    public void stepCheckReplenishField(String replenish) {
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", contributionsPage.replenishLine.getText(),
                replenish), wait.until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  contributionsPage.replenishLine.getText();
            return actualResult.equalsIgnoreCase(replenish);}));
    }

    @Step("Проверено, что автоматически заполнилось поле К снятию через 6 месяцев – {0}")
    public void stepCheckCalcResultField(String result) {
        Assert.assertTrue(String.format("В поле рассчитано значение %s. Ожидалось - %s", contributionsPage.resultSum.getText(),
                result), wait.until((ExpectedCondition<Boolean>) driver -> {
            String actualResult =  contributionsPage.resultSum.getText();
            return actualResult.equalsIgnoreCase(result);}));
    }


//
//    @Step("К снятию через 6 месяцев - {0} ")
//    public void stepCheckResulSum(String result){
//        Assert.assertEquals(String.format("Сумма к снятию через 6 месяцев не равна %s. Получено значение %s", result, contributionsPage.getResultSum()),
//                result, contributionsPage.getResultSum());
//    }
//

}
