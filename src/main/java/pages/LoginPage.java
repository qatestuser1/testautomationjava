package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By userPassword = By.id("password");
    private By LoginBtn = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(userPassword).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(LoginBtn).click();
        return new SecureAreaPage(driver);
    }
}
