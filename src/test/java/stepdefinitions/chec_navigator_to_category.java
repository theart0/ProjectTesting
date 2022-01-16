package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;
public class chec_navigator_to_category extends  BaseStepDef {
    TestContext testContext;
    public chec_navigator_to_category(TestContext context){
        super(context);
        testContext = context;
    }
    @When("user click button category")
    public  void  userclickbuttoncategory() {
        Helpers.delay(1);
        driver.findElement(By.linkText("Chủ đề")).click();
    }

    @Then("about category page is display")
    public void aboutCategoryPageIsDisplay() {
        Helpers.delay(1);
        String checktitle = driver.findElement(By.name("title")).getText();
        Assert.assertEquals(checktitle, "Chủ đề", "Foul, Please Check");
    }
}
