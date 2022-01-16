package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;


public class login_incorectaccount  extends  BaseStepDef{
    TestContext testContext;

    public login_incorectaccount(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("user navigator to url {string}")
    public void userNavigatorToUrl(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
    }

    @When("User click icon login and click button đăng nhập")
    public void userClickIconLoginAndClickButtonĐăngNhập() {
            Helpers.delay(1);
            driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }

    @And("user input username {string} and password{string} and click button đăng nhập")
    public void userInputUsernameAndPasswordAndClickButtonĐăngNhập(String username, String password) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_email']")).sendKeys(username);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_password']")).sendKeys(password);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }

    @Then("user fail login and show appear")
    public void userFailLoginAndShowAppear() {
        String thongbao = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
        Assert.assertEquals(thongbao, "Tài khoản hoặc mật khẩu không đúng !", "lỗi rồi");

    }
}
