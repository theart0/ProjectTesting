package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.helpers.Helpers;

public class ThoiKhoaBieuSteps extends BaseStepDef {

    TestContext testContext;

    public ThoiKhoaBieuSteps(TestContext context){
        super(context);
        testContext = context;
    }

    @Given("Login to the system {string} with email {string} and password {string}")
    public void loginToTheSystemWithEmailAndPassword(String url, String username, String password) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='User']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[@id='Lnew1']")).click();
        Helpers.delay(3);
        WebElement ten = driver.findElement(By.xpath("//span[@id='MainContent_FormView2_hovatenLabel']"));
        Assert.assertEquals(ten.getText(), "Nguyễn Quốc Đạt", "Tên chưa đúng");
    }

    @When("user open Thong Bao menu")
    public void userOpenThongBaoMenu() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[.='Thông báo ']")).click();
    }

    @And("click Thoi Khoa Bieu item")
    public void clickThoiKhoaBieuItem() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Thời khóa biểu')]")).click();
    }

    @Then("the Thoi Khoa Bieu page is display")
    public void theThoiKhoaBieuPageIsDisplay() {
        Helpers.delay(2);
        String tieude = driver.findElement(By.xpath("(//div[@class='panel-heading'])[1]//h4")).getText();
        Assert.assertEquals(tieude, "Thời khóa biểu hiện tại", "Không phải trang Thời khóa biểu.");

    }

    @And("lam cai gi do")
    public void lamCaiGiDo() {

        Helpers.delay(2);
    }

}
