package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
public class click_main_icon extends  BaseStepDef{
    TestContext testContext;

    public click_main_icon(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("click on main icon")
    public void clickOnMainIcon() {
        Helpers.delay(2);
        driver.findElement(By.className("logo")).click();
    }

    @Then("navigate to homepage")
    public void navigateToHomepage() {
        Helpers.delay(1);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"http://127.0.0.1:8000/","Foul, please check!!!");
    }
}
