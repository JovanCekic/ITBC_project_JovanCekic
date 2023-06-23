package toolsQA.tests.elementsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import toolsQA.tests.BaseTest;

public class TextBoxTest extends BaseTest {

    @Test //ID:001 Verify that the "Email" field will not accept an invalid format for email
    public void invalidEmail(){
        getTextBoxPage().open();
        getTextBoxPage().getEmail().sendKeys("name@examplecom");
        getTextBoxPage().getSubmitButton().click();
        Assert.assertEquals(getTextBoxPage().getEmail().getAttribute("class"), "mr-sm-2 field-error form-control");
    }

}

