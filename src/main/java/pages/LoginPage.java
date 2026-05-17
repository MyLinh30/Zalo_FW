package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private AppiumDriver driver;
    public LoginPage(AppiumDriver driver){
        this.driver = driver;
    }
    private By phoneInput = By.id("com.zing.zalo:id/edt_form_content");
    private By agreeAndContinueBtn = By.id("com.zing.zalo:id/btnNext");
    private By passwordInput = By.xpath("//android.widget.EditText[@text='Nhập mật khẩu']");    private By loginBtn = By.id("com.zing.zalo:id/btnLogin");
    private By continueBtn = By.id("com.zing.zalo:id/btnNext");

    public void enterPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void enterPassword(String password) {
       driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginBtn))
                .click();
    }

    public void clickAgreeAndContinueBtn() {
        driver.findElement(agreeAndContinueBtn).click();
    }

    public void clickContinueBtn() {
        driver.findElement(continueBtn).click();
    }
}
