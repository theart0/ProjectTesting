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
public class check_navigator_to_QLVD extends  BaseStepDef{

    TestContext testContext;

    public check_navigator_to_QLVD(TestContext context){
        super(context);
        testContext = context;
    }
    @And("admin click button Quản lý and click button QLKH an click button video")
    public void adminclickbuttonquanlyanclickbuttonvideo(){
        Helpers.delay(1);
        driver.findElement(By.xpath("//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-scrollbar-vertical-hidden os-host-transition']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[@class='nav-item menu-open']/ul[2]/li[1]/a[1]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//p[contains(text(),'Quản lý khóa học')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[normalize-space()='Video']")).click();
    }

    @Then("QLVD page is display")
    public void qlvdPageIsDisplay() {
        String checktext = driver.findElement(By.xpath("//h1[contains(text(),'Danh sách các Video của khóa học PHP')]")).getText();
        Assert.assertEquals(checktext,"Danh sách các Video của khóa học PHP", "it's not QLVD page");
    }
}
