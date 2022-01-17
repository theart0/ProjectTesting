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

public class delete_data_QLCD extends BaseStepDef {
    TestContext testContext;

    public delete_data_QLCD(TestContext context){
        super(context);
        testContext = context;
    }
    @And("admin click button Quản lý and click button QLCD")
    public void adminClickButtonQuảnLýAndClickButtonQLCD() {
        driver.findElement(By.xpath("//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-scrollbar-vertical-hidden os-host-transition']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[@class='nav-item menu-open']/ul[2]/li[1]/a[1]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//p[contains(text(),'Quản lý thể loại')]")).click();
    }

    @And("admin click button delete")
    public void adminClickButtonDelete() {
        driver.findElement(By.xpath("//tr[@class='item_category13']//button[@class='btn btn-danger btn-sm btn_delete-category'][normalize-space()='Xóa']")).click();
        Helpers.delay(2);
        driver.findElement(By.xpath("//button[normalize-space()='Xóa !']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

    }

    @Then("data delete seccessfull")
    public void dataDeleteSeccessfull() {
        String checktitle = driver.findElement(By.xpath("//span[@class='ml-4 text-success']")).getText();
        Assert.assertEquals(checktitle,"Xóa thành công thể loại test ! ", "foul, please check!");
    }
}
