package toolsQA.tests.elementsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import toolsQA.tests.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test //ID:005 Verify that the "Yes" button can be selected
    public void yesButtonTest(){
        getRadioButtonPage().open();
        getRadioButtonPage().Click(getRadioButtonPage().getYesButton());
        getWait().until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@class=\"text-success\"]")));
        Assert.assertEquals(getRadioButtonPage().getSelectionMessage().getText(), "Yes");
    }

    @Test //ID:006 Verify that the "Impressive" button can be selected
    public void impressiveButtonTest(){
        getRadioButtonPage().open();
        getRadioButtonPage().Click(getRadioButtonPage().getImpressiveButton());
        getWait().until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@class=\"text-success\"]")));
        Assert.assertEquals(getRadioButtonPage().getSelectionMessage().getText(), "Impressive");
    }

    @Test //ID:007 Verify that the "No" button can be selected
    public void noButtonTest(){
        getRadioButtonPage().open();
        getRadioButtonPage().Click(getRadioButtonPage().getNoButton());
        getWait().until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@class=\"text-success\"]")));
        Assert.assertEquals(getRadioButtonPage().getSelectionMessage().getText(), "No");
    }
}
