import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContributionsPage;
import steps.ContributionsSteps;
import steps.FirstPageSteps;
import steps.MainSteps;

public class BankTest extends MainSteps {

    @Test
    @DisplayName("Оформление вклада в банке")
    public void Test() {
        ContributionsSteps contributionsSteps = new ContributionsSteps();
        ContributionsPage contributionsPage = new ContributionsPage();
        FirstPageSteps firstPageSteps = new FirstPageSteps();

        firstPageSteps.stepGoToContributions();
        contributionsSteps.stepEnetInputSum("amount", "300000");
        contributionsSteps.stepSetToRange();
        contributionsSteps.stepEnetReplenish("replenish", "50000");
        contributionsSteps.stepCheckBox();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[contains(@class, 'js-calc-rate')]"), "6.75%"));
        contributionsSteps.stepCheckPercent("6.75%");
        contributionsSteps.stepCheckAccuredField("14 647,36");
        contributionsSteps.stepCheckReplenishField("250 000");
        contributionsSteps.stepCheckCalcResultField("564 647,36");

       

    }
}
