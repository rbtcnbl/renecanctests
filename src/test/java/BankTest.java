import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.ContributionsPage;
import pages.FirstPage;
import steps.ContributionsSteps;
import steps.FirstPageSteps;
import steps.MainSteps;

public class BankTest extends MainSteps {

    @Test
    @DisplayName("Расчет по вкладу")
    public void Test(){
        FirstPageSteps firstPageSteps = new FirstPageSteps();
        ContributionsSteps contributionsSteps = new ContributionsSteps();
        FirstPage firstPage = new FirstPage();
        ContributionsPage contributionsPage = new ContributionsPage();

        firstPage.selectContr();

        contributionsPage.enterInputSum("amount", "300000");
        contributionsPage.setToRange();
        contributionsPage.enterReplenish("replenish", "50000");
        contributionsPage.checkBox();
        contributionsPage.checkPersent("6.75%");

//        contributionsSteps.stepEnetInputSum("amount", "300000");
//        contributionsSteps.stepSetToRange();
//        contributionsSteps.stepEnetReplenish("replenish", "50000");
//        contributionsSteps.stepCheckBox();
//        contributionsSteps.stepCheckPercent("6.75%");
//        contributionsSteps.stepCheckAccuredField("14 398,21");
//        contributionsSteps.stepCheckReplenishField("250 000");
//        contributionsSteps.stepCheckCalcResultField("564 398,21");


    }
}
