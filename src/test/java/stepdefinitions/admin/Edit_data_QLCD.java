package stepdefinitions.admin;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;

public class Edit_data_QLCD extends  BaseStepDef{

    TestContext testContext;

    public Edit_data_QLCD(TestContext context){
        super(context);
        testContext = context;
    }
    @And("admin enter username {string} and password and click button login")
    public void adminEnterUsernameAndPasswordAndClickButtonLogin(String username) {
        driver.findElement(By.xpath("//input[@name='log_email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='log_password']")).sendKeys("1");
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
    }

    @And("admin click edit on the QLCD page")
    public void adminClickEditOnTheQLCDPage() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Sửa')]")).click();
    }

    @And("enter new name{string} and newdicription {string} and click button edit")
    public void enterNewNameAndNewdicriptionAndClickButtonEdit(String name, String dicrip) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputName']")).clear();
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(name);
        Helpers.delay(1);
        driver.findElement(By.xpath("//textarea[@id='inputDescription']")).clear();
        driver.findElement(By.xpath("//textarea[@id='inputDescription']")).sendKeys(dicrip);
        Helpers.delay(1);
        driver.findElement(By.xpath("//button[contains(text(),'lưu')]")).click();
    }

    @Then("name and dicription of category edit secessfull")
    public void nameAndDicriptionOfCategoryEditSecessfull() {
        String checktitle = driver.findElement(By.xpath("//span[@class='ml-4 text-success']")).getText();
        Assert.assertEquals(checktitle,"Cập nhật thành công thể loại php","foul,please check!");

    }

    @And("check in QLKH page category edit secessfull")
    public void checkInQLKHPageCategoryEditSecessfull() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-scrollbar-vertical-hidden os-host-transition']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[@class='nav-item menu-open']/ul[2]/li[1]/a[1]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//p[contains(text(),'Quản lý khóa học')]")).click();
        String checktitle = driver.findElement(By.xpath("//td[7]")).getText();
        Assert.assertEquals(checktitle,"php","foul,please check!");
    }


}
