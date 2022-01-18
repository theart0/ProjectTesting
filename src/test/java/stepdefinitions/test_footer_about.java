package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;
import utils.helpers.Helpers;

public class test_footer_about extends BaseStepDef{
    TestContext testContext;

    public test_footer_about(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("navigator to web {string}")
    public void navigatorToWeb(String url) {
        driver.get(url);
    }

    @When("click on About button")
    public void clickOnAboutButton() {
    driver.findElement(By.name("about")).click();
    }

    @Then("aboutpage appear")
    public void aboutpageAppear() {
        String title = driver.findElement(By.xpath("//p[contains(text(),'VỀ I-SHARE')]")).getText();
        Assert.assertEquals(title,"Trang Chủ >> VỀ I-SHARE","Foul, please check!!");

    }
}
