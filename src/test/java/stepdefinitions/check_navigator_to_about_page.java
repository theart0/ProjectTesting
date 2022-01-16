package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;
import utils.helpers.Helpers;
public class check_navigator_to_about_page extends  BaseStepDef{
    TestContext testContext;
    public check_navigator_to_about_page(TestContext context){
        super(context);
        testContext = context;
    }



    @Given("user navigator url {string}")
    public void userNavigatorUrl(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
    }

    @When("user click button about")
    public void userClickButtonAbout() {
        Helpers.delay(1);
        driver.findElement(By.linkText("Về I-SHARE")).click();
    }

    @Then("about homepage is display")
    public void aboutHomepageIsDisplay() {
        Helpers.delay(1);
        String checktitle = driver.findElement(By.name("title")).getText();
        Assert.assertEquals(checktitle, "VỀ I-SHARE", "Foul, Please Check");
    }
}
