package toolsQA.pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;



public class ButtonsPage extends BasePage {

    private WebElement doubleClickBtn;
    private WebElement rightClickBtn;
    private WebElement clickMeBtn;
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement dynamicClickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickBtn() {
        this.doubleClickBtn = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickBtn;
    }

    public WebElement getRightClickBtn() {
        this.rightClickBtn = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickBtn;
    }

    public WebElement getClickMeBtn() {
            this.clickMeBtn = getDriver().findElement(
                    By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
            return clickMeBtn;
    }

    public WebElement getDoubleClickMessage() {

            this.doubleClickMessage = getDriver().findElement(By.id("doubleClickMessage"));
            return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        this.rightClickMessage = getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMessage;
    }

    public WebElement getDynamicClickMessage() {
        this.dynamicClickMessage = getDriver().findElement(By.id("dynamicClickMessage"));
        return dynamicClickMessage;
    }

    public void Open(){
        getDriver().navigate().to("https://demoqa.com/buttons");
    }

    public void rightClick(WebElement element){
        Actions actions = new Actions(getDriver());
        actions.contextClick(element).perform();
    }

    public void doubleClick(WebElement element){
        Actions actions = new Actions(getDriver());
        actions.doubleClick(element).perform();
    }
}
