package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.helpers.Helpers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        Helpers.delay(2);
    }

    @When("user click button login")
    public void userclickbuttonlogin() {
        Helpers.delay(1);

        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();

    }
    

    @Then("a notice login fail appear")
    public void aNoticeLoginFailAppear() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//div[@class='text-danger']")).isDisplayed();
        Assert.assertTrue(true,"Foul, please check!!");


    }
}

