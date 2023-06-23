package toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{

    private WebElement elements;
    private WebElement forms;
    private WebElement alertsFrameWin;
    private WebElement widgets;
    private WebElement interactions;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getElements() {
        this.elements = getDriver().findElement(
                By.xpath("/html/body/div[2]/div/div/div[2]/div/div[5]/div/div[2]/svg/path"));
        return elements;
    }

    public WebElement getForms() {
        this.forms = getDriver().findElement(
                By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[2]/svg/g/path"));
        return forms;
    }

    public WebElement getAlertsFrameWin() {
        this.alertsFrameWin = getDriver().findElement(
                By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[2]/svg/path"));
        return alertsFrameWin;
    }

    public WebElement getWidgets() {
        this.widgets = getDriver().findElement(
                By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[2]/svg/path"));
        return widgets;
    }

    public WebElement getInteractions() {
        this.interactions = getDriver().findElement(
                By.xpath("/html/body/div[2]/div/div/div[2]/div/div[5]/div/div[2]/svg/path"));
        return interactions;
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/");
    }
}
