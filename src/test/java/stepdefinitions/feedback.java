package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
public class feedback extends  BaseStepDef{
    TestContext testContext;

    public feedback(TestContext context) {
        super(context);
        testContext = context;
    }
    @When("enter name {string} phone {string} email {string} content {string}")
    public void enterNamePhoneEmailContent(String name, String phone, String email, String content) {
        driver.findElement(By.xpath("//input[@placeholder='Họ và tên']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@placeholder='Số điện thoại']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
        driver.findElement(By.xpath("//textarea[@placeholder='Bạn muốn nhắn nhủ e-learning điều gì']")).sendKeys(content);
        driver.findElement(By.xpath("//button[contains(text(),'Gửi thôi nào!')]")).click();
    }

    @Then("a notice give feedback succesful appear")
    public void aNoticeGiveFeedbackSuccesfulAppear() {
        boolean notice = driver.findElement(By.xpath("//div[@role='dialog']")).isDisplayed();
        Assert.assertTrue(true,"Foul, please check!!");
    }


}
