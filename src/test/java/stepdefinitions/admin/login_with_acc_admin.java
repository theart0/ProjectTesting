package stepdefinitions.admin;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;
public class login_with_acc_admin extends BaseStepDef {
    TestContext testContext;

    public login_with_acc_admin(TestContext context){
        super(context);
        testContext = context;
    }

    @Given("User navigator to url {string}")
    public void userNavigatorToUrl(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);

    }

    @When("user click icon login and click  button log in")
    public void userClickIconLoginAndClickButtonLogIn() {

        Helpers.delay(1);
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }
    @And("click login button login")
    public void clickLoginButtonLogin() {
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }

    @Then("login seccessful with acccount admin and navigator to admin page")
    public void loginSeccessfulWithAcccountAdminAndNavigatorToAdminPage() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"Admins","Foul,please check");


    }



}
