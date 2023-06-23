package toolsQA.pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class ElementsPage extends BasePage {

    private WebElement textBox;
    private WebElement checkBox;
    private WebElement radioButton;
    private WebElement webTables;
    private WebElement buttons;
    private WebElement links;
    private WebElement brokenLinks;
    private WebElement upAndDownload;
    private WebElement dynamicProperties;

    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getTextBox() {
        this.textBox = getDriver().findElement(By.id("item-0"));
        return textBox;
    }

    public WebElement getCheckBox() {
        this.checkBox = getDriver().findElement(By.id("item-1"));
        return checkBox;
    }

    public WebElement getRadioButton() {
        this.radioButton = getDriver().findElement(By.id("item-2"));
        return radioButton;
    }

    public WebElement getWebTables() {
        this.webTables = getDriver().findElement(By.id("item-3"));
        return webTables;
    }

    public WebElement getButtons() {
        this.buttons = getDriver().findElement(By.id("item-4"));
        return buttons;
    }

    public WebElement getLinks() {
        this.links = getDriver().findElement(By.id("item-5"));
        return links;
    }

    public WebElement getBrokenLinks() {
        this.brokenLinks = getDriver().findElement(By.id("item-6"));
        return brokenLinks;
    }

    public WebElement getUpAndDownload() {
        this.upAndDownload = getDriver().findElement(By.id("item-7"));
        return upAndDownload;
    }

    public WebElement getDynamicProperties() {
        this.dynamicProperties = getDriver().findElement(By.id("item-8"));
        return dynamicProperties;
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/elements");
    }
}
