package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;
public class navigator_contact_page extends BaseStepDef {
    TestContext testContext;

    public navigator_contact_page(TestContext context){
        super(context);
        testContext = context;
    }



    @Given("user login at {string} with username {string} and password {string}")
    public void userLoginAtWithUsernameAndPassword(String url, String username, String password) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
        Helpers.delay(1);
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        driver.findElement(By.xpath("//input[@name='log_email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='log_password']")).sendKeys(password);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }
    @When("user click on Contact")
    public void userClickOnContact() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Liên hệ')]")).click();
    }


    @Then("Contact window appear")
    public void contactWindowAppear() {
        Helpers.delay(1);
        String checktext = driver.findElement(By.xpath("//h3[contains(text(),'LIÊN HỆ')]")).getText();
        Assert.assertEquals(checktext, "LIÊN HỆ", "lỗi rồi");
    }
}
