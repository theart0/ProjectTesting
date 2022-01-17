package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;
import cucumber.TestContext;


public class logout extends BaseStepDef{
    TestContext testContext;

    public logout(TestContext context){
        super(context);
        testContext = context;
    }

    @When("user click on logout button")
    public void userClickOnLogoutButton() {
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng xuất')]")).click();

    }

    @Then("navigate to login page")
    public void navigateToLoginPage() {
        boolean login = driver.findElement(By.xpath("//form[@method='post']")).isDisplayed();
        Assert.assertTrue(true,"Foul, please check!!");
    }
}
