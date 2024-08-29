package ui.mobile.test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.appmanagement.BaseOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.mobile.test.dto.User;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class MobileUITest {
    static AndroidDriver driver;
    static User  user;
    static WebDriverWait wait;
    @BeforeAll
    public static void initializer(){
        user = new User();
        var options = new DesiredCapabilities();
        options.setCapability("platformName","android");
        options.setCapability("appium:automationName","UiAutomator2");
        options.setCapability("appium:unicodeKeyboard",true);
        options.setCapability("appium:resetKeyboard",true);
                ;
        try {
            driver = new AndroidDriver(
                    // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                    URI.create("http://127.0.0.1:4723").toURL(), options
            );
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }catch (Exception ex)
        {
            throw new RuntimeException("unable to start the driver");
        }
    }

    @Test
    @Order(1)
    public void test_01()
    {
        //Tap on signup
        var signUpButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\" Sign Up\")"));
        signUpButton.click();
        //Enter name
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter name\")")));
        var nameInputText = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter name\")"));
        nameInputText.sendKeys(user.getFullName());
        //Enter email
        var emailInputText = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter email\")"));
        emailInputText.sendKeys(user.getEmail());
        //Enter password
        var passwordInputText = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter password\")"));
        passwordInputText.sendKeys(user.getPassword());
        //Tap on sign up Button
        var completeSignUpButton = driver.findElement(AppiumBy.accessibilityId(" Sign Up"));
        completeSignUpButton.click();
    }
@Test
@Order(2)
public void test_02()
    {

wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"\")")));
        var settingsButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"\")"));
        settingsButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Account\")")));
        var accountButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Account\")"));
        accountButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Logout\")")));
        var logoutButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Logout\")"));
        logoutButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("android:id/button2")));
        var confirmationButton = driver.findElement(AppiumBy.id("android:id/button2"));
        confirmationButton.click();
    }

@Test
@Order(3)
public void test_03()
    {
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter email\")")));
        var emailInputText = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter email\")"));
        emailInputText.sendKeys(user.getEmail());
        var passwordInputText = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter password\")"));
        passwordInputText.sendKeys(user.getPassword());
        var loginButton = driver.findElement(AppiumBy.accessibilityId(" Log In"));
        loginButton.click();
    }
@Test
@Order(4)
    public void test_04()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"\")")));
        var settingsButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"\")"));
        settingsButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Account\")")));
        var accountButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Account\")"));
        accountButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Delete my account\")")));
        var deleteButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Delete my account\")"));
        deleteButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("android:id/button2")));
        var confirmationButton = driver.findElement(AppiumBy.id("android:id/button2"));
        confirmationButton.click();
    }

    @AfterAll
    public static void closeDriver()  {
            driver.quit();
    }
}
