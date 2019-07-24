import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.ContributionsPage;
import steps.ContributionsSteps;
import steps.MainSteps;

public class BankTest extends MainSteps {

    @Test
    @DisplayName("Оформление вклада в банке")
    public void Test(){
        ContributionsSteps contributionsSteps = new ContributionsSteps();
        ContributionsPage contributionsPage = new ContributionsPage();

        contributionsPage.InputFrame();

        contributionsPage.checkPercent();

        //contributionsSteps.stepCheckPercent("6.75%");
        //contributionsSteps.stepCheckResulSum("564 398,21");
        //contributionsSteps.stepCheckEarned("14 398,21");

        //contributionsSteps.stepCheckReplenish("250000");

    }
}
