package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

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

    }

    @When("user click icon login and click  button login")
    public void userclickbuttonlogin() {


        Helpers.delay(1);
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        Helpers.delay(2);

    }
    @And("user click button login with no data")
    public void userClickButtonLoginWithNoData() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }

    @Then("a notice login fail appear")
    public void aNoticeLoginFailAppear() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//div[@class='text-danger']")).isDisplayed();
        Assert.assertTrue(true,"Foul, please check!!");
    }


}

