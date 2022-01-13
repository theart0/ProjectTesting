package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.helpers.Helpers;

public class login_no_data extends  BaseStepDef {

        TestContext testContext;

    public login_no_data(TestContext context){
            super(context);
            testContext = context;
        }

    @Given("user navigate to {string}")
    public void userNavigateTo(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
        Helpers.delay(1);
    }

    @When("user click button login but no input data user and password")
    public void userClickButtonLoginButNoInputDataUserAndPassword() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[@id='Lnew1']")).click();

    }


    @Then("user can't login in the next display")
    public void userCanTLoginInTheNextDisplay() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://my.uda.edu.vn/sv/svlogin");
    }




}

