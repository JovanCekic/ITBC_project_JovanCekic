package toolsQA.tests.elementsTests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import toolsQA.tests.BaseTest;

public class ButtonsTest extends BaseTest {

    @Test //ID:014 Verify that the "Click Me" button activates only by left-clicking on it
    public void clickBtnTest(){
        getButtonsPage().Open();
        getButtonsPage().rightClick(getButtonsPage().getClickMeBtn());
        try {
            Assert.assertFalse(getButtonsPage().getDynamicClickMessage().isDisplayed());
        } catch (NoSuchElementException e){
            getButtonsPage().getClickMeBtn().click();
        }
        Assert.assertEquals(getButtonsPage().getDynamicClickMessage().getText(), "You have done a dynamic click");
    }

    @Test //ID:013 Verify that the "Right Click Me" button activates only by right-clicking on it
    public void rightClickBtnTest(){
        getButtonsPage().Open();
        getButtonsPage().getRightClickBtn().click();
        try {
            Assert.assertFalse(getButtonsPage().getRightClickMessage().isDisplayed());
        } catch (NoSuchElementException e){
            getButtonsPage().doubleClick(getButtonsPage().getRightClickBtn());
        }
        try {
            Assert.assertFalse(getButtonsPage().getRightClickMessage().isDisplayed());
        } catch (NoSuchElementException e){
            getButtonsPage().rightClick(getButtonsPage().getRightClickBtn());
        }
        Assert.assertEquals(getButtonsPage().getRightClickMessage().getText(), "You have done a right click");
    }

    @Test //ID:012 Verify that the "Double Click Me" button activates only by left-double-clicking on it
    public void doubleClickBtnTest(){
        getButtonsPage().Open();
        getButtonsPage().getDoubleClickBtn().click();
        try {
            Assert.assertFalse(getButtonsPage().getDoubleClickMessage().isDisplayed());
        } catch (NoSuchElementException e){
            getButtonsPage().rightClick(getButtonsPage().getDoubleClickBtn());
        }
        try {
            Assert.assertFalse(getButtonsPage().getDoubleClickMessage().isDisplayed());
        } catch (NoSuchElementException e){
            getButtonsPage().doubleClick(getButtonsPage().getDoubleClickBtn());
        }
        Assert.assertEquals(getButtonsPage().getDoubleClickMessage().getText(), "You have done a double click");
    }
}
