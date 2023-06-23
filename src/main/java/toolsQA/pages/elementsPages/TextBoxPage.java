package toolsQA.pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class TextBoxPage extends BasePage {

    private WebElement fullName;
    private WebElement email;
    private WebElement currentAddress;
    private WebElement permanentAddress;
    private WebElement submitButton;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullName() {
        this.fullName = getDriver().findElement(By.id("userName"));
        return fullName;
    }

    public WebElement getEmail() {
        this.email = getDriver().findElement(By.id("userEmail"));
        return email;
    }

    public WebElement getCurrentAddress() {
        this.currentAddress = getDriver().findElement(By.id("currentAddress"));
        return currentAddress;
    }

    public WebElement getPermanentAddress() {
        this.permanentAddress = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddress;
    }

    public WebElement getSubmitButton() {
        this.submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/text-box");
    }
}
