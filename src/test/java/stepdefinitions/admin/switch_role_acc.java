package stepdefinitions.admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.TestContext;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;

public class switch_role_acc extends BaseStepDef{
    TestContext testContext;
    public switch_role_acc(TestContext context){
        super(context);
        testContext = context;
    }
    @And("admin click button edit account and switch role as an admin")
    public void adminClickButtonEditAccountAndSwitchRoleAsAnAdmin() {
        driver.findElement(By.xpath("//tr[@class='item_user13']//a[@class='btn btn-info btn-sm'][contains(text(),'Sửa')]")).click();
        Select select = new Select(driver.findElement(By.name("is_admin")));
        select.selectByVisibleText("Admin");
        Helpers.delay(1);
        driver.findElement(By.xpath("//button[contains(text(),'Cập nhật người dùng')]")).click();
    }

    @Then("a new user can navigator urls{string} admin page")
    public void aNewUserCanNavigatorUrlsAdminPage(String url1) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng xuất')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_email']")).sendKeys("test@gmail.com");
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_password']")).sendKeys("1");
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        String checktitle = driver.getTitle();
        Assert.assertEquals(checktitle, "Admins", "foul, please check");
    }
}
