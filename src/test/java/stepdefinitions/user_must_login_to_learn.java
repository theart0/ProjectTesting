package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;


public class user_must_login_to_learn extends BaseStepDef{
    TestContext testContext;

    public user_must_login_to_learn(TestContext context){
        super(context);
        testContext = context;
    }
    @When("user click on course")
    public void userClickOnCourse() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/a[2]")).click();


    }

    @Then("user navigate to login page")
    public void userNavigateToLoginPage() {
        String title = driver.getCurrentUrl();
        Assert.assertEquals(title,"http://127.0.0.1:8000/logins","Foul, please check!!!");
    }
}
