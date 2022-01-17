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
public class Edit_data_QLKH  extends BaseStepDef {
    TestContext testContext;
    public Edit_data_QLKH(TestContext context){
        super(context);
        testContext = context;
    }


    @And("admin click edit on the QLKH page")
    public void adminClickEditOnTheQLKHPage() {
        driver.findElement(By.xpath("//a[contains(text(),'Sửa')]")).click();

    }

    @And("enter new name{string} and newdicription {string} and newimgae {string} and slect new option and click button edit")
    public void enterNewNameAndNewdicriptionAndNewimgaeAndSlectNewOptionAndClickButtonEdit(String name, String dicrip, String image) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputName']")).clear();
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@id='inputDescription']")).clear();
        driver.findElement(By.xpath("//textarea[@id='inputDescription']")).sendKeys(dicrip);
        driver.findElement(By.xpath("//input[@id='inputimage']")).clear();
        driver.findElement(By.xpath("//input[@id='inputimage']")).sendKeys(image);
        Select select =new Select(driver.findElement(By.name("status")));
        select.selectByVisibleText("Open");
        Helpers.delay(1);
        select = new Select(driver.findElement(By.name("category_id")));
        select.selectByVisibleText("php");
        Helpers.delay(1);
        select = new Select(driver.findElement(By.name("user_id")));
        select.selectByVisibleText("admin");
        driver.findElement(By.xpath("//button[contains(text(),'Cập nhật Khóa học')]")).click();

    }

    @Then("data of category edit secessfull")
    public void dataOfCategoryEditSecessfull() {
        String checkitem1= driver.findElement(By.xpath("//td[2]")).getText();
        Assert.assertEquals(checkitem1,"php", "foul, please check!");
        String checkitem2= driver.findElement(By.xpath("//td[contains(text(),'c PHP không')]")).getText();
        Assert.assertEquals(checkitem2,"học PHP không dễ", "foul, please check!");
    }
}
