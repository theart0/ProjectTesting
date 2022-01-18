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
