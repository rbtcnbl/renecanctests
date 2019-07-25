package steps;

import io.qameta.allure.Step;
import pages.FirstPage;


public class FirstPageSteps {
    FirstPage firstPage = new FirstPage();

    @Step("выбран пункт открытия вклада")
    public void stepGoToContributions(){
        firstPage.contrBtn.click();
    }
}
