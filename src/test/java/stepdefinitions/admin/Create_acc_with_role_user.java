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
public class Create_acc_with_role_user extends  BaseStepDef{

    TestContext testContext;

    public Create_acc_with_role_user(TestContext context){
        super(context);
        testContext = context;
    }


    @And("admin click button add account and create a new account with name{string} and Email{string} and address and password  and confirmpass  and phone  and role user")
    public void adminClickButtonAddAccountAndCreateANewAccountWithNameAndEmailAndAddressAndPasswordAndConfirmpassAndPhoneAndRoleUser(String name, String email) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Thêm người dùng')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(name);
        Helpers.delay(1);
        driver.findElement(By.xpath("//textarea[@id='inputemail']")).sendKeys(email);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputaddress']")).sendKeys("abc");
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputpassword']")).sendKeys("1");
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputpassword2']")).sendKeys("1");
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputphone']")).sendKeys("077676351");
        Select select = new Select(driver.findElement(By.name("is_admin")));
        select.selectByVisibleText("User");
        driver.findElement(By.xpath("//button[contains(text(),'Thêm người dùng')]")).click();
    }



    @Then("a new user can't navigator urls{string} admin page")
    public void aNewUserCanTNavigatorUrlAdminPage(String url1) {
        Helpers.delay(1);
        String titlecheck = driver.findElement(By.xpath("//span[@class='ml-4 text-success']")).getText();
        Assert.assertEquals(titlecheck, "Thêm thành công tài khoản user1 !", "foul,please check");
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng xuất')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_email']")).sendKeys("user1@gmail.com");
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@name='log_password']")).sendKeys("1");
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
        String checktitle = driver.getTitle();
        Assert.assertEquals(checktitle, "home", "foul, please check");
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url1);
        String checkitem = driver.findElement(By.xpath("//h2[contains(text(),'Bạn không có quyền truy cập trang này !')]")).getText();
        Assert.assertEquals(checkitem, "BẠN KHÔNG CÓ QUYỀN TRUY CẬP TRANG NÀY ! TRỞ LẠI TRANG HOME", "foul, please check!");
    }
}

