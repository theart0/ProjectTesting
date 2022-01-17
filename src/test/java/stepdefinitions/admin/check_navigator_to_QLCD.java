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
public class check_navigator_to_QLCD extends  BaseStepDef{
    TestContext testContext;

    public check_navigator_to_QLCD(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("admin navigator to url {string}")
    public void adminNavigatorToUrl(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
    }

    @When("admin click icon login and click button login")
    public void adminClickIconLoginAndClickButtonLogin() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }

    @And("admin enter usename {string} and password {string} and click button login")
    public void adminEnterUsenameAndPasswordAndClickButtonLogin(String username, String password) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_email']")).sendKeys(username);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_password']")).sendKeys(password);
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }
    @And("admin click button Quản lý and click button QLTl")
    public void adminClickButtonQuảnLýAndClickButtonQLTl() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-scrollbar-vertical-hidden os-host-transition']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[@class='nav-item menu-open']/ul[2]/li[1]/a[1]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//p[contains(text(),'Quản lý thể loại')]")).click();
    }

    @Then("QLCD page is display")
    public void qlcdPageIsDisplay() {
        String checktext = driver.findElement(By.xpath("//h1[contains(text(),'Danh sách các thể loại')]")).getText();
        Assert.assertEquals(checktext,"Danh sách các thể loại", "it's not QLCD page");
    }


}
