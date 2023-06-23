package toolsQA.tests.elementsTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import toolsQA.tests.BaseTest;

public class CheckBoxTest extends BaseTest {


    @Test //ID:003 Verify that the "Home" check box will be half-checked if some of the daughter cells are checked
    public void homeCheckBoxTest1() {
        getCheckBoxPage().open();
        getCheckBoxPage().expand();
        getCheckBoxPage().getDesktopCheckBox().click();
//        getWait().until(ExpectedConditions.attributeToBe(getCheckBoxPage().getDesktopCheckBox(),
//                "class",
//                "rct-icon rct-icon-check"));
        Assert.assertEquals(getCheckBoxPage().getHomeCheckBox().getAttribute("class"),
                "rct-icon rct-icon-half-check");
    }

    @Test //ID:004 Verify that the "Home" check box will be checked if all of the daughter cells are checked
    public void homeCheckBoxTest2() {
        getCheckBoxPage().open();
        getCheckBoxPage().expand();
        getCheckBoxPage().getDesktopCheckBox().click();
        getCheckBoxPage().getDocumentsCheckBox().click();
        getCheckBoxPage().getDownloadsCheckBox().click();
        Assert.assertEquals(getCheckBoxPage().getHomeCheckBox().getAttribute("class"),
                "rct-icon rct-icon-check");
    }

    @Test
    public void desktopCheckBoxTest1(){
        getCheckBoxPage().open();
        getCheckBoxPage().expand();
        getCheckBoxPage().getCommandsCheckBox().click();
        Assert.assertEquals(getCheckBoxPage().getDesktopCheckBox().getAttribute("class"),
                "rct-icon rct-icon-half-check");
        Assert.assertEquals(getCheckBoxPage().getHomeCheckBox().getAttribute("class"),
                "rct-icon rct-icon-half-check");
    }

    @Test
    public void desktopCheckBoxTest2(){
        getCheckBoxPage().open();
        getCheckBoxPage().expand();
        getCheckBoxPage().getCommandsCheckBox().click();
        getCheckBoxPage().getNotesCheckBox().click();
        Assert.assertEquals(getCheckBoxPage().getDesktopCheckBox().getAttribute("class"),
                "rct-icon rct-icon-check");
        Assert.assertEquals(getCheckBoxPage().getHomeCheckBox().getAttribute("class"),
                "rct-icon rct-icon-half-check");
    }
}
