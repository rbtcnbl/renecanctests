package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ContributionsPage;

public class ContributionsSteps {

    ContributionsPage contributionsPage = new ContributionsPage();



    //@Step("Ставка по проценту - {0} ")

    public void stepCheckPercent(String percent){
       Assert.assertEquals(String.format("Итоговый процент не равен %s. Получено значение %s", percent, contributionsPage.getPercent()),
        percent, contributionsPage.getPercent());
    }
//
//    @Step("К снятию через 6 месяцев - {0} ")
//    public void stepCheckResulSum(String result){
//        Assert.assertEquals(String.format("Сумма к снятию через 6 месяцев не равна %s. Получено значение %s", result, contributionsPage.getResultSum()),
//                result, contributionsPage.getResultSum());
//    }
//
//    @Step("Пополнение за 6 месяцев - {0} ")
//    public void stepCheckReplenish(String replenish){
//        Assert.assertEquals(String.format("Сумма пополнения через 6 месяцев не равна %s. Получено значение %s", replenish, contributionsPage.getReplenish()),
//                replenish, contributionsPage.getReplenish());
//    }
//
//    @Step("Начислено {0} процентов ")
//    public void stepCheckEarned(String earned){
//        Assert.assertEquals(String.format("Сумма процентных начислений не равна %s. Получено значение %s", earned, contributionsPage.getEarned()),
//                earned, contributionsPage.getEarned());
//    }
}
