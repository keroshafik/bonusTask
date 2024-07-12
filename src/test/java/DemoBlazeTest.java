import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class DemoBlazeTest {
    private WebDriver driver;
    private String baseUrl = "https://www.demoblaze.com/";

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testUserRegistration() {
        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click on Sign Up link
        WebElement signUpLink = driver.findElement(By.id("signin2"));
        signUpLink.click();

        // Fill registration form
        WebElement usernameField = driver.findElement(By.id("sign-username"));
        WebElement passwordField = driver.findElement(By.id("sign-password"));
        WebElement signUpButton = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));


        usernameField.sendKeys("thisisautomatedcase");
        passwordField.sendKeys("thisisautomatedcase");
        signUpButton.click();

    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 2)
    public void testUserLogin() {
        driver.get(baseUrl);

        // Click on Login link
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();

        // Fill login form
        WebElement usernameField = driver.findElement(By.id("loginusername"));
        WebElement passwordField = driver.findElement(By.id("loginpassword"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        usernameField.sendKeys("thisisautomatedcase");
        passwordField.sendKeys("thisisautomatedcase");
        loginButton.click();

    }

    @Test(priority = 3)
    public void testUserLogout() {
        driver.get(baseUrl);

        // Click on Login link
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();

        // Fill login form
        WebElement usernameField = driver.findElement(By.id("loginusername"));
        WebElement passwordField = driver.findElement(By.id("loginpassword"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        usernameField.sendKeys("thisisautomatedcase");
        passwordField.sendKeys("thisisautomatedcase");
        loginButton.click();

        // Click on Logout button
        WebElement logoutButton = driver.findElement(By.xpath("//a[@id='logout2']"));
        logoutButton.click();

        // Verify logout success
    }

    @Test(priority = 4)
    public void testOrderCreation() {
        driver.get(baseUrl);

        // Click on Login link
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();

        // Fill login form
        WebElement usernameField = driver.findElement(By.id("loginusername"));
        WebElement passwordField = driver.findElement(By.id("loginpassword"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        usernameField.sendKeys("thisisautomatedcase");
        passwordField.sendKeys("thisisautomatedcase");
        loginButton.click();

        // Click on a hyperlink ( monitor )
        WebElement productLink = driver.findElement(By.xpath("(//a[@id='itemc'])[3]"));
        productLink.click();

        //im blocked at this step because of website issue

    }
}
