package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {
    FirstPageSteps firstPageSteps = new FirstPageSteps();
    ContributionsSteps contributionsSteps = new ContributionsSteps();

    @When("^выбран пункт вклад \"(.+)\"$")
    public void selectCont(){firstPageSteps.stepGoToContributions();}

    @When("^выбрана сумма вклада – \"(.+)\"$")
    public void enetInputSum(String name, String sum){
        contributionsSteps.stepEnetInputSum(name, sum);
    }

    @When("^выбран срок вклада - \"(.+)\"$")
    public void setToRange(){contributionsSteps.stepSetToRange();}

    @When("^выбрано ежемесячное пополнение на сумму - \"(.+)\"$")
    public void selectReplenishment(String replenish){
        contributionsSteps.stepCheckReplenishField(replenish);
    }

    @When("^отмечен чекбокс – \"(.*)\"$")
    public void selectCheckBoxClick(){
        contributionsSteps.stepCheckBox();
    }

    @Then("^проверено, что автоматически заполнилось поле Ставка - \"(.*)\"$")
    public void checkRateField(String rate){
        contributionsSteps.stepCheckPercent(rate);
    }
    @Then("^проверено? что автоматически заполнилось поле Начислено - \"(.*)\"$")
    public void checkAccuredField(String accured){
        contributionsSteps.stepCheckAccuredField(accured);
    }

    @Then("^проверено, что  заполнилось поле Пополнение за 6 месяцев - \"(.*)\"$")
    public void checkReplenishField(String replenish){
        contributionsSteps.stepCheckReplenishField(replenish);
    }

    @Then("^проверено? что  заполнилось поле К снятию через 6 месяцев – \"(.*)\"$")
    public void checkCalcResultField(String result) {
        contributionsSteps.stepCheckCalcResultField(result);
    }
}
