package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;

public class LoginSteps extends BaseStepDef {

    TestContext testContext;

    public LoginSteps(TestContext context){
        super(context);
        testContext = context;
    }

    @When("user click on login button enter username {string} and password {string}")
    public void userEnterUsernameAndPassword(String email, String password) {
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='log_password']")).sendKeys(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }

    @Then("The user redirect to homepage")
    public void theUserRedirectTohomepage() {
        Helpers.delay(2);
        String title = driver.getTitle();
        Assert.assertEquals(title,"home","Foul,please check!!");

    }
}
