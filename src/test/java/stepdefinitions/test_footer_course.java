package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;
import utils.helpers.Helpers;

public class test_footer_course extends BaseStepDef {
    TestContext testContext;

    public test_footer_course(TestContext context){
        super(context);
        testContext = context;
    }

    @When("click on course at footer")
    public void clickOnContactAtFooter() {
        driver.findElement(By.xpath("/html[1]/body[1]/section[5]/div[1]/div[2]/a[1]")).click();
    }

    @Then("navigate to Couse page")
    public void navigateToContactPage() {
        boolean tieude = driver.findElement(By.xpath("//p[contains(text(),'Bài Giảng')]")).isDisplayed();
        Assert.assertTrue(true,"Foul, please check!!");
    }
}

