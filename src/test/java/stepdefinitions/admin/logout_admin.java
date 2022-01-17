package stepdefinitions.admin;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;

public class logout_admin extends BaseStepDef {
    TestContext testContext;

    public logout_admin(TestContext context){
        super(context);
        testContext = context;
    }
    @And("admin click button logout")
    public void adminClickButtonLogout() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng xuất')]")).click();
    }
    @Then("admin log out acccount secessful and navigator to login page")
    public void adminLogOutAcccountSecessfulAndNavigatorToLoginPage() {
        String title = driver.findElement(By.xpath("//h1[contains(text(),'Đăng Nhập')]")).getText();
        Assert.assertEquals(title,"Đăng Nhập","foul, please check!");

    }


}
