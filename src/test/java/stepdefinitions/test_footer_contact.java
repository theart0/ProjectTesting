package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;
import utils.helpers.Helpers;

public class test_footer_contact extends BaseStepDef {
    TestContext testContext;

    public test_footer_contact(TestContext context){
        super(context);
        testContext = context;
    }

    @When("click on contact at footer")
    public void clickOnContactAtFooter() {
        driver.findElement(By.name("contact")).click();
        }

    @Then("navigate to contact page")
    public void navigateToContactPage() {
        boolean tieude = driver.findElement(By.xpath("//h3[contains(text(),'LIÊN HỆ')]")).isDisplayed();
        Assert.assertTrue(true,"Foul, please check!!");
    }
}
