package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import utils.helpers.Helpers;

public class LoginSteps extends BaseStepDef {

    TestContext testContext;

    public LoginSteps(TestContext context){
        super(context);
        testContext = context;
    }

    @Given("user navigate to url {string}")
    public void userNavigateToUrl(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
    }

    @When("user enter username {string} and password {string}")
    public void userEnterUsernameAndPassword(String email, String password) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
    }

    @Then("The user redirect to Dashboard page")
    public void theUserRedirectToDashboardPage() {
        Helpers.delay(2);
        String tieude = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
        Assert.assertEquals(tieude, "Welcome 1", "Không đăng nhập được");

    }


}
