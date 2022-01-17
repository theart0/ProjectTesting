package stepdefinitions.admin;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;

public class check_navigator_to_QLTK extends BaseStepDef {
    TestContext testContext;

    public check_navigator_to_QLTK(TestContext context){
        super(context);
        testContext = context;
    }


    @And("admin click button Quản lý and click button QLTK")
    public void adminClickButtonQuanlyAndClickButtonQLTK() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-scrollbar-vertical-hidden os-host-transition']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[@class='nav-item menu-open']/ul[2]/li[1]/a[1]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//p[contains(text(),'Quản lý Nguời dùng')]")).click();
    }

    @Then("QLTK page is display")
    public void qltkPageIsDisplay() {
        String checktext = driver.findElement(By.xpath("//h1[contains(text(),'Danh sách tài khoản người dùng')]")).getText();
        Assert.assertEquals(checktext,"Danh sách tài khoản người dùng", "it's not QLTK page");
    }

}
