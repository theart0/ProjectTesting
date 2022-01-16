package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;
public class signup_with_alreadyaccount extends  BaseStepDef{
    TestContext testContext;

    public signup_with_alreadyaccount(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("user navigato to {string} and go to login page")
    public void userNavigatoToAndGoToLoginPage(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
        driver.findElement(By.xpath("//nav[@class='navbar']//ul//li//a[@href='#']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        driver.findElement(By.xpath("//button[@id='signUp']")).click();
        Helpers.delay(2);

    }

    @When("enter exist name {string} email {string} phone {string} address {string} password {string} and confim password {string}")
    public void enterExistUsernameNameEmailPhoneAddressPasswordAndConfimPassword(String name, String email, String phone, String address, String password, String cfpassword) {
        driver.findElement(By.xpath("//input[@placeholder='Tên']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@class='reg_email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Số điện thoại']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@placeholder='Địa chỉ']")).sendKeys(address);
        driver.findElement(By.xpath("//input[@class='reg_password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@placeholder='Nhập lại mật khẩu']")).sendKeys(cfpassword);
        driver.findElement(By.xpath("//button[contains(text(),'Tạo!')]")).click();
        Helpers.delay(1);
    }

    @Then("sign up fail")
    public void signUpFail() {
        Helpers.delay(2);
        String note = driver.findElement(By.xpath("//div[@class='message_pass']")).getText();
        Assert.assertEquals(note,"Email đã được sử dụng !","Foul,please check!!!");
    }



}
