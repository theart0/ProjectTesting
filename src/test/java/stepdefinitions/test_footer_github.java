package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
public class test_footer_github extends BaseStepDef{
    TestContext testContext;

    public test_footer_github(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("click on Github at footer")
    public void clickOnGithubAtFooter() {
        driver.findElement(By.xpath("//a[normalize-space()='Github']")).click();
            }

    @Then("Github windown appear")
    public void githubWindownAppear() {
        String title = driver.getCurrentUrl();
        Assert.assertEquals(title,"https://github.com/ductwok/PHP_laravel_nhom9/tree/main/objectCourse","Foul, please check!!");
    }
}
