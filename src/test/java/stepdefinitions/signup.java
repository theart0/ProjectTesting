package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class signup  extends  BaseStepDef{
    TestContext testContext;

    public signup(TestContext context){
        super(context);
        testContext = context;
    }

    @Given("user navigate to homepage {string}")
    public void userNavigateToHomepage(String url) {
        System.out.println("Drive on Steps class" + driver);
        driver.get(url);
    }
    @And("click icon sign in and click button sign up")
    public void clickIconSignInAndClcikButtonSignUp() {

        Helpers.delay(1);
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        driver.findElement(By.xpath("//button[@id='signUp']")).click();


    }

    @When("user new enter name {string} and email {string} and phone {string} and address {string} and password {string} and confirmpassword{string}")
    public void userNewEnterNameAndEmailAndPhoneAndAddressAndPasswordAndConfirmpassword(String name, String email, String phone, String address, String password, String cfpassword) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@placeholder='Tên']")).sendKeys(name);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@class='reg_email']")).sendKeys(email);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@placeholder='Số điện thoại']")).sendKeys(phone);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@placeholder='Địa chỉ']")).sendKeys(address);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@class='reg_password']")).sendKeys(password);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@placeholder='Nhập lại mật khẩu']")).sendKeys(cfpassword);
        driver.findElement(By.name("dk")).click();

    }


    @Then("a noitice sign up succesfull appear")
    public void aNoiticeSignUpSuccesfullAppear() {
        String thongbao = driver.findElement(By.xpath("//div[@class='message_pass']")).getText();
        Assert.assertEquals(thongbao,"Đăng ký thành công !", "Foul, please check!!!");
    }



}
